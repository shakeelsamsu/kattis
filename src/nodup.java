import java.io.*;
import java.util.*;
import java.math.*;

public class nodup {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String input[] = in.readLine().split(" ");
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(input));
        for(String word : words) {
            if(Collections.frequency(words, word) > 1) {
                out.println("no");
                out.close();
            }
        }
        out.println("yes");
        out.close();
    }
}