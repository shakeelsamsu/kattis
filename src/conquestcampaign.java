import java.io.*;
import java.util.*;

public class conquestcampaign {

    private static boolean updated = true;
    private static int count = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] grid = new int[r][c];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            grid[x][y] = count;
        }
        int days = 1;
        while(updated) {
            updated = false;
            for(int i = 0; i < r; i++)
                for(int j = 0; j < c; j++)
                    if(grid[i][j] == count)
                        flood(grid, i, j);
            if(updated) {
                days++;
                count++;
            }
        }
        out.println(days);
        out.close();
    }

    public static void flood(int[][] grid, int r, int c) {
        if(inRange(grid, r + 1, c) && grid[r + 1][c] == 0) {
            updated = true;
            grid[r + 1][c] = count + 1;
        }
        if(inRange(grid, r - 1, c) && grid[r - 1][c] == 0) {
            updated = true;
            grid[r - 1][c] = count + 1;
        }
        if(inRange(grid, r, c + 1) && grid[r][c + 1] == 0) {
            updated = true;
            grid[r][c + 1] = count + 1;
        }
        if(inRange(grid, r, c - 1) && grid[r][c - 1] == 0) {
            updated = true;
            grid[r][c - 1] = count + 1;
        }
    }

    public static boolean inRange(int[][] grid, int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }
}