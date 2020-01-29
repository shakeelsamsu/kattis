import java.io.*;
import java.util.*;

public class knightjump {

    static char[][] board;
    static boolean[][] visited;
    static int[][] moves;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        board = new char[n][n];
        visited = new boolean[n][n];
        moves = new int[n][n];

        int startR = 0, startC = 0;
        int[] dr = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] dc = {1, -1, 1, -1, 2, -2, 2, -2};

        for(int i = 0; i < n; i++) {
            String line = in.readLine();
            for(int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j);
                moves[i][j] = Integer.MAX_VALUE;
                if(board[i][j] == 'K') {
                    startR = i;
                    startC = j;
                    moves[i][j] = 0;
                }
            }
        }
        Queue<Pos> queue = new LinkedList<Pos>();
        Pos start = new Pos(startR, startC);
        start.x = 0;
        queue.offer(start);
        while(!queue.isEmpty()) {
            Pos u = queue.poll();
            if(!inRange(u.r, u.c)) continue;
            if(visited[u.r][u.c])
                continue;
            visited[u.r][u.c] = true;
            if(board[u.r][u.c] == '#') continue;
            moves[u.r][u.c] = Math.min(moves[u.r][u.c], u.x);
            for(int i = 0; i < dr.length; i++) {
                Pos v = new Pos(u.r + dr[i], u.c + dc[i]);
                v.x = u.x + 1;
                queue.offer(v);
            }
        }
        out.println(moves[0][0] == Integer.MAX_VALUE ? -1 : moves[0][0]);
        out.close();
    }

    private static boolean inRange(int r, int c) {
        return r < board.length && r >= 0 && c < board.length && c >= 0;
    }
}

class Pos {
    int r;
    int c;
    int x;

    public Pos(int r, int c) {
        this.r = r;
        this.c = c;
    }
}