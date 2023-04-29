package week1.day1;

public class Mobile {
	public void sendSMS() {
		System.out.println("Message Sent");
		// TODO Auto-generated method stub

	}
	protected void allowVoicecall() {
		System.out.println("Allow voice call");
		// TODO Auto-generated method stub

	}
	private void takeVideo() {
		System.out.println("Take Video");
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Mobile asus = new Mobile();
		asus.sendSMS();
		asus.allowVoicecall();
		asus.takeVideo();
		System.out.println("asus model");
	}
	

}
