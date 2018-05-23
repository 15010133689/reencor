package com.reencor.base;

import javax.persistence.EntityManager;
import javax.persistence.MappedSuperclass;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.io.Serializable;

/**
 * Created by zqw on 2017/6/2.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    public BaseEntity() {
    }
}
