import java.io.*;
import java.util.*;

public class hangman {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int count = 0;
        ArrayList<Character> word = new ArrayList<Character>();
        for(char c : in.readLine().toCharArray())
            word.add(c);
        String guess = in.readLine();
        for(char c : guess.toCharArray()) {
            if(word.contains(c)) 
                word.removeAll(Collections.singleton(c));
            else
                count++;
            if(word.size() == 0) break;
        }
        out.println(count >= 10 ? "LOSE" : "WIN");
        out.close();
    }
}
