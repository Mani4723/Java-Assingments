/**
 * Created by zemosozemoso on 7/7/17.
 */
import java.io.*;
import java.util.*;
public class FilePath
{
    public static void main(String[] args) {
        FilePath fp = new FilePath();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file name to search the path or exit by typing 'exit' : ");
        while(!scan.hasNext("exit")) {
            String filename = scan.next();
            String directory = "/home/";  // Directory name, where we want to search the files.
            fp.findFile(filename, new File(directory));
            System.out.println();
            System.out.println("Enter the file name to search the path or exit by typing 'exit' : ");
        }
    }

    public void findFile(String filename,File dir) {
        File[] dirlist = dir.listFiles();
        if(dirlist!=null)
            for (File filordir : dirlist) {
                if (filordir.isDirectory()) {   /* checks weather file or directory */
                    findFile(filename,filordir);
                }
                else if (filename.equalsIgnoreCase(filordir.getName())) {
                    System.out.println(filordir.getAbsolutePath());
                    /* Prints the absolute pathname string of this abstract pathname. */

                }
            }
    }
}
