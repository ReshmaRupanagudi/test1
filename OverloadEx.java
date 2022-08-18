package basic;

public class OverloadEx {
	
	public static  void method1(){
		System.out.println("Overload method 1");
	}
	
	public void method1( float a){
		System.out.println("method float");
	}
	
	public void method1( double a){
		System.out.println("method double");
	}
	
	public void method1(Object s){
		System.out.println("method Object ");
	}
	public void method1(String s){
		System.out.println("method String ");
	}
	
	
	public static void main(String[] arg){
		OverloadEx ex=new OverloadEx();
		ex.method1(10);
		ex.method1(ex);
		ex.method1();
		ex.method1(null);
	}

}
