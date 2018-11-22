import java.io.*;
import java.util.*;
import java.math.*;

public class princesspeach {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine()); 
        
        int n = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        HashSet<Integer> found = new HashSet<Integer>();
        for(int i = 0; i < y; i++) found.add(Integer.parseInt(in.readLine()));
        for(int i = 0; i < n; i++) if(!found.contains(i)) out.println(i);
        out.println("Mario got " + found.size() + " of the dangerous obstacles.");
        out.close();
    }
}