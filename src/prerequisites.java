import java.io.*;
import java.util.*;

public class prerequisites {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int k = Integer.parseInt(st.nextToken());
            if(k == 0) break;
            int n = Integer.parseInt(st.nextToken());
            HashSet<Integer> freddie = new HashSet<Integer>();
            st = new StringTokenizer(in.readLine());
            for(int i = 0; i < k; i++) freddie.add(Integer.parseInt(st.nextToken()));
            boolean status = true;
            int i = 0;
            for(; status && i < n; i++) {
                st = new StringTokenizer(in.readLine());
                int c = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                int met = 0;
                for(int j = 0; j < c; j++) {
                    int course = Integer.parseInt(st.nextToken());
                    if(freddie.contains(course)) met++;
                }
                status = met >= r;
            }
            for(; i < n; i++) in.readLine();
            out.println(status ? "yes" : "no");
        }
        out.close();
    }
}