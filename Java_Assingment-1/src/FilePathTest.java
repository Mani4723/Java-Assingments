import org.junit.Test;

import java.io.File;

/**
 * Question: Test cases for Java Assingment 1. Tested using some of files in my Home directory.
 * @author Manikanta
 * Created by zemosozemoso on 13/7/17.
 */

public class FilePathTest {
    private FilePath filePath = new FilePath();
    @Test
    public void Test1() {
        filePath.findFile("Track.txt", new File("/Home/"));
    }
    @Test
    public void Test2() {
        filePath.findFile("codeconventions-150003.pdf", new File("/Home/"));
    }
    @Test
    public void Test3() {
        filePath.findFile("Photo1837.jpg", new File("/Home/"));
    }
}
