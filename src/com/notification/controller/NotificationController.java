package com.notification.controller;

import com.notification.constants.NotificationType;
import com.notification.entity.AndroidNotification;
import com.notification.entity.Notification;
import com.notification.factory.NotificationFactory;
import com.notification.service.CommunicationService;

import java.util.Date;

public class NotificationController {
    private static NotificationFactory notificationFactory = new NotificationFactory();
    private static CommunicationService communicationService = CommunicationService.getInstance();
    public static void main(String[] args) {
        sendAndroidNotification("First Android Notification", new Date());
        sendIOSNotification("First IOS Notification", new Date());
        sendEmailNotification("First Email Notification", new Date());
        sendSMSNotification("First SMS Notification", new Date());
    }

    private static void sendAndroidNotification(String message, Date date){
        Notification notification = notificationFactory.generateNotification(message, date, NotificationType.ANDROID_NOTIFICATION);
        communicationService.SendNotification(notification);
    }
    private static void sendIOSNotification(String message, Date date){
        Notification notification = notificationFactory.generateNotification(message, date, NotificationType.IOS_NOTIFICATION);
        communicationService.SendNotification(notification);
    }
    private static void sendEmailNotification(String message, Date date){
        Notification notification = notificationFactory.generateNotification(message, date, NotificationType.EMAIL_NOTIFICATION);
        communicationService.SendNotification(notification);
    }
    private static void sendSMSNotification(String message, Date date){
        Notification notification = notificationFactory.generateNotification(message, date, NotificationType.SMS_NOTIFICATION);
        communicationService.SendNotification(notification);
    }
}
