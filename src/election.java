import java.io.*;
import java.util.*;
import java.math.*;

public class election {
    static double[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            dp = new double[51][51];
            for(int i = 0; i < dp.length; i++) {
                dp[i][0] = dp[i][i] = 1;
                for(int j = 1; j < i; j++) dp[i][j] = -1;
            }
            StringTokenizer st = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            double w = 0.01 * Integer.parseInt(st.nextToken());

            if(x > n / 2) {
                out.println("GET A CRATE OF CHAMPAGNE FROM THE BASEMENT!");
            }
            else if(y >= (n + 1) / 2) {
                out.println("RECOUNT!");
            }
            else {
                int m = n - x - y;
                double a = 0;
//                out.println(n / 2 + 1 - x - m);
                for(int i = n / 2 + 1 - x; i <= m; i++) {
                    a += (double) choose(m, i) / Math.pow(2, m);
//                    out.println(i + " " + a);
//                    out.println("choose: " + choose(m, i));
                }

                if(a > w) {
                    out.println("GET A CRATE OF CHAMPAGNE FROM THE BASEMENT!");
                }
                else {
                    out.println("PATIENCE, EVERYONE!");
                }
//                out.println(a);
            }
        }
        out.close();
    }

    private static double choose(int n, int k) {
        if(dp[n][k] > 0) return dp[n][k];
        return dp[n][k] = choose(n - 1, k - 1) + choose(n - 1, k);
    }
}