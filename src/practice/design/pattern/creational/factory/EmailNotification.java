package practice.design.pattern.creational.factory;

/**
 * Child of Notification to send Email Notification
 * 
 * @author Akash Sharma
 *
 */
public class EmailNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("Sending Email Notification");
	}

}
