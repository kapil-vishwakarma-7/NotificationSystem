package com.notification.service;

import com.notification.entity.EmailNotification;

public class EmailService {
    private static EmailService emailService = null;
    private EmailService(){

    }

    public static EmailService getInstance(){
        if(emailService == null){
            emailService = new EmailService();
        }
        return emailService;
    }

    public void sendNotification(EmailNotification notification) {
        System.out.println( "Email-" + "Send Notification - " + notification.getMessage() + ", " + notification.getDate().toString());
    }
}
