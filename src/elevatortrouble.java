import java.io.*;
import java.util.*;

public class elevatortrouble {

    private static Floor[] floors;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int f = Integer.parseInt(st.nextToken());        
        int s = Integer.parseInt(st.nextToken());        
        int g = Integer.parseInt(st.nextToken());        
        int u = Integer.parseInt(st.nextToken());        
        int d = Integer.parseInt(st.nextToken());        
        floors = new Floor[f];
        for(int i = 0; i < f; i++) {
            Floor temp = floors[i] == null ? new Floor(i + 1, 0) : floors[i];
            if(temp.level + u <= f && u != 0) {
                if(floors[temp.level + u - 1] == null) {
                    floors[temp.level + u - 1] = new Floor(temp.level + u, 0);
                }
                temp.children.add(floors[temp.level + u - 1]);
            }
            if(temp.level - d >= 1 && d != 0) 
                temp.children.add(floors[temp.level - d - 1]);   
            floors[i] = temp;
        }
        // for(Floor floor : floors) 
        //     out.println(floor + "\t " + floor.children.toString());
        Floor start = floors[s - 1];
        Floor end = floors[g - 1];
        out.println(bfs(start, end) ? end.pushes : "use the stairs");
        out.close();
    }

    public static boolean bfs(Floor start, Floor dest) {
        Queue<Floor> queue = new LinkedList<Floor>();
        queue.add(start);
        start.visited = true;
        start.pushes = 0;
        if(start.equals(dest)) 
            return true;

        while(!queue.isEmpty()) {
            Floor f = queue.poll();
            // System.out.println(f);
            for(Floor l : f.children) {
                if(!l.visited) {
                    l.visited = true;
                    l.pushes = f.pushes + 1;
                    // System.out.println(l + " " + l.children.toString() + " " + l.pushes);
                    queue.add(l);
                    if(l.equals(dest)) 
                        return true;
                }
            }
        }
        return false;
    }
}

class Floor {
    int level;
    int pushes;
    boolean visited;
    ArrayList<Floor> children;

    public Floor(int level, int pushes) {
        this.level = level;
        this.pushes = pushes;
        this.visited = false;
        children = new ArrayList<Floor>();
    }

    public boolean equals(Object o) {
        return level == ((Floor) o).level;
    }

    public String toString() {
        return "" + level;
    }
}