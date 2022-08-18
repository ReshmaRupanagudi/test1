package basic.exceptions;

import java.io.FileNotFoundException;

public class PropagatingExcToCallingMethod {
    public static void main(String[] args) {
           try {
                  m();
           } catch (FileNotFoundException e) {
               System.out.println("FileNotFoundException handled in try-catch block");
           }
           System.out.println("after calling m()");
    }
    static void m() throws FileNotFoundException{
           throw new FileNotFoundException();
    }
}

//method m() propagated exception to calling method
//(i.e. main method) using throws.