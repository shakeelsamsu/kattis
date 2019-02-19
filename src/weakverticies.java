import java.io.*;
import java.util.*;

public class weakvertices {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        while(true) {
            int n = Integer.parseInt(in.readLine());
            if(n == -1) break;
            TreeMap<Integer, Node> map = new TreeMap<Integer, Node>();
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                if(map.get(i) == null) map.put(i, new Node(i));
                for(int j = 0; j < n; j++) {
                    if(map.get(j) == null) map.put(j, new Node(j));
                    if(Integer.parseInt(st.nextToken()) == 1) {
                        map.get(j).neighbors.add(map.get(i));
                        map.get(i).neighbors.add(map.get(j));
                    }
                }
            }
            // for(int key : map.keySet()) {
            //     out.println(key + " " + map.get(key).neighbors);
            // }
            for(int key : map.keySet()) {
                if(!BFS(map.get(key)))
                    out.print(key + " ");
            }
            out.println();
        }
        out.close();
    }
    
    static class Node {
        int n;
        ArrayList<Node> neighbors;
        
        public Node(int n) {
            this.n = n;
            neighbors = new ArrayList<Node>();
        }
        
        public String toString() {
            return n + "";
        }
    }
    
    private static boolean BFS(Node start) {
        ArrayList<Node> check = start.neighbors;
        
        for(Node v : check) {
            if(!Collections.disjoint(check, v.neighbors))
                return true;
        }
        return false;
    }
}
