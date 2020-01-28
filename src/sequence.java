import java.io.*;
import java.util.*;

public class sequence {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        String res = "";
        int i = 1;
        int count = 0;
        while(i < n) {
            count++;
            res += i + " ";
            i <<= 1;
        }
        out.println(count);
        out.println(res.substring(0, res.length() - 1));
        out.close();
    }
}