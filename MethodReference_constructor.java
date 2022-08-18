package java8features;

public class MethodReference_constructor {

	public static void main(String[] args) {
		Message m = MessageClass :: new;
		m.printMessage("test");

	}

}

class MessageClass{
	
	MessageClass(String msg){
		
		System.out.println("Message :"+ msg);
	}
}


interface Message{
	
	public void printMessage(String s);
}