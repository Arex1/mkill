package com.arex.mkillprovider.mapper;

import com.arex.mkillapi.model.TestModel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestModelMapper extends BaseMapper<TestModel> {
    int insert(@Param("testModel") TestModel testModel);

    int insertSelective(@Param("testModel") TestModel testModel);

    int insertList(@Param("testModels") List<TestModel> testModels);

    int update(@Param("testModel") TestModel testModel);

    List<TestModel> findByIdGreaterThan(@Param("minId")Integer minId);
}