package com.reencor.display.entity;


import lombok.*;


@ToString
@Getter
@Setter
public class User {
    private String userName;
    private String teleNumber;
    public User(String userName,String teleNumber){
        this.userName=userName;
        this.teleNumber=teleNumber;
    }
}
