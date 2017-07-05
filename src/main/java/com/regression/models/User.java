package com.regression.models;


import javax.persistence.*;

/**
 * Created by purushtoman on 7/6/17.
 */
@Entity
@Table(name = "usertable")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "userId")
    private int userId;
    @Column(name = "role")
    private int role;


    public User(){

    }

    public User(int userId,int role){
        this.userId = userId;
        this.role = role;
    }

    @Override
    public String toString(){
        return String.format("User[userId=%d, name=%d",userId,role);
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
