import java.io.*;
import java.util.*;
import java.math.*;

public class quickbrownfox {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            ArrayList<Character> letters = new ArrayList<Character>();
            for(char letter = 'a'; letter <= 'z'; letter++) letters.add(letter);
            ArrayList<Character> contains = new ArrayList<Character>();
            String line = in.readLine().toLowerCase();
            for(int c = 0; c < letters.size(); c++) if(line.contains(letters.get(c).toString())) contains.add(letters.get(c));    
            letters.removeAll(contains);
            if(letters.size() > 0) {
                out.print("missing ");
                for(int j = 0; j < letters.size(); j++) out.print(letters.get(j));
                out.println();
            }
            else out.println("pangram"); 
        }
        out.close();
    }
}