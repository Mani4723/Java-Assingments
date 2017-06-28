package manikanta.Assingment.data;

/**
 * Created by zemosozemoso on 28/6/17.
 */
 public class class1 {
    int i; // class member variables that are not initialized will be set to default values.
    char ch;
    public void method1() {
        System.out.println(i);
        System.out.println(ch);
    }
    public void method2() {
        int x; // Except member variables, rest should always be initialized.
        int y; // It will give a compile time error.
        System.out.println(x);
        System.out.println(y);
    }
}
