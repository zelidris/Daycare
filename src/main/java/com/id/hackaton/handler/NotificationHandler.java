package com.id.hackaton.handler;

import com.id.hackaton.MailApplication;
import com.id.hackaton.notification.GenericNotification;

import javax.mail.MessagingException;
import java.io.IOException;

public class NotificationHandler {

    public static void handleFoodMessage(GenericNotification notification) throws MessagingException, IOException {
        System.out.printf("Triggered " + notification.getEmail() + " " + notification.getType() + "\n" );
        if(notification.getNotification().contains("\"Food\":true") && notification.getPreferences().contains("\"Email\":true")) MailApplication.sendmail(notification.getEmail(),notification.getType());
    }

    public static void handleNapMessage(GenericNotification notification) throws MessagingException, IOException {
        System.out.printf("Triggered " + notification.getEmail() + " " + notification.getType() + "\n" );
        System.out.printf("Triggered " + notification.getNotification() + " " + notification.getPreferences() + "\n" );
        if(notification.getNotification().contains("\"Naptime\":true") && notification.getPreferences().contains("\"Email\":true")) MailApplication.sendmailNap(notification.getEmail(),notification.getStarttime(),notification.getEndtime());
    }

    public static void handlePlayMessage(GenericNotification notification) throws MessagingException, IOException {
        System.out.printf("Triggered " + notification.getEmail() + " " + notification.getType() + "\n" );
        if(notification.getNotification().contains("\"Playtime\":true") && notification.getPreferences().contains("\"Email\":true")) MailApplication.sendmail(notification.getEmail(),notification.getType());
    }

    public static void handleHealthMessage(GenericNotification notification) throws MessagingException, IOException {
        System.out.printf("Triggered " + notification.getEmail() + " " + notification.getType() + "\n" );
        if(notification.getNotification().contains("\"Health\":true") && notification.getPreferences().contains("\"Email\":true")) MailApplication.sendmail(notification.getEmail(),notification.getType());
    }

}
