import java.io.*;
import java.util.*;

public class icpcteamselection {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            StringTokenizer st = new StringTokenizer(in.readLine());
            ArrayList<Integer> p = new ArrayList<Integer>();
            for(int i = 0; i < n * 3; i++) {
                p.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(p);
            int sum = 0;
            while(!p.isEmpty()) {
                sum += p.get(p.size() - 2);
                p.remove(0);
                p.remove(p.size() - 1);
                p.remove(p.size() - 1);
            }
            out.println(sum);
        }
        out.close();
    }
}