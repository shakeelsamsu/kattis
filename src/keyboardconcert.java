import java.io.*;
import java.util.*;
import java.math.*;

public class keyboardconcert {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<HashSet<Integer>> instruments = new ArrayList<HashSet<Integer>>();
        for(int i = 0; i < n; i++) {
           instruments.add(new HashSet<Integer>());
           st = new StringTokenizer(in.readLine());
           st.nextToken();
           while(st.hasMoreTokens()) {
               instruments.get(i).add(Integer.parseInt(st.nextToken()));
           }
        }
        
        int[][] dp = new int[m][n];
        for(int[] x : dp) Arrays.fill(x, 100000);
        int[] notes = new int[m];
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < m; i++) {
            notes[i] = Integer.parseInt(st.nextToken());
        }

        for(int note = m - 1; note >= 0; note--) {
            for(int i = 0; i < n; i++) {
                if(note == m - 1) {
                    if(instruments.get(i).contains(notes[note]))
                        dp[note][i] = 0;
                }
                else {
                    if(instruments.get(i).contains(notes[note]))
                        for(int j = 0; j < n; j++)
                            dp[note][i] = Math.min(dp[note][i], dp[note+1][j] + (i != j ? 1 : 0));
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
            ans = Math.min(dp[0][i], ans);
        out.println(ans);
        out.close();
    }
}
