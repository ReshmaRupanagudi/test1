package basic;

public class OverLoadingExamples {

	public void nonStaticm1(Object obj){
		System.out.println("2 Non-Static methods can be overloaded:Obj");
	}
	
	public void nonStaticm1(String s){
		System.out.println("2 Non-Static methods can be overloaded:Str");
		
	}
	
	public static  void doSomething(Object obj) {
	    System.out.println("Object called");
	}

	public static  void doSomething(char[] obj) {
	    System.out.println("Array called");
	}

	public static  void doSomething(Integer obj) {
	    System.out.println("Integer called");
	}
	public static void staticm1(Object obj){
		System.out.println("2 static methods can be overloaded:Obj");
	}
	
	public static void staticm1(String s){
		System.out.println("2 static methods can be overloaded:Str");
		
	}
	
	public static void differInStaticm1(Object obj){
		System.out.println("2 methods that differ only by static keyword can't be overloaded NO CE NO RE:Obj");
	}
	
	public void differInStaticm1(String s){
		System.out.println("2 methods that differ only by static keyword can't be overloaded  NO CE NO RE:Str");
		
	}
	public static void main(String[] args) {
	
		OverLoadingExamples o= new OverLoadingExamples();
		
	    o.nonStaticm1(null);
	    OverLoadingExamples.staticm1(null);
	    o.differInStaticm1(null);
	    OverLoadingExamples.differInStaticm1(o);
	//    doSomething(null);
	}

}
