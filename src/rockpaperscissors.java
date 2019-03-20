import java.io.*;
import java.util.*;

public class rockpaperscissors {
    
    private static final String ROCK = "rock"; 
    private static final String PAPER = "paper"; 
    private static final String SCISSORS = "scissors"; 

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n == 0) break;
            int k = Integer.parseInt(st.nextToken());
            int[][] players = new int[n][2];
            for(int i = 0; i < k * n * (n - 1) / 2; i++) {
                st = new StringTokenizer(in.readLine());
                int a = Integer.parseInt(st.nextToken());
                String moveA = st.nextToken();
                int b = Integer.parseInt(st.nextToken());
                String moveB = st.nextToken();
                if(moveA.equals(moveB)) 
                    continue;
                String winner = determineWinner(moveA, moveB);
                if(moveA.equals(winner)) {
                    players[a - 1][0]++;
                    players[b - 1][1]++;   
                }
                else {
                    players[b - 1][0]++;
                    players[a - 1][1]++;   
                }                                
            }
            for(int i = 0; i < n; i++) {
                int total = players[i][0] + players[i][1];
                out.println(total == 0 ? "-" : String.format("%.3f", (double) players[i][0] / total));
            }
            out.println();
        }
        out.close();
    }

    private static String determineWinner(String a, String b) {
        if(a.equals(ROCK) && b.equals(SCISSORS)) 
            return a;
        if(a.equals(SCISSORS) && b.equals(PAPER))
            return a;
        if(a.equals(PAPER) && b.equals(ROCK))
            return a;
        if(b.equals(ROCK) && a.equals(SCISSORS)) 
            return b;
        if(b.equals(SCISSORS) && a.equals(PAPER))
            return b;
        return b; 
    }
}