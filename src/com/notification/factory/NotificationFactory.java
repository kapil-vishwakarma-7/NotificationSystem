package com.notification.factory;

import com.notification.constants.NotificationType;
import com.notification.entity.*;

import java.util.Date;

public class NotificationFactory {

    public Notification generateNotification(String message, Date date, NotificationType notificationType){
        if (notificationType == NotificationType.ANDROID_NOTIFICATION){
            return new AndroidNotification(message,date);
        } else if (notificationType == NotificationType.EMAIL_NOTIFICATION) {
            return new EmailNotification(message, date);
        } else if (notificationType == NotificationType.IOS_NOTIFICATION) {
            return new IOSNotification(message,date);
        } else if (notificationType == NotificationType.SMS_NOTIFICATION) {
            return new SMSNotification(message, date);
        }
        return null;
    }
}
