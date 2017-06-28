package manikanta.Assingment.singleton;

/**
 * Created by zemosozemoso on 28/6/17.
 */
public class class2 {
    String str;
    public static class2 method3 (String s) {
        str = s;/*This task cannot be performed.
                  Non-static fields cannot be referenced from a static context.
                  But if object of class2 is created, then it can be accessed from object */
        return obj2; // Cannot return this object without creating it.
    }
    public void method4 () {
        System.out.println(str);
    }
}
