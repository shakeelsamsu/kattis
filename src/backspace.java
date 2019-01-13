import java.io.*;
import java.util.*;

public class backspace {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        Deque<Character> queue = new LinkedList<Character>();
        String line = in.readLine();
        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(c == '<') queue.removeLast();
            else queue.add(c);
        }
        for(char c : queue) out.print(c);
        out.close();
    }
}