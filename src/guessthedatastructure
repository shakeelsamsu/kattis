import java.io.*;
import java.util.*;

public class guessthedatastructure {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("System.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        while((line = in.readLine()) != null) {
            PriorityQueue<Integer> pqueue = new PriorityQueue<>((x, y) -> y - x);
            Queue<Integer> queue = new LinkedList<>();
            Stack<Integer> stack = new Stack<>();
            boolean pq = true, q = true, s = true;
            int n = Integer.parseInt(line);
            while(n-- > 0) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                int op = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                switch (op) {
                    case 1:
                        pq = pq && pqueue.add(x);
                        q = q && queue.add(x);
                        s = s && stack.add(x);
                        break;
                    case 2:
                        pq = pqueue.isEmpty() ? false : pq && x == pqueue.poll();
                        q = queue.isEmpty() ? false : q && x == queue.poll();
                        s = stack.isEmpty() ? false : s && x == stack.pop();
                        break;
                }
            }
            String res = "";
            if(s) {
                if(pq || q)
                    res = "not sure";
                else
                    res = "stack";
            }
            else if(q) {
                if(s || pq)
                    res = "not sure";
                else
                    res = "queue";
            }
            else if(pq) {
                if(s || q)
                    res = "not sure";
                else
                    res = "priority queue";
            }
            else {
                res = "impossible";
            }
            out.println(res);
        }

        out.close();
    }
}
