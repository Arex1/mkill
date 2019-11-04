package com.arex.mkillprovider.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi.model
 * 2019/11/2
 */
public abstract class BaseModel implements Serializable {
    private static final long serialVersionUID = -8942006745461098259L;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static <T extends BaseModel> Map<Long, T> idModelMap(Collection<T> list) {
        Map<Long, T> map = new HashMap<>(16);
        if (null == list || 0 == list.size()) {
            return map;
        }
        for (T model :
                list) {
            map.put(model.getId(), model);
        }
        return map;
    }
}
