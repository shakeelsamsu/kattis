import java.io.*;
import java.util.*;
import java.math.*;

public class fizzbuzz {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
    
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; i++) {
            if(i % x == 0 && i % y == 0) out.println("FizzBuzz");
            else if(i % x == 0) out.println("Fizz");
            else if(i % y == 0) out.println("Buzz");
            else out.println(i);
        }
        out.close();
    }
}