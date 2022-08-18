package basic.exceptions;

public class ExceptionInCalledMethod {

	/**
	 * @param args
	 */
	public static void throwA()throws ArithmeticException{
		
		int a=10/0;
	}
	
	public static void main(String[] args) {
		// 		 Auto-generated method stub

		
		try{
			throwA();
			int array[]= new int[1];
			array[0]=1;array[1]=1;array[2]=1;
			System.out.println(array[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index E");
			//e.printStackTrace();
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
			//e.printStackTrace();
		}
		System.out.println("ABC");
	}

}
