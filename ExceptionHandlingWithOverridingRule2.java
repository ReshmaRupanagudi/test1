package basic.exceptions;


/*2) Rule: If the superclass method does not declare an exception,
subclass overridden method cannot declare the checked exception but can declare unchecked exception.*/

class Parent3{  
  void msg(){System.out.println("parent");}  
}  
  
class ExceptionHandlingWithOverridingRule2 extends Parent3{  
  void msg()throws ArithmeticException{  
    System.out.println("child");  
  }  
  public static void main(String args[]){  
   Parent3 p=new ExceptionHandlingWithOverridingRule2();  
   p.msg();  
  }  
}  