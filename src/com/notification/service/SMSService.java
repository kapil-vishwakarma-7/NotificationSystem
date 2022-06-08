package com.notification.service;

import com.notification.entity.SMSNotification;

public class SMSService {
    private static SMSService smsService = null;
    private SMSService(){

    }

    public static SMSService getInstance(){
        if(smsService == null){
            smsService = new SMSService();
        }
        return smsService;
    }

    public void sendNotification(SMSNotification notification){
        System.out.println( "SMS-" + "Send Notification - " + notification.getMessage() + ", " + notification.getDate().toString());
    }
}
