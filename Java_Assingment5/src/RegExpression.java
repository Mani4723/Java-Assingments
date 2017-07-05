/**
 * Created by zemosozemoso on 5/7/17.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {
    public static void main (String[] args) {
        String pattern = "^[A-Z].*[\\.]$"; /* Pattern to find the strings that starts with a Capital */
                                           /*   letter and ends with a period*/
        String line1 = "This lesson describes how to use Number and String objects. The lesson also shows you how to format data for output.";
        String line2 = "Generics are a powerful feature of the Java programming language.";
        String line3 = "object oriented programming.";

        System.out.println(line1.matches(pattern)); // prints boolean values depending on the match.
        System.out.println(line2.matches(pattern));
        System.out.println(line3.matches(pattern));

    }

}
