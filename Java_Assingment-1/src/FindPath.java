import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;

/**
 * Java Assingment 1.
 * @author Manikanta
 * Created by zemosozemoso on 14/7/17.
 */

public class FindPath extends SimpleFileVisitor<Path> {

    private PathMatcher matcher;
    private int count = 0;

    /**
     * @param filename Expression given to find matching files.
     */
    FindPath(String filename) {

        //  getPathMatcher specifies the syntax flavor and the pattern to be matched.
        // A glob syntax is specified as a string and is matched against given pattern.
        matcher = FileSystems.getDefault().getPathMatcher("glob:" + filename);
    }

    /**
     * Compares the glob pattern against the file or directory name.
     * Prints the matched files path.
     * @param file Either file or directory, came from the override methods of FileVisitResult.
     */
    private void find(Path file) {
        Path name = file.getFileName();
        if (matcher.matches(name) && name != null) {
            count++;
            System.out.println(file);
        }
    }

    /**
     * Prints the number of matches if any found, else prints a message.
     */
    String numberMatches() {
        if (count == 0) {
            return "No Such files found.";
        } else {
            System.out.println();
            return ("Number of files matched with given pattern: " + count);
        }
    }

    /**
     * Invoke the pattern matching method on each directory.
     *
     * @param dir A reference to the directory.
     * @param attrs The directory's basic attributes.
     * @return The visit result.
     * @throws IOException - If any I/O exception occurs.
     */
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        find(dir);
        return CONTINUE;
    }


    /**
     * Invoke the pattern matching method on each file.
     *
     * @param file  A reference to the file.
     * @param attrs The Files basic attributes.
     * @return The visit result.
     * @throws IOException - If any I/O occurs.
     */
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        find(file);
        return CONTINUE;
    }

    /**
     * Invoked for a file that could not be visited.
     *
     * @param file A reference to the file.
     * @param exp The I/O exception that prevented the file from being visited.
     * @return The visit result.
     * @throws IOException - If any I/O occurs.
     */
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exp) throws IOException {
        System.err.println(exp);
        return CONTINUE;
    }
}

