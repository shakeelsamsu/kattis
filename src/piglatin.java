import java.io.*;
import java.util.*;

public class piglatin {
    
    private static HashSet<String> vowels = new HashSet<String>();
    
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        vowels.add("y");
        while((line = in.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            while(st.hasMoreTokens()) {
                out.print(piglatinify(st.nextToken()));
                out.print(" ");
            }
            out.println();
        }
        out.close();
    }
    
    public static String piglatinify(String word) {
        if(vowels.contains(word.substring(0, 1)))
            return word + "yay";
        int i;
        for(i = 0; i < word.length(); i++) {
            if(vowels.contains(word.substring(i, i + 1)))
                break;
        }
        return word.substring(i) + word.substring(0, i) + "ay";
    }
}
