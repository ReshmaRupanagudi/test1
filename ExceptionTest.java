package basic.exceptions;

import java.io.FileNotFoundException;

//Handling Exception by throwing it from m() method (using throws keyword) 
//and handling it in try-catch block from where call to method m() was made.

public class ExceptionTest {
    public static void main(String[] args) {
           try {
                  m();
           } catch (FileNotFoundException e) {
               System.out.println("FileNotFoundException handled in try-catch block");
           }
           System.out.println("after calling m()");
    }
    static void m() throws FileNotFoundException{
          
    }
}

//method m() propagated exception to calling method (i.e. main method) using throws.