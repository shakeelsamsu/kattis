import java.io.*;
import java.util.*;

public class imageprocessing {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] image = new int[h][w];        
        for(int i = 0; i < h; i++) {
            st = new StringTokenizer(in.readLine());
            for(int j = 0; j < w; j++) {
                image[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ArrayList<Integer> formula = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            for(int j = 0; j < m; j++) formula.add(Integer.parseInt(st.nextToken()));
        }
        Collections.reverse(formula);
        int[][] convoluted = new int[h - n + 1][w - m + 1];
        for(int i = 0; i <= h - n; i++) {
            for(int j = 0; j <= w - m; j++) {
                convoluted[i][j] += formula(formula, image, i, j, n, m);
            }
        }
        for(int i = 0; i < h - n + 1; i++) {
            for(int j = 0; j < w - m + 1; j++) {
                out.print(convoluted[i][j] + " ");
            }
            out.println();
        }
        out.close();
    }

    private static int formula(ArrayList<Integer> formula, int[][] grid, int r, int c, int n, int m) {
        int count = 0;
        int result = 0;
        for(int i = r; i < r + n; i++) {
            for(int j = c; j < c + m; j++) {
                result += formula.get(count) * grid[i][j];
                count++;
            }
        }
        return result;
    }
}