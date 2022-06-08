package com.notification.service;

import com.notification.entity.AndroidNotification;

public class AndroidService {
    private static AndroidService androidService = null;
    private AndroidService(){

    }

    public static AndroidService getInstance(){
        if(androidService == null){
            androidService = new AndroidService();
        }
        return androidService;
    }

    public void sendNotification(AndroidNotification notification) {
        System.out.println( "Android-" + "Send Notification - " + notification.getMessage() + ", " + notification.getDate().toString());
    }
}
