import java.io.*;
import java.util.*;

public class shiritori {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        HashSet<String> words = new HashSet<String>();
        int turn = 0;
        char current = ' ';
        boolean fair = true;
        for(int i = 0; i < n && fair; i++) {
            String word = in.readLine();
            if(words.contains(word)) fair = false;
            if(i != 0 && word.charAt(0) != current) fair = false;
            current = word.charAt(word.length() - 1);
            words.add(word);
            turn++;
        }
        if(fair) out.println("Fair Game");
        else {
            out.println(turn % 2 == 1 ? "Player 1 lost" : "Player 2 lost");
        }
        out.close();
    }
}