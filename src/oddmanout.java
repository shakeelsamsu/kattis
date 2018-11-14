import java.util.*;
import java.io.*;

public class oddmanout {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int guests = Integer.parseInt(st.nextToken());
            ArrayList<Integer> one = new ArrayList<Integer>();
            ArrayList<Integer> two = new ArrayList<Integer>();
            st = new StringTokenizer(in.readLine());
            for(int j = 0; j < guests; j++) {
                int guest = Integer.parseInt(st.nextToken());
                if(!one.contains(guest)) one.add(guest);
                else two.add(guest);
            }
            one.removeAll(two);
            System.out.println("Case #" + (i + 1) + ": " + one.get(0));
        }
        
    }
}
