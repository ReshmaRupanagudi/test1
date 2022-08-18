package java8features;

/*An Interface that contains exactly one abstract method is known as functional interface.
 *  It can have any number of default, static methods but can contain only one abstract method. 
 *  It can also declare methods of object class.
 *  Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
 *  It is a new feature in Java, which helps to achieve functional programming approach.
 */

public class FunctionalInterfaceTest implements  Java8FuncionalInterface {

	public static void main(String[] args) {

		Java8FuncionalInterface obj = new FunctionalInterfaceTest();
		obj.message();
		
				//	(or)
		
		Java8FuncionalInterface obj1 = () -> System.out.println("java 8 functional Interface");
		obj1.message();

	}
	
	
	@Override
	public void message() {
		System.out.println("java 8 functional interface example");
	}
}

@FunctionalInterface
interface Java8FuncionalInterface {
	
	public void message();
	
	public static void test1() {
		System.out.println("static method");
	}
	
	public  default void test3() {
		System.out.println("default method");
	}
	
}