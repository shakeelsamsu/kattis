import java.io.*;
import java.util.*;

public class drmmessages {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s = in.readLine();
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        int aRotation = 0;
        for(int i = 0; i < a.length(); i++) {
            aRotation += letters.indexOf(a.substring(i, i + 1));  
        }
        int bRotation = 0;
        for(int i = 0; i < b.length(); i++) {
            bRotation += letters.indexOf(b.substring(i, i + 1));  
        }
        // out.println(aRotation);
        // out.println(bRotation);
        String newA = "";
        String newB = "";
        for(int i = 0; i < a.length(); i++) {
            int index = (letters.indexOf(a.substring(i, i + 1)) + aRotation) % 26;
            newA += letters.substring(index, index + 1);
        }
        for(int i = 0; i < b.length(); i++) {
            int index = (letters.indexOf(b.substring(i, i + 1)) + bRotation) % 26;
            newB += letters.substring(index, index + 1);
        }
        // out.println(newA);
        // out.println(newB);
        String res = "";
        for(int i = 0; i < newA.length(); i++) {
            int index = (letters.indexOf(newA.substring(i, i + 1)) + letters.indexOf(newB.substring(i, i + 1))) % 26;
            res += letters.substring(index, index + 1);
            // out.println(index);
        }
        out.println(res);
        out.close();
    }
}