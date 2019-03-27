import java.io.*;
import java.util.*;

public class primaryarithmetic {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if(a.equals("0") && b.equals("0")) break;
            int last = 0;
            int count = 0;
            int i = 0;
            for(i = 0; i < Math.min(a.length(), b.length()); i++) {
                int x = Integer.parseInt(a.substring(a.length() - i - 1, a.length() - i));
                int y = Integer.parseInt(b.substring(b.length() - i - 1, b.length() - i));
                if(x + y + last >= 10)
                    count++;
                last = x + y + last >= 10 ? 1 : 0;
            }
            if(Math.max(a.length(), b.length()) != Math.min(a.length(), b.length())) {
                if(a.length() == Math.max(a.length(), b.length())) {
                    for(; i < a.length(); i++)
                        if(Integer.parseInt(a.substring(a.length() - i - 1, a.length() - i)) + last >= 10)
                            count++;
                }
                else {
                    for(; i < b.length(); i++)
                        if(Integer.parseInt(b.substring(b.length() - i - 1, b.length() - i)) + last >= 10)
                            count++;
                }
            } 
            out.println(count == 0 ? "No carry operation." : (count == 1 ? "1 carry operation." : count + " carry operations."));
        }
        out.close();
    }
}