/**
 * Created by zemosozemoso on 4/7/17.
 */
import java.lang.*;

class Exception1 extends Exception {
    Exception1(String s1) {super(s1);}
}
class Exception2 extends Exception {
    Exception2(String s2) {super(s2);}
}
class Exception3 extends Exception {
    Exception3(String s3) {super(s3);}
}
public class ExceptionTest {
    static Integer x; /* By default it will initialize to null. To catch NullPointerException in finally block, */
    //static Integer x = 10;  /*  If we initialize it to any value then it will catch at one of the exceptions.*/
    public static void Method(int i) throws Exception1, Exception2, Exception3 {
        if(i > x) throw new Exception1("Exception 1");
        if(i < x) throw new Exception2("Exception 2");
        if(i == x) throw new Exception3(" Exception 3");
    }
    public static void main(String[] args) {
        try {
            Method(10);

        } catch (Exception e) { /* Only single catch block to catch all types of exception. */
            System.out.println("Caught"+e);
            } finally {
                    System.out.println("Finally block always executes even if nullpoint exception is thrown.");
              }
    }

}
