import java.io.*;
import java.util.*;

public class integerlists {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            char[] commands = in.readLine().toCharArray();
            int e = Integer.parseInt(in.readLine());
            String temp = in.readLine();
            String[] input = temp.length() > 2 ? temp.substring(1, temp.length() - 1).split(",") : new String[0];
            boolean front = true;
            boolean error = false;
            Deque<String> queue = new LinkedList<String>();
            for(String s : input) queue.add(s.trim());
            for(char c : commands) {
                if(c == 'R') front = !front;
                else {
                    if(queue.size() == 0) {
                        error = true;
                        break;
                    }
                    if(front) {
                        queue.removeFirst();
                    }
                    else {
                        queue.removeLast();
                    }
                }
            }
            if(error) out.print("error");
            else if(!front) {
                Iterator<String> itr = queue.iterator();
                Deque<String> rev = new LinkedList<String>();
                while(itr.hasNext()) {
                    rev.push(itr.next());
                }
                out.print(rev.toString().replace(" ", ""));                
            }
            else out.print(queue.toString().replace(" ", ""));
            out.println();
        }
        out.close();
    }
}