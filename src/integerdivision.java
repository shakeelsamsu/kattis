import java.io.*;
import java.util.*;

public class integerdivision {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        StringTokenizer st = new StringTokenizer(in.readLine());
        long n = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        
        st = new StringTokenizer(in.readLine());
        HashMap<Long, Long> map = new HashMap<Long, Long>();
        for(int i = 0; i < n; i++) {
            long x = Long.parseLong(st.nextToken());
            long temp = x / d;
            if(map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            }
            else {
                map.put(temp, 1l);
            }
        }
        long total = 0;
        for(Map.Entry<Long,Long> e : map.entrySet()) {
            if(e.getValue() >= 2) {
                total += e.getValue() * (e.getValue() - 1) / 2;
            }
        }
        out.println(total);
        out.close();
    }
}