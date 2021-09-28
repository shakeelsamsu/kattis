import java.io.*;
import java.util.*;


public class hauntedgraveyard {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));


        while(true) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int w = Integer.parseInt(st.nextToken()); 
            int h = Integer.parseInt(st.nextToken());        

            if(w == 0 && h == 0) break;

            int[][][] map = new int[h][w][3];
            
            int g = Integer.parseInt(in.readLine());
            for(int i = 0; i < map.length; i++) {
                for(int j = 0; j < map[0].length; j++) {
                    map[i][j][0] = -2;
                }
            }

            map[h - 1][w - 1][0] = -3;
            
            while(g-- > 0) {
                st = new StringTokenizer(in.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[y][x][0] = -1;
            }
            
            int e = Integer.parseInt(in.readLine());
            while(e-- > 0) {
                st = new StringTokenizer(in.readLine());
                int x1 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());

                map[y1][x1] = new int[] {y2, x2, t};
            }
            
            ArrayList<int[]> edges = new ArrayList<int[]>();
            for(int i = 0; i < map.length; i++) {
                for(int j = 0; j < map[0].length; j++) {
                    if(map[i][j][0] != -1)
                        addEdges(map, edges, i, j);
                }
            }

            // for(int[] edge : edges) {
            //     System.out.println(Arrays.toString(edge));
            // }

            int INF = 1000000000;
            int[] d = new int[h * w];
            Arrays.fill(d, INF);
            d[0] = 0;
            boolean updated = false;
            for(int i = 0; i <= h * w; i++) {
                updated = false;
                for(int j = 0; j < edges.size(); j++) {
                    int[] edge = edges.get(j);
                    int src = edge[0] * w + edge[1];
                    int dst = edge[2] * w + edge[3];
                    int cost = edge[4];
                    if(d[src] < INF) {
                        if(d[src] + cost < d[dst]) {
                            d[dst] = d[src] + cost;
                            updated = true;
                            // System.out.printf("%d %d %d %d | %d %d %d\n", edge[0], edge[1], edge[2], edge[3], src, dst, d[dst]);
                        }
                    }
                }
                if(!updated) break;
            }

            out.println(updated ? "Never" : (d[h * w - 1] == INF ? "Impossible" : d[h * w - 1]));
        }
        out.close();
    }

    public static void addEdges(int[][][] map, ArrayList<int[]> edges, int i, int j) {
        int[] dx = new int[] {1, -1, 0, 0};
        int[] dy = new int[] {0, 0, 1, -1};

        if(map[i][j][0] == -3) {
            return;
        }

        for(int d = 0; d < 4; d++) {
            int y = i + dx[d];
            int x = j + dy[d];
            if(inRange(map, y, x)) {
                if(map[i][j][0] == -2) {
                    if(map[y][x][0] != -1)
                        edges.add(new int[] {i, j, y, x, 1});
                }    
                else {
                    edges.add(new int[] {i, j, map[i][j][0], map[i][j][1], map[i][j][2]});
                    return;
                }
            }
        }
    }

    public static boolean inRange(int[][][] map, int i, int j) {
        return i >= 0 && j >= 0 && i < map.length && j < map[0].length;
    }
}