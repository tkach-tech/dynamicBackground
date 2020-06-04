package co.notime.intellijPlugin.backgroundImagePlus;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;

class NotificationCenter {

    static void notice(String message) {
        Notification n = new Notification(
                "extras",
                "Notice",
                message,
                NotificationType.INFORMATION);
        Notifications.Bus.notify(n);
    }

}
