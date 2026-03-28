package org.example.oops;
@FunctionalInterface
public interface NotificationService {
    String sendNotification(String to, String subject);
    default String saveNotification(String to, String subject){
        return sendNotification(to, subject);
    }
}