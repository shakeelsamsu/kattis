import java.io.*;
import java.util.*;

public class mirror {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] grid = new char[r][c];
            for(int k = 0; k < r; k++) {
                String line = in.readLine();
                for(int j = 0; j < c; j++) grid[k][j] = line.charAt(j);
            }
            out.println("Test " + (i + 1));
            for(int k = r - 1; k >= 0; k--) {
                for(int j = c - 1; j >= 0; j--) out.print(grid[k][j]);
                out.println();
            }
        }
        out.close();
    }
}