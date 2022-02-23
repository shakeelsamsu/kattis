import java.io.*;
import java.util.*;
import java.math.*;

public class weightofwords {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        String[][] dp = new String[n+1][w+1];
        for(int i = 1; i <= Math.min(26, w); i++) {
            dp[1][i] = Character.toString((char)('a'+(i-1)));
        }
 
        for(int i = 2; i<=n; i++) {
            for(int j = 0; j <= w; j++) {
                if(j >= i && j <= 26*i) {
                    if(j == i) {
                        dp[i][j] = dp[i-1][j-1] + "a";
                        continue;
                    }
                    int diff = j - i < 26 ? j - i : 26;
                    dp[i][j] = dp[i-1][j-diff] + Character.toString((char)('a'+(diff-1)));
                }
            }
        }
        out.println(dp[n][w] == null ? "impossible" : dp[n][w]);
        out.close();
    }
}
