package basic;

public class OverRidingEx extends OverloadEx{
	static int x = 10;
	
	public  static void method1(){     // try making method1 static in both Parent and child class
		System.out.println("method 1 from child");
	}
	
	public static void m2() {
		System.out.println("m2 from child");
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		OverloadEx ovr = new OverRidingEx();
		ovr.method1();  // overriding static methods  called method hiding it will always call the Class type method
						// non static overriding methods will always call the object type method
		
	}

}
