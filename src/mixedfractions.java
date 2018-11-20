import java.io.*;
import java.util.*;

public class mixedfractions {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0) break;
            out.println(a / b + " " + (a - (b * (a / b))) + " / " + b);
        }
        out.close();
    }
}