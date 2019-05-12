package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Note {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String message;
    private Date date;
    private boolean done;

    public Note() {
    }

    public Note(String message) {
        this.message = message;
        this.date = new Date();
        this.done = false;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean finished) {
        this.done = finished;
    }
}
