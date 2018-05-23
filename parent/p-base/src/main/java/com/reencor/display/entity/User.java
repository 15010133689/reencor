package com.reencor.display.entity;


import com.reencor.base.BaseEntity;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@ToString
@Getter
@Setter
@Entity
@Table(name = "reen_user")
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    @Id
    @Column(name = "userid")
    private String userId;
    @Column(name = "username")
    private String userName;
    @Column(name = "age")
    private Integer age;
}
