import java.io.*;
import java.util.*;

public class skocimis {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int jumps = 0;
        while(!(b == a + 1 && c == b + 1)) {
            if(b - a > c - b) {
                jumps++;
                c = b;
                b--;
            }
            else {
                jumps++;
                a = b;
                b++;
            }
            //out.println(a + " " + b + " " + c);
        }
        out.println(jumps);
        out.close();
    }
}