import java.io.*;
import java.util.*;

public class closingtheloop {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(in.readLine());
            int s = Integer.parseInt(st.nextToken());
            ArrayList<Integer> red = new ArrayList<Integer>();
            ArrayList<Integer> blue = new ArrayList<Integer>();
            st = new StringTokenizer(in.readLine());
            while(st.hasMoreTokens()) {
                String token = st.nextToken();
                if(token.contains("R"))
                    red.add(Integer.parseInt(token.substring(0, token.indexOf("R"))));
                else
                    blue.add(Integer.parseInt(token.substring(0, token.indexOf("B"))));
            }
            Collections.sort(red);
            Collections.sort(blue);
            double total = 0;
            while(!red.isEmpty() && !blue.isEmpty()) {
                total += red.get(red.size() - 1);
                total += blue.get(blue.size() - 1);
                total -= 2;
                red.remove(red.size() - 1);
                blue.remove(blue.size() - 1);
            } 
            out.println("Case #" + i + ": " + (int) total);
        }
        out.close();
    }
}