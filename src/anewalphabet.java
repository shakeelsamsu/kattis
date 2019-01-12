import java.io.*;
import java.util.*;

public class anewalphabet {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        HashMap<Character, String> letters = new HashMap<Character, String>();
        letters.put('a', "@");
        letters.put('b', "8");
        letters.put('c', "(");
        letters.put('d', "|)");
        letters.put('e', "3");
        letters.put('f', "#");
        letters.put('g', "6");
        letters.put('h', "[-]");
        letters.put('i', "|");
        letters.put('j', "_|");
        letters.put('k', "|<");
        letters.put('l', "1");
        letters.put('m', "[]\\/[]");
        letters.put('n', "[]\\[]");
        letters.put('o', "0");
        letters.put('p', "|D");
        letters.put('q', "(,)");
        letters.put('r', "|Z");
        letters.put('s', "$");
        letters.put('t', "\'][\'");
        letters.put('u', "|_|");
        letters.put('v', "\\/");
        letters.put('w', "\\/\\/");
        letters.put('x', "}{");
        letters.put('y', "`/");
        letters.put('z', "2");
        String line = in.readLine();
        for(int i = 0; i < line.length(); i++) {
            char c = line.substring(i, i + 1).toLowerCase().charAt(0);
            if(letters.get(c) == null) out.print(c);
            else out.print(letters.get(c));
        }
        out.close();
    }
}