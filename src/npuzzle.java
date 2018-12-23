import java.io.*;
import java.util.*;

public class npuzzle {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        char[][] letters = {{'A', 'B', 'C', 'D'},
                            {'E', 'F', 'G', 'H'},
                            {'I', 'J', 'K', 'L'},
                            {'M', 'N', 'O', '.'}};
        char[][] grid = new char[4][4];
        for(int i = 0; i < 4; i++) {
            String line = in.readLine();
            for(int j = 0; j < 4; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        //out.println(Arrays.deepToString(grid));
        int total = 0;
        HashSet<Character> visited = new HashSet<Character>();
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                char c = grid[i][j];
                if(c != '.' && !visited.contains(c) && c != letters[i][j]) {
                    visited.add(grid[i][j]);
                    int[] arr = indexes(letters, c);
                    total += Math.abs(i - arr[0]) + Math.abs(j - arr[1]);
                    //out.println(c + " " + i + " " + j);
                }
            }
        }
        out.println(total);
        out.close();
    }

    public static int[] indexes(char[][] arr, char c) {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(arr[i][j] == c) {
                    int[] temp = {i, j};
                    return temp;
                }
            }
        }
        int[] temp = {0, 0};
        return temp;
    }
}