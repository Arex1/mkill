package com.arex.mkillconsumer.listener;

import com.alibaba.dubbo.common.utils.StringUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.parsers.FactoryConfigurationError;
import java.io.IOException;
import java.net.URL;

@SuppressWarnings("deprecation")
public class SystemInitListener implements ServletContextListener {

    /**
     * context init
     */
    @Override
    public void contextInitialized(ServletContextEvent event) {
        try {
            URL log4jPath = findCurURL();
            if (log4jPath != null) {
                //############ 不可删除 #############
                System.setProperty("dubbo.application.logger","slf4j");
            }
        } catch (Exception | FactoryConfigurationError e) {
            e.printStackTrace();
        } finally {
//          Log4jWebConfigurer.initLogging(event.getServletContext());
        }
    }

    /**
     * context destroy
     */
    @Override
    public void contextDestroyed(ServletContextEvent event) {
    }


    public static Resource[] getResourcesForClasspathByPath(String path) throws IOException {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        if(StringUtils.isEmpty(path)){
            return null;
        }
        if(!path.startsWith("classpath*:")){
            path = "classpath*:"+path;
        }
        Resource[] resources = resolver.getResources(path);
        return resources;
    }

    public static URL findCurURL()throws Exception {
        //------ (一 )获取当前运行的profiles
        String profiles = System.getProperty("profiles");
        System.out.println("---------------- profile is : " + profiles + " ----------------");
        //------ (二 )加载不同profile下的log4j2.xml文件
        String log4Path = "log4j2-"+profiles+".xml";
        System.out.println("---------------- logPath is : " + log4Path + " ----------------");
        //------ (三 )为系统属性参数 log4j.configurationFile 赋值
        System.setProperty("log4j.configurationFile", "log4j2-"+profiles+".xml");
        Resource[] resources = getResourcesForClasspathByPath(log4Path);
        if (resources != null) {
            for (Resource res : resources) {
                System.out.println(res.getURL().getPath());
                String path = res.getURL().getPath();

                String[] array = path.split("/");

                String jarName = array[array.length - 2];

                if (jarName.startsWith("app-wms") || jarName.startsWith("classes")) {
                    return res.getURL();
                }
            }
            return resources[0].getURL();
        }
        return null;
    }

}
