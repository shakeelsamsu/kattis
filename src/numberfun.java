import java.io.*;
import java.util.*;
import java.math.*;

public class numberfun {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a + b == c) out.println("Possible");
            else if(a - b == c || b - a == c) out.println("Possible");
            else if(a * b == c) out.println("Possible");
            else if((double) a / b == c || (double) b / a == c) out.println("Possible");
            else out.println("Impossible");
        }
        out.close();
    }
}