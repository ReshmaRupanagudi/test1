package basic.exceptions;

import java.io.FileNotFoundException;

public class CheckedExceptionPropogation {
	
	public static void main (String[] args) throws FileNotFoundException {
		method1();
		System.out.println("After calling method");
	}
	
	static void method1() throws FileNotFoundException {
		method2();
	}

	static void method2() throws FileNotFoundException {
		method3();
	}

	static void method3() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
}

/*
Let�s see step by step what happened in above program >
JVM called main method
step 1 - main called method1()
step 2 - method1 called method2()
step 3 - method2 called method3()
step 4 - method3 propagated exception to method2() using throws keyword.[because, checked exceptions are not propagated automatically]
step 5 - method2 propagated exception to method1() using throws keyword.[because, checked exceptions are not propagated automatically]
step 6 - method1 propagated exception to main() using throws keyword.[because, checked exceptions are not propagated automatically]
main() propagated exception to JVM using throws keyword.[because, checked exceptions are not propagated automatically]
 */