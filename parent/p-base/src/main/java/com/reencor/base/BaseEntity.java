package com.reencor.base;

import javax.persistence.EntityManager;
import javax.persistence.MappedSuperclass;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by zqw on 2017/6/2.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    public BaseEntity() {
    }
    public String getObjectId() {
        return  UUID.randomUUID().toString().replaceAll("-", "");
    }
}
