package com.notification.service;

import com.notification.entity.IOSNotification;

public class IOSService {
    private static IOSService iosService = null;
    private IOSService(){

    }

    public static IOSService getInstance(){
        if(iosService == null){
            iosService = new IOSService();
        }
        return iosService;
    }

    public void sendNotification(IOSNotification notification){
        System.out.println( "IOS-" + "Send Notification - " + notification.getMessage() + ", " + notification.getDate().toString());
    }
}
