package com.regression.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by purushtoman on 6/6/17.
 */
@Entity
@Table(name = "goals")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int goalId;
    private int mentee_id;
    private Integer mentor_id;


    private String title;
    private String description;
    private Date start_date;
    private Date end_date;
    private int expertise_id;
    private int status;
    private Date created_at;
    private Date updated_at;

//    public Goal(int mentee_id,int mentor_id,String title,String description, Date start_date, Date end_date, int expertise_id, int status, Date created_at, Date updated_at){
//
//    }

    public Goal(){

    }

    public Goal(int mentee_id, Integer mentor_id, String title, String description, Date start_date, Date end_date,
                int expertise_id, int status, Date created_at, Date updated_at){
        this.mentee_id = mentee_id;
        this.mentor_id = mentor_id;
        this.title = title;
        this.description = description;
        this.expertise_id = expertise_id;
        this.status = status;
        this.start_date = start_date;
        this.end_date = end_date;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getGoalId() {
        return goalId;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    public int getMentee_id() {
        return mentee_id;
    }

    public void setMentee_id(int mentee_id) {
        this.mentee_id = mentee_id;
    }

    public Integer getMentor_id() {
        return mentor_id;
    }

    public void setMentor_id(Integer mentor_id) {
        this.mentor_id = mentor_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getExpertise_id() {
        return expertise_id;
    }

    public void setExpertise_id(int expertise_id) {
        this.expertise_id = expertise_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString(){
        return String.format("Goal[goal_id=%d, mentee_id=%d, mentor_id=%d,title='%s', description='%s'," +
                        " start_date='%s',end_date='%s',expertise_id=%d,status=0, created_at='%s', updated_at='%s']",
                goalId,mentee_id,mentor_id,title,description,start_date,end_date,expertise_id,status, created_at, updated_at);
    }


}

