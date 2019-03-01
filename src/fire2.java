import java.io.*;
import java.util.*;

public class fire2 {

    private static char[][] map;
    private static boolean[][] visited;
    private static Queue<Node> queue;
    private static Queue<Node> fires;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int c = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            map = new char[r][c];
            visited = new boolean[r][c];
            queue = new LinkedList<>();
            fires = new LinkedList<>();
            for (int i = 0; i < r; i++) {
                String line = in.readLine();
                for (int j = 0; j < c; j++) {
                    char x = line.charAt(j);
                    if (x == '@') {
                        queue.add(new Node(i, j, 0));
                    } else if (x == '*') {
                        fires.add(new Node(i, j));
                    }
                    map[i][j] = x;
                }
            }
            long count = Long.MAX_VALUE;
            bfs: {
                while (queue.size() != 0) {
                    // printMap(out);
                    // out.println();
                    int size = fires.size();
                    while(size -- > 0) {
                        Node fire = fires.poll();
                        if(validLoc(fire.r + 1, fire.c)) {
                            map[fire.r + 1][fire.c] = '*';
                            fires.add(new Node(fire.r + 1, fire.c));
                        }
                        if(validLoc(fire.r - 1, fire.c)) {
                            map[fire.r - 1][fire.c] = '*';
                            fires.add(new Node(fire.r  - 1, fire.c));
                        }
                        if(validLoc(fire.r, fire.c + 1)) {
                            map[fire.r][fire.c + 1] = '*';
                            fires.add(new Node(fire.r, fire.c + 1));
                        }
                        if(validLoc(fire.r, fire.c - 1)) {
                            map[fire.r][fire.c - 1] = '*';
                            fires.add(new Node(fire.r, fire.c - 1));
                        }
                    }
                    
                    size = queue.size();
                    while (size-- > 0) {
                        Node curr = queue.poll();
                        Node temp = null;
                        if(escaped(curr.r, curr.c)) {
                            temp = new Node(curr.r, curr.c, curr.count);
                            count = temp.count;
                            break bfs;
                        }
                        if (validLoc(curr.r + 1, curr.c) && !visited[curr.r + 1][curr.c]) {
                            visited[curr.r + 1][curr.c] = true;
                            temp = new Node(curr.r + 1, curr.c, curr.count + 1);
                            queue.add(temp);
                            if (escaped(curr.r + 1, curr.c)) {
                                count = temp.count;
                                break bfs;
                            }
                        }
                        if (validLoc(curr.r - 1, curr.c) && !visited[curr.r - 1][curr.c]) {
                            visited[curr.r - 1][curr.c] = true;
                            temp = new Node(curr.r - 1, curr.c, curr.count + 1);
                            queue.add(temp);
                            if (escaped(curr.r - 1, curr.c)) {
                                count = temp.count;
                                break bfs;
                            }
                        }
                        if (validLoc(curr.r, curr.c + 1) && !visited[curr.r][curr.c + 1]) {
                            visited[curr.r + 1][curr.c] = true;
                            temp = new Node(curr.r, curr.c + 1, curr.count + 1);
                            queue.add(temp);
                            if (escaped(curr.r, curr.c + 1)) {
                                count = temp.count;
                                break bfs;
                            }
                        }
                        if (validLoc(curr.r, curr.c - 1) && !visited[curr.r][curr.c - 1]) {
                            visited[curr.r][curr.c - 1] = true;
                            temp = new Node(curr.r, curr.c - 1, curr.count + 1);
                            queue.add(temp);
                            if (escaped(curr.r, curr.c - 1)) {
                                count = temp.count;
                                break bfs;
                            }
                        }
                    }   
                }
            }
            out.println(count == Long.MAX_VALUE ? "IMPOSSIBLE" : count + 1);
        }
        out.close();
    }

    private static boolean validLoc(int r, int c) {
        return r >= 0 && r < map.length && c >= 0 && c < map[0].length
                && (map[r][c] != '#' && map[r][c] != '*');
    }

    private static boolean escaped(int r, int c) {
        return r == 0 || r == map.length - 1 || c == 0 || c == map[0].length - 1;
    }

    private static void printMap(PrintWriter out) {
        for(char[] arr : map) 
            out.println(arr);
    }
}

class Node {
    int r;
    int c;
    long count;

    public Node(int r, int c, long count) {
        this.r = r;
        this.c = c;
        this.count = count;
    }

    public Node(int r, int c) {
        this.r = r;
        this.c = c;
        count = 0;
    }
}