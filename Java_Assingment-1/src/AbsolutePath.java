import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Question: Create an java program to search through the home directory and look for files that match a
 * regular expression. The program should be able to take inputs repeatedly and should print out full
 * absolute path of the matching files found.
 *
 * Java Assingment 1
 * @author Manikanta
 * Created by zemosozemoso on 14/7/17.
 */

public class AbsolutePath {

    public static void main(String[] args) throws IOException {
        Scanner scan = null;

        try {
            scan = new Scanner(System.in);
            System.out.print("Enter an Expression to search the files that match : ");

            // Continuously takes the inputs until exit is typed.
            while (!scan.hasNext("exit")) {
                String filename = scan.next();

                // Returns home directory as string.
                String dir = System.getProperty("user.home");

                //Converting given directory to path object.
                Path directory = Paths.get(dir);

                // To walk a file tree, We first need to implement a FileVisitor.
                // Findpath class extends the SimpleFileVisitor and specifies the key points in traversal.
                FindPath findpath = new FindPath(filename);
                Files.walkFileTree(directory, findpath);

                //prints number of matched files, if found any.
                System.out.println(findpath.numberMatches());

                System.out.println();
                System.out.print("Try another expression or exit by typing 'exit' : ");
            }
        } finally {
            if (scan != null) {

                // Even though a scanner is not a stream, you need to close it to indicate
                // that you're done with its underlying stream.
                scan.close();
            }
        }

    }
}