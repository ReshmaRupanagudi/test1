package basic.exceptions;

import java.io.FileNotFoundException;

//Program 2 - Throwing Exception from m() method and 
//then again throwing it from calling method [ i.e. main method]
public class ExceptionTest1 {
    public static void main(String[] args) throws FileNotFoundException {
           m();
           System.out.println("after calling m()");
    }
    static void m() throws FileNotFoundException{

    }
}
 //method m() propagated exception to calling method (i.e. main method) using throws, and 
//main propagated exception to JVM using throws.