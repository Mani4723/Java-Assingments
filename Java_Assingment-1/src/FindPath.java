import java.io.File;
import java.security.AccessControlException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Java Assingment 1
 * @author Manikanta
 * Created by zemosozemoso on 14/7/17.
 */
class FindPath {
    int count = 0;

    /**
     * @param directory Contains the directory name in which given expression will be looked.
     * @param expression Given input expression to search matching files.
     * @throws AccessControlException Throws when a directory permissions are denied.
     */
    void filelist(File directory, String expression) throws AccessControlException {

        // Recursivelly searches the directories and prints the path if any match is found.
        try {
            File[] files = directory.listFiles();
            if (files != null) {
                for(File f:files){
                    if(f.isDirectory()) {
                        filelist(f, expression);
                    } else {
                        Pattern pattern = Pattern.compile(expression);
                        Matcher matcher = pattern.matcher(f.getName());
                        if (matcher.find()) {
                            count++;
                            System.out.println(f.getAbsolutePath());
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurs when an access to directory " + directory +" if denied.");
        }
    }

    /**
     * Counts the number of matching files. If no file is found for the matching expression, it prints the same.
     */
    void done() {
        if (count == 0) {
            System.out.println("No files found for entered expression.");
        } else {
            System.out.println(count + " Matches found");
        }
    }
}
