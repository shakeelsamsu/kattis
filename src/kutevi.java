import java.io.*;
import java.util.*;
import java.math.*;

public class kutevi {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int[] angles = new int[n];
        for(int i  = 0; i < n; i++) {
            angles[i] = Integer.parseInt(st.nextToken());
        }
        boolean[] dp = new boolean[361];
        for(int i = 0; i < angles.length; i++) {
            int angle = angles[i];
            dp[angle] = true;
            for(int j = 0; j < dp.length; j++) {
                if(dp[j]) {
                    int total = j + angle;
                    total %= 360;
                    while(!dp[total]) {
                        dp[total] = true;
                        total += angle;
                        total %= 360;
                    }
                }
            }
        }
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < k; i++) {
            out.println(dp[Integer.parseInt(st.nextToken())] ? "YES" : "NO");
        }
        out.close();
    }
}