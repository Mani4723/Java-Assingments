/**
 * Created by zemosozemoso on 4/7/17.
 */
import java.lang.*;

class Exception1 extends Exception {
    Exception1(String s1) {}
}
class Exception2 extends Exception {
    Exception2(String s2) {}
}
class Exception3 extends Exception {
    Exception3(String s3) {}
}
public class ExceptionTest {
    static Integer [] x = new Interger[1]; // dynamic array will be initialized during runtime.
    public static void Method(int x) throws Exception1, Exception2, Exception3 {
        if(x > 0) throw new Exception1("Exception 1");
        if(x < 0) throw new Exception2("Exception 2");
        if(x == 0) throw new Exception3(" Exception 3");
    }
    public static void main(String[] args) {
        try {
            Method(x[0]); // catches nullpoint exceptions.
            Method(11);  // catches exception 1.
            Method(-9); // catches exception 2.
            Method(0); // Catches exception 3.
             
        } catch (Exception e) { /* Only single catch block to catch all types of exception. */
            System.out.println("Caught"+e);
            e.printStackTrace(System.out); 
            } finally {
                    System.out.println("Finally block always executes even if nullpoint exception is thrown.");
              }
    }
}
