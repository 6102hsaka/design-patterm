package practice.design.pattern.creational.factory;

/**
 * Factory class to get Notification instance
 * 
 * @author Akash Sharma
 *
 */
public class NotificationFactory {

	/**
	 * Get Instance of Notification based on NotificationType
	 * 
	 * @param notificationType
	 */
	public static Notification getNotificationInstance(NotificationType notificationType) {
		return switch (notificationType) {
		case SMS -> new SMSNotification();
		case EMAIL -> new EmailNotification();
		};
	}
}
