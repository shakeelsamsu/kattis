import java.io.*;
import java.util.*;

public class amoebas {

    private static char[][] grid;
    private static boolean[][] visited;
    private static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
    private static int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        grid = new char[m][n];
        visited = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            String line = in.readLine();
            for(int j = 0; j < n; j++) 
                grid[i][j] = line.charAt(j);
        }
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(!visited[i][j] && grid[i][j] != '.') {
                    floodfill(i, j);
                    count++;
                }
            }
        }
        out.println(count);
        out.close();
    }

    private static void floodfill(int r, int c) {
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length)
            return;
        
        if(visited[r][c])
            return;
        visited[r][c] = true;
        
        for(int i = 0; i < 8; i++) {
            if(inRange(r + dy[i], c + dx[i]) && grid[r + dy[i]][c + dx[i]] != '.')
                floodfill(r + dy[i], c + dx[i]);
        }
    } 

    private static boolean inRange(int r, int c) {
        return r < grid.length && r >= 0 && c < grid[0].length && c >= 0;
    }
}