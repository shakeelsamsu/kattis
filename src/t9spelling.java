import java.io.*;
import java.util.*;

public class t9spelling {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        HashMap<String, String> keypad = new HashMap<String, String>();
        keypad.put("a", "2");
        keypad.put("b", "22");
        keypad.put("c", "222");
        keypad.put("d", "3");
        keypad.put("e", "33");
        keypad.put("f", "333");
        keypad.put("g", "4");
        keypad.put("h", "44");
        keypad.put("i", "444");
        keypad.put("j", "5");
        keypad.put("k", "55");
        keypad.put("l", "555");
        keypad.put("m", "6");
        keypad.put("n", "66");
        keypad.put("o", "666");
        keypad.put("p", "7");
        keypad.put("q", "77");
        keypad.put("r", "777");
        keypad.put("s", "7777");
        keypad.put("t", "8");
        keypad.put("u", "88");
        keypad.put("v", "888");
        keypad.put("w", "9");
        keypad.put("x", "99");
        keypad.put("y", "999");
        keypad.put("z", "9999");
        keypad.put(" ", "0");
        
        for(int i = 0; i < n; i++) {
            String prev = " ";
            String line = in.readLine();
            out.print("Case #" + (i + 1) + ": ");
            for(int j = 0; j < line.length(); j++) {
                String current = line.substring(j, j + 1);
                if(current.equals(prev) || keypad.get(current).contains(keypad.get(prev).substring(0, 1))) {
                    out.print(" ");
                    out.print(keypad.get(current));
                }
                else out.print(keypad.get(current));
                prev = current;
            }
            if(i != n - 1) out.println();
        }
        out.close();
    }
}
