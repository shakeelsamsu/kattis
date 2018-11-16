import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class convexpolygonarea {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        DecimalFormat df = new DecimalFormat("###.#");
        
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            ArrayList<Integer> x = new ArrayList<Integer>();
            ArrayList<Integer> y = new ArrayList<Integer>();
            int points = Integer.parseInt(st.nextToken());
            for(int j = 0; j < points; j++) {
                x.add(Integer.parseInt(st.nextToken()));
                y.add(Integer.parseInt(st.nextToken()));
            }
            out.println(df.format(shoelace(x, y)));
        }
        out.close();
    }
    
    public static double shoelace(ArrayList<Integer> x, ArrayList<Integer> y) {
        double sum = x.get(x.size() - 1) * y.get(0) - y.get(y.size() - 1) * x.get(0);
        for(int i = 0; i < x.size() - 1; i++) sum += x.get(i) * y.get(i + 1);
        for(int i = 0; i < y.size() - 1; i++) sum -= y.get(i) * x.get(i + 1);
        return Math.abs(sum / 2);
    }
}
