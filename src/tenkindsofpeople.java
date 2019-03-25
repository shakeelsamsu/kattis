import java.io.*;
import java.util.*;

public class tenkindsofpeople {

    private static int[] start;
    private static int[] end;
    private static int[][] grid;
    private static boolean[][] visited;
    private static int[][] counts;
    private static int[] refs;
    private static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        grid = new int[r][c];
        counts = new int[r][c];
        refs = new int[r * c];
        for(int i = 0; i < r; i++) {
            String line = in.readLine();
            for(int j = 0; j < c; j++) {
                grid[i][j] = Integer.parseInt(line.substring(j, j + 1));
                refs[i * c + j] = i * c + j;
            }
        }
        visited = new boolean[r][c];
        count = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(!visited[i][j]) {
                    counts[i][j] = count;
                    floodfill(i, j);
                    count++;
                }
            }
        }
        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            start = new int[] {(Integer.parseInt(st.nextToken()) - 1), Integer.parseInt(st.nextToken()) - 1, 0};
            end = new int[] {Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1, 0};
            start[2] = grid[start[0]][start[1]];
            end[2] = grid[end[0]][end[1]];
            if(start[2] != end[2])
                out.println("neither");
            else {
                if(start.equals(end) || counts[start[0]][start[1]] == counts[end[0]][end[1]])
                    out.println(grid[start[0]][start[1]] == 0 ? "binary" : "decimal");  
                else out.println("neither");     

            }
        }

        out.close();
    }

    private static void floodfill(int r, int c) {
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length)
            return;
        if(visited[r][c])
            return;
        visited[r][c] = true;
        
        if(inRange(r + 1, c) && !visited[r + 1][c] && grid[r + 1][c] == grid[r][c]) { 
            counts[r + 1][c] = count;
            floodfill(r + 1, c);
        }
        if(inRange(r - 1, c) && !visited[r - 1][c] && grid[r - 1][c] == grid[r][c]) { 
            counts[r - 1][c] = count;
            floodfill(r - 1, c);
        }
        if(inRange(r, c + 1) && !visited[r][c + 1] && grid[r][c + 1] == grid[r][c]) {
            counts[r][c + 1] = count;
            floodfill(r, c + 1);
        }
        if(inRange(r, c - 1) && !visited[r][c - 1] && grid[r][c - 1] == grid[r][c]) {
            counts[r][c - 1] = count;
            floodfill(r, c - 1);
        }
    }

    private static boolean inRange(int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }

    private static String print2darr(int[][] arr) {
        String res = "";
        for(int[] barr : arr) {
            for(int b : barr) 
                res += String.format("%1d", b);
            res += "\n";    
        }
        return res;
    }
}