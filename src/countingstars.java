import java.io.*;
import java.util.*;

public class countingstars {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        int caseNum = 1;
        while((line = in.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] grid = new char[r][c];
            for(int i = 0; i < r; i++) {
                line = in.readLine();
                for(int j = 0; j < c; j++) {
                    grid[i][j] = line.charAt(j);
                }
            }
            int stars = 0;
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    if(grid[i][j] == '-') {
                        floodfill(grid, i, j);
                        stars++;
                    }
                }
            }
            out.println("Case " + caseNum + ": " + stars);
            caseNum++;
        }
        out.close();
    }

    private static void floodfill(char[][] grid, int r, int c) {
        if(!inRange(grid, r, c)) 
            return;
        if(grid[r][c] == '#')
            return;
        grid[r][c] = '#';
        if(inRange(grid, r + 1, c)) floodfill(grid, r + 1, c);
        if(inRange(grid, r - 1, c)) floodfill(grid, r - 1, c);
        if(inRange(grid, r, c + 1)) floodfill(grid, r, c + 1);
        if(inRange(grid, r, c - 1)) floodfill(grid, r, c - 1);
    }

    private static boolean inRange(char[][] grid, int r, int c) {
        return r >= 0 && c >= 0 && r < grid.length && c < grid[0].length;
    }
}
