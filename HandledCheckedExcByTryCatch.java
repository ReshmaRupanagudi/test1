package basic.exceptions;

import java.io.FileNotFoundException;

public class HandledCheckedExcByTryCatch {
    public static void main(String[] args) {
           m();
           System.out.println("after calling m()");
    }
    static void m(){
           try {
                 throw new FileNotFoundException();
           } catch (FileNotFoundException e) {
                 System.out.println("FileNotFoundException handled in try-catch block");
           }
    }
}

//We throwed FileNotFoundException (checked exception) by using throw keyword 
//and handled it in try-catch block.
