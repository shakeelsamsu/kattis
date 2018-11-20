import java.io.*;
import java.util.*;
import java.math.*;

public class cd {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(n == 0 && m == 0) break;
            HashSet<Integer> cds = new HashSet<Integer>();
            for(int i = 0; i < n + m; i++) cds.add(Integer.parseInt(in.readLine()));
            out.println(n + m - cds.size());
        }
        out.close();
    }
}