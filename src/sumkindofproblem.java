import java.io.*;
import java.util.*;

public class sumkindofproblem {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int caseNum = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            out.println(caseNum + " " + sum(x) + " " + odd(x) + " " + even(x));
            caseNum++;
        }
        out.close();
    }

    public static long sum(int n) {
        long res = 0;
        for(int i = 1; i <= n; i++) res += i;
        return res;
    }

    public static long even(int n) {
        long res = 0;
        for(int i = 2; i <= 2 * n; i += 2) res += i;
        return res;
    }

    public static long odd(int n) {
        long res = 0;
        for(int i = 1; i <= 2 * n - 1; i += 2) res += i;
        return res;
    }
}