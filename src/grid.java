import java.io.*;
import java.util.*;

public class grid {

    private static int dist = 0;
    private static List<Node> res;

    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        Node[][] grid = new Node[r][c];
        for(int i = 0; i < r; i++) 
            for(int j = 0; j < c; j++) 
                grid[i][j] = new Node(i, j);
        for(int i = 0; i < r; i++) {
            String line = in.readLine();
            for(int j = 0; j < c; j++) {
                int val = Integer.parseInt(line.substring(j, j + 1));
                grid[i][j].setVal(val);
                if(inRange(grid, i + val, j))
                    grid[i][j].addConnected(grid[i + val][j]);
                if(inRange(grid, i - val, j))
                    grid[i][j].addConnected(grid[i - val][j]);
                if(inRange(grid, i, j + val))
                    grid[i][j].addConnected(grid[i][j + val]);
                if(inRange(grid, i, j - val))
                    grid[i][j].addConnected(grid[i][j - val]);
            }
        }
        out.println(bfs(grid[0][0], grid[r - 1][c - 1]) ? dist - 1 : -1);
        out.close();
    }
    
    private static boolean inRange(Node[][] grid, int r, int c) {
        return r >= 0 && c >= 0 && r < grid.length && c < grid[0].length;
    }
    
    private static boolean bfs(Node source, Node destination) {
        res = new LinkedList<Node>();
        Queue<Node> queue = new LinkedList<Node>();
        Map<Node, Node> prev = new HashMap<Node, Node>();        
        queue.add(source);
        source.visited = true;

        boolean status = false;
        while(!queue.isEmpty() && !status) {
            Node v = queue.poll();
            for(Node j : v.connected) {
                if(!j.visited) {
                    prev.put(j, v);
                    j.visited = true;
                    queue.add(j);
                    if(j.equals(destination)) 
                        status = true;
                }
            }
        }
        for(Node node = destination; node != null; node = prev.get(node))
            res.add(node);
        dist = res.size();
        return status;
    }
}

class Node {
    int val;
    int i;
    int j;
    List<Node> connected;
    boolean visited;
    
    public Node(int i, int j) {
        this.i = i;
        this.j = j;
        connected = new ArrayList<Node>();
        visited = false;
    }
    
    public void setVal(int val) {
        this.val = val;
    }

    public void addConnected(Node n) {
        if(!n.equals(this)) connected.add(n);
    }

    public String toString() {
        return val + " " + i + " " + j;
    }
    
    public boolean equals(Object o) {
        return ((Node) o).i == i && ((Node) o).j == j;
    }
}

