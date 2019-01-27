import java.io.*;
import java.util.*;

public class parsinghex {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader in = new BufferedReader(new FileReader("System.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        HashSet<Character> possible = new HashSet<Character>();
        possible.add('A');
        possible.add('B');
        possible.add('C');
        possible.add('D');
        possible.add('E');
        possible.add('F');
        possible.add('a');
        possible.add('b');
        possible.add('c');
        possible.add('d');
        possible.add('e');
        possible.add('f');
        possible.add('0');
        possible.add('1');
        possible.add('2');
        possible.add('3');
        possible.add('4');
        possible.add('5');
        possible.add('6');
        possible.add('7');
        possible.add('8');
        possible.add('9');
        while((line = in.readLine()) != null) {
            String temp = line.toLowerCase();
            while(temp.indexOf("0x") != -1) {
                // out.println("t: " + temp);
                int index = temp.indexOf("0x") + 2;
                String hex = line.substring(index - 2, index);
                for(int i = index; hex.length() <= 10 && i < line.length(); i++) {
                    if(possible.contains(line.charAt(i)))
                        hex += line.charAt(i); 
                    else break;
                }
                // out.println("h: " + hex);
                if(hex.length() > 2) {
                    out.println(hex + " " + convertBase(hex.substring(2), 16, 10));
                }
                temp = temp.substring(index);
                line = line.substring(index);
            }
            // out.println("t: " + temp);
            // out.println();
        }
        out.close();
    }

    public static String convertBase(String num, int base, int radix) {
        return Long.toString(Long.parseLong(num, base), radix);
    }
}