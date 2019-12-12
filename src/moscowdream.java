import java.io.*;
import java.util.*;
import java.math.*;

public class moscowdream {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean status = a > 0 && b > 0 && c > 0 && (a + b + c) >= n && n >= 3;
        out.println(status ? "YES" : "NO");
        out.close();
    }
}