import java.io.*;
import java.util.*;

public class pokerhand {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        ArrayList<Character> cards = new ArrayList<Character>();
        String line = in.readLine();
        cards.add(line.charAt(0));
        cards.add(line.charAt(3));
        cards.add(line.charAt(6));
        cards.add(line.charAt(9));
        cards.add(line.charAt(12));
        int max = Integer.MIN_VALUE;
        for(Character c : cards) {
            if(max < Collections.frequency(cards, c)) 
                max = Collections.frequency(cards, c);
        }
        out.println(max);
        out.close();
    }
}