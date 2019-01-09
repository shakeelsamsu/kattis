import java.io.*;
import java.util.*;

public class boatparts {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int p = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        HashSet<String> replaced = new HashSet<String>();
        int i;
        for(i = 0; i < n; i++) {
            if(replaced.size() == p) break;
            replaced.add(in.readLine());
        }
        //out.println(replaced);
        if(replaced.size() == p) out.println(i);
        else out.println("paradox avoided");
        out.close();
    }
}
