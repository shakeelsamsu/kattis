import java.io.*;
import java.util.*;

public class connectn {

    static char[][] grid;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
    
        grid = new char[r][c];
        for(int i = 0; i < r; i++) {
            st = new StringTokenizer(in.readLine());
            for(int j = 0; j < c; j++) {
                grid[i][j] = st.nextToken().charAt(0);
            }
        }
        
        char color = ' ';
        boolean status = false;
        for(int i = 0; !status && i < r; i++) {
            for(int j = 0; !status && j < c; j++) {
                if(grid[i][j] == 'O') continue;
                if(!status) status = checkRDiagonal(i, j, n);
                if(!status) status = checkLDiagonal(i, j, n);
                if(!status) status = checkRow(i, j, n);
                if(!status) status = checkCol(i, j, n);
                if(status) color = grid[i][j];
            }
        }

        switch(color) {
            case 'B': 
                out.println("BLUE WINS");
                break;
            case 'R':
                out.println("RED WINS");
                break;
            default:
                out.println("NONE");
                break;
        }
        out.close();
    }

    public static boolean checkRDiagonal(int r, int c, int n) {
        char color = grid[r][c];
        if (r + n - 1 >= grid.length || c + n - 1 >= grid[0].length)
            return false;
        for (int i = 0; i < n; i++)
            if (grid[r + i][c + i] != color)
                return false;
        // System.out.println("rd " + r + " " + c + " " + n);
        return true;
    }

    public static boolean checkLDiagonal(int r, int c, int n) {
        char color = grid[r][c];
        if (r + n - 1 >= grid.length || c - (n - 1) < 0)
            return false;
        for (int i = 0; i < n; i++)
            if (grid[r + i][c - i] != color)
                return false;
        // System.out.println("ld " + r + " " + c + " " + n);
        return true;
    }

    public static boolean checkRow(int r, int c, int n) {
        char color = grid[r][c];
        if (c + n - 1 >= grid[0].length)
            return false;
        for (int i = 1; i < n; i++)
            if (grid[r][c + i] != color)
                return false;
        // System.out.println("r " + r + " " + c + " " + n);
        return true;
    }

    public static boolean checkCol(int r, int c, int n) {
        char color = grid[r][c];
        if (r + n - 1 >= grid.length)
            return false;
        for (int i = 1; i < n; i++)
            if (grid[r + i][c] != color)
                return false;
        // System.out.println("c " + r + " " + c + " " + n);
        return true;
    }
}