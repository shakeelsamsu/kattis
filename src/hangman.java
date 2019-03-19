import java.io.*;
import java.util.*;

public class hangman {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int count = 0;
        HashSet<Character> word = new HashSet<Character>();
        for(char c : in.readLine().toCharArray())
            word.add(c);
        char[] guess = in.readLine().toCharArray();
        for(int i = 0; count < 10 && word.size() > 0 && i < guess.length; i++) {
            char c = guess[i];
            if(word.contains(c))
                word.remove(c);
            else
                count++;
        }
        out.println(count >= 10 ? "LOSE" : "WIN");
        out.close();
    }
}
