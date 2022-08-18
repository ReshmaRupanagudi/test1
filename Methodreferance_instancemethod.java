package java8features;

public class Methodreferance_instancemethod {
	
	public static void main(String[] args) {
		
		Methodreferance_instancemethod obj = new Methodreferance_instancemethod();
		
		testInterface fun = obj::test;
		fun.function();
	}
	
	public void test() {
		
		System.out.println("tset executed");
	}

}

interface testInterface{
	
	 void function();
	
}