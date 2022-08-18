package java8features;

public class MethodReference2 {

	public static void main(String[] args) {

		Thread th = new Thread(MethodReference2 :: threadstatus);
		th.start();
	}
	
	public static void threadstatus() { //static reference
		System.out.println(Thread.currentThread().getName());
	}
	
}
