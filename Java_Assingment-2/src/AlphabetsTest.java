import org.junit.Test;

/**
 * Java Assingment 2.
 * @File: AlphabetsTest.java
 * Q. Test cases.
 * @author: Manikanta
 * Created by zemosozemoso on 7/7/17.
 */

public class AlphabetsTest {
    @Test
    public void Test1(){
        Alphabets.allAlphas("qwertyuiopasdfghjklzxcvbnm");
    }
    @Test
    public void Test2(){
        Alphabets.allAlphas("qcanknffnzifijklzxcvbnm");
    }
    @Test
    public void Test3(){
        Alphabets.allAlphas("ijklzxcvbnm");
    }
    @Test
    public void Test4(){
        Alphabets.allAlphas("1234");
    }
    @Test
    public void Test5(){
        Alphabets.allAlphas("");
    }


}