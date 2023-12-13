package week1.day2;
public class Mobile {
public static void main(String[] args) {
		
		Mobile smart=new Mobile();
		
		smart.makeCall();
		smart.sendMessage();
		smart.shareDocument();
		
	}
	
	public void sendMessage() {
		
		System.out.println("Message is sent");
	}	
	public void shareDocument() {
		
		System.out.println("Document is shared");
	}
	public void makeCall() {
		
		System.out.println("calling");
	}

}

