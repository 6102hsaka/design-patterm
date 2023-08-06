package practice.design.pattern.creational.factory;

/**
 * Child of Notification to send SMS Notification
 * 
 * @author Akash Sharma
 *
 */
public class SMSNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("Sending SMS Notification");
	}

}
