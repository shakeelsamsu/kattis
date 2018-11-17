import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.lang.*;

public class filip {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String first = "";
        String second = "";
        for(int i = 2; i >= 0; i--) {
            first += s1.substring(i, i + 1);
            second += s2.substring(i, i + 1);
        }
        if(Integer.parseInt(first) > Integer.parseInt(second)) out.println(first);
        else out.println(second);
        out.close();
    }
   
}
