import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class fontan {

    static char[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        grid = new char[r][c];
        visited = new boolean[r][c];

        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < r; i++) {
            String line = in.readLine();
            for(int j = 0; j < c; j++) {
                grid[i][j] = line.charAt(j);
                if(grid[i][j] == 'V') {
                    queue.offer(new int[] {i, j});
                }
            }
        }

        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            if(!inRange(curr[0], curr[1])) continue;
            if(visited[curr[0]][curr[1]]) continue;
            visited[curr[0]][curr[1]] = true;
            if(grid[curr[0]][curr[1]] != '#') grid[curr[0]][curr[1]] = 'V';
            if(!inRange(curr[0]+1, curr[1])) continue;
            if(grid[curr[0]][curr[1]] == '#') continue;
            if(grid[curr[0]+1][curr[1]] == '#') {
                queue.offer(new int[] {curr[0], curr[1]-1});
                queue.offer(new int[] {curr[0], curr[1]+1});
            }
            else {
                queue.offer(new int[] {curr[0]+1, curr[1]});
            }
//            System.out.println(queue.size());
        }
        for(char[] row : grid) {
            out.println(new String(row));
        }
        out.close();
    }

    public static boolean inRange(int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }
}
