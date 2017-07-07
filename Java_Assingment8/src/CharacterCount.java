/**
 * Created by zemosozemoso on 6/7/17.
 */
import java.io.*;
import java.util.*;

public class CharacterCount {

    public static void main(String[] args) {
        File inputFile = new File(args[0]); /* Taking file through command line argument. */
        BufferedReader br = null;
        String str;
        FileWriter out;
        try {
            br = new BufferedReader(new FileReader(inputFile));
            str = br.readLine();
            System.out.println(str); //  Just to check if it is taking input properly.

            char[] cArray = (str).toCharArray(); // Making an array of all characters.
            Set<Character> cSet = new TreeSet<>();  /* Making a Set of unique Characters in file */
            for(char c : cArray) cSet.add(c);
            List<Character> cList = new ArrayList<>(); /* List of all Characters in file */
            for(char c : cArray) cList.add(c);
            Map<Character,Integer> cMap = new HashMap<>();
            for(Character c : cSet) {
                int count = 0;
                for(Character d : cList) {
                    if(d.equals(c)) count++;
                }
                cMap.put(c, count);

            }
            System.out.println();
            System.out.println(String.valueOf(cMap)); /* Printing the output*/
            out = new FileWriter("output.txt"); /* Writing the output to a text file. */
            out.write(String.valueOf(cMap)); out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null) {br.close();}
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }  
}
