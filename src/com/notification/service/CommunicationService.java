package com.notification.service;

import com.notification.entity.*;

public class CommunicationService {
    private static CommunicationService communicationService = null;
    private AndroidService androidService;
    private IOSService iosService;
    private EmailService emailService;
    private SMSService smsService;

    private CommunicationService(){
        androidService = AndroidService.getInstance();
        iosService = IOSService.getInstance();
        emailService = EmailService.getInstance();
        smsService = SMSService.getInstance();
    }

    public void SendNotification(Notification notification){
        if(notification instanceof AndroidNotification){
            androidService.sendNotification((AndroidNotification) notification);
        }else if(notification instanceof IOSNotification){
            iosService.sendNotification((IOSNotification) notification);
        }else if (notification instanceof EmailNotification){
            emailService.sendNotification((EmailNotification) notification);
        }else if (notification instanceof SMSNotification){
            smsService.sendNotification((SMSNotification) notification);
        }
    }

    public static CommunicationService getInstance(){
        if(communicationService == null){
            communicationService = new CommunicationService();
        }
        return communicationService;
    }

}
