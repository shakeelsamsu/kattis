import java.io.*;
import java.util.*;

public class torn2pieces {

    private static String res = "";

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        Graph g = new Graph();
        ArrayList<String> exists = new ArrayList<String>();
        for(int i = 0; i < n; i++) {
            String line = in.readLine();
            String name = line.substring(0, line.indexOf(" "));
            boolean contains = exists.contains(name);
            Node node;
            if(!contains) {
                exists.add(name);
                node = new Node(name);
            }
            else 
                node = g.getNode(name);
            String[] temp = line.substring(line.indexOf(" ") + 1).split(" ");
            for(int j = 0; j < temp.length; j++) {
                if(exists.contains(temp[j])) {
                    node.neighbors.add(g.getNode(temp[j]));
                    g.getNode(temp[j]).neighbors.add(node);
                }
                else {
                    exists.add(temp[j]);
                    g.addNode(temp[j], new Node(temp[j]));
                    node.neighbors.add(g.getNode(temp[j]));
                    g.getNode(temp[j]).neighbors.add(node);                    
                }
            }
            g.addNode(name, node);
        }
        StringTokenizer st = new StringTokenizer(in.readLine());
        String start = st.nextToken();
        String end = st.nextToken();
        if(g.graph.get(start) == null && g.graph.get(end) == null)
            out.println("no route found");
        else {
            List<Node> res = BFS(g.getNode(start), g.getNode(end));
            out.println(res.size() > 1 ? res.toString().replace("[", "").replace("]", "").replace(",", "") : "no route found");
        }
        out.close();
    }

    static class Graph {
        Map<String, Node> graph;

        public Graph() {
            graph = new HashMap<String, Node>();
        }

        public void addNode(String name, Node n) {
            graph.put(name, n);
        } 

        public Node getNode(String name) {
            return graph.get(name);
        }
    }

    static class Node {
        // public Node[] neighbors;
        public ArrayList<Node> neighbors;
        String name;
        boolean visited;

        public Node(String name) {
            this.name = name;
            this.visited = false;
            neighbors = new ArrayList<Node>();
        }
        
        public String toString() {
            return name;
        }

        public boolean equals(Object o) {
            return ((Node) o).name.equals(name);
        }
    }

    public static List<Node> BFS(Node start, Node finish) {
        List<Node> res = new LinkedList<Node>();
        Queue<Node> queue = new LinkedList<Node>();
        Map<Node, Node> prev = new HashMap<Node, Node>(); 
        start.visited = true;
        queue.add(start);

        while(!queue.isEmpty()) {
            Node v = queue.remove();
            if(v.equals(finish))
                break;
            else {
                for(Node w : v.neighbors) {
                    if(!w.visited) {
                        queue.add(w);
                        w.visited = true;
                        prev.put(w, v);
                    }
                }
            }
        }
        for(Node node = finish; node != null; node = prev.get(node))
            res.add(node);
        Collections.reverse(res);
        return res;
    }
}