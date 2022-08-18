package basic.exceptions;

public class UncheckedExceptionPropogation {
	
	public static void main (String[] args) {
		method1();
		System.out.println("After calling method");
	}
	
	static void method1() {
		method2();
	}

	static void method2() {
		method3();
	}

	static void method3() {
		throw new NullPointerException();
	}

}

/*Let’s see step by step what happened in above program >
JVM called main method
step 1 - main called method1()
step 2 - method1 called method2()
step 3 - method2 called method3()
step 4 - method3 automatically propagated exception to method2() [because, unchecked exceptions are propagated automatically]
step 5 - method2 automatically propagated exception to method1() [because, unchecked exceptions are propagated automatically]
step 6 - method2 automatically propagated exception to main() [because, unchecked exceptions are propagated automatically]
main() automatically propagated exception to JVM [because, unchecked exceptions are propagated automatically]
*/