package com.regression.models;

import javax.persistence.*;
import java.text.ParseException;
import java.util.Date;

/*
* This Java source file was generated by the Gradle 'init' task.
*/
@Entity
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name = "sender_id")
    private int sender_id;
    @Column(name = "receiver_id")
    private int receiver_id;
    @Column(name = "goal_id")
    private int goal_id;
    @Column(name = "status")
    private int status;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;


    public Request(){

    }

    public Request(int sender_id, int goal_id, int receiver_id, int status, Date created_at, Date updated_at) throws ParseException {
        this.sender_id = sender_id;
        this.receiver_id = receiver_id;
        this.goal_id = goal_id;
        this.status = status;
//      System.out.println("created_at: "+created_at);
//      System.out.println("updated_at: "+updated_at);
        this.created_at = created_at;
        this.updated_at = updated_at;
    }


    @Override
    public String toString(){
        return String.format("com.regression.Application.Request[id=%d, sender_id=%d, goal_id=%d, receiver_id=%d, status=0, created_at='%s', " +
                "updated_at='%s']",id,sender_id,goal_id, receiver_id,created_at, updated_at);
    }

}