package java8features;
/*
 * Method reference uses function as a parameter to invoke a method.
 * It is compact and easy form of lambda expression. Each time when you are using 
 * lambda expression to just referring a method, you can replace your 
 * lambda expression with method reference.
 * 		
 * 3 types 
 * 1)Reference to static method
 * 2)Reference to instance method
 * 3)Reference to constructor
 */

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		MethodRefInterface ex = MethodReferenceExample::testMethod; //reference to static method
		ex.say();

	}
	
	public static void testMethod() {
		System.out.println("test method executed");
	}
}

@FunctionalInterface
interface MethodRefInterface {
	
	void say();
	
}
