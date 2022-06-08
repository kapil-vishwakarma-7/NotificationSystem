package com.notification.entity;

import java.util.Date;

public abstract class Notification {
    protected String message;
    protected Date date;

    public Notification(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){
        return message;
    }
    public Date getDate(){
        return date;
    }
}
