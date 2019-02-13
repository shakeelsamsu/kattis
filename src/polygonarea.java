import java.io.*;
import java.util.*;

public class polygonarea {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true) {
            int n = Integer.parseInt(in.readLine());
            if(n == 0) break;
            ArrayList<Long> x = new ArrayList<Long>();
            ArrayList<Long> y = new ArrayList<Long>();
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                x.add(Long.parseLong(st.nextToken()));
                y.add(Long.parseLong(st.nextToken()));
            }
            double area = 0.5 * sumEdges(x, y);
            boolean cw = area >= 0;
            out.println(cw ? String.format("CW %.1f", area) : String.format("CCW %.1f", -area));
        }
        out.close();
    }

    private static long sumEdges(ArrayList<Long> x, ArrayList<Long> y) {
        long sum = (x.get(0) - x.get(x.size() - 1)) * (y.get(0) + y.get(y.size() - 1));
        for(int i = 1; i < x.size(); i++) {
            sum += (x.get(i) - x.get(i - 1)) * (y.get(i) + y.get(i - 1));
        }
        return sum;
    }
}