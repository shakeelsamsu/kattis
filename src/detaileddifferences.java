import java.io.*;
import java.util.*;

public class detaileddifferences {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
           String a = in.readLine();
           String b = in.readLine();
           String s = "";
           for(int j = 0; j < a.length(); j++) {
               if(a.charAt(j) == b.charAt(j)) s += ".";
               else s += "*";
           }
           out.println(a);
           out.println(b);
           out.println(s);
           out.println();
        }
        out.close();
    }
}