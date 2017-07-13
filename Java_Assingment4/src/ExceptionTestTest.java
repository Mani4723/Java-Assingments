import org.junit.jupiter.api.Test;

/**
 * Exception test cases.
 *
 * Java Day 4 Assingment
 * @author Manikanta
 * Created by zemosozemoso on 13/7/17.
 */
class ExceptionTestTest {
    private ExceptionTest et = new ExceptionTest();

    @Test
    void Test1() {
        et.expTest(15);
    }
    @Test
    void Test2() {
        et.expTest(8);
    }
    @Test
    void Test3() {
        et.expTest(15);
    }
    @Test
    void Test4() {
        et.expTest(-12);
    }
}