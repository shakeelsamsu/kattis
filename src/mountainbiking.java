import java.io.*;
import java.util.*;

public class mountainbiking {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        double g = Double.parseDouble(st.nextToken());
        double[] dist = new double[n];
        double[] theta = new double[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            double d = Double.parseDouble(st.nextToken());
            double t = Double.parseDouble(st.nextToken());
            dist[i] = d;
            theta[i] = t;
        }
        double v = 0;
        ArrayList<Double> output = new ArrayList<Double>();
        for(int i = n - 1; i >= 0; i--) {
            v = Math.sqrt(v * v + 2 * g * Math.cos(Math.toRadians(theta[i])) * dist[i]);
            output.add(v);
        }
        for(int i = output.size() - 1; i >= 0; i--)
            out.println(output.get(i));
        out.close();
    }
}