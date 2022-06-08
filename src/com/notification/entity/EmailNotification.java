package com.notification.entity;

import java.util.Date;

public class EmailNotification extends Notification{

    public EmailNotification(String message, Date date) {
        super(message, date);
    }
}
