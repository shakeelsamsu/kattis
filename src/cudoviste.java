import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int r = Integer.parseInt(st.nextToken());
        int c  = Integer.parseInt(st.nextToken());
        char[][] grid = new char[r][c];
        for(int i = 0; i < r; i++) {
            String line = in.readLine();
            for(int j = 0; j < c; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        int[] arr = new int[5];
        for(int i = 0; i < r - 1; i++) {
            for(int j = 0; j < c - 1; j++) {
                if(cant(grid, i, j)) continue;
                else arr[countCars(grid, i, j)]++;;
                // out.println(i + " " + j + " " + Arrays.toString(arr));
            }
        }
        for(int i : arr) out.println(i);
        out.close();
    }
    
    public static boolean cant(char[][] grid, int i, int j) {
        return (grid[i][j] == '#' || grid[i + 1][j] == '#' || grid[i][j + 1] == '#' || grid[i + 1][j + 1] == '#');
    }
    
    public static int countCars(char[][] grid, int i, int j) {
        int count = 0;
        if(grid[i][j] == 'X') count++;
        if(grid[i + 1][j] == 'X') count++;
        if(grid[i][j + 1] == 'X') count++;
        if(grid[i + 1][j + 1] == 'X') count++;
        return count;
    }
}
