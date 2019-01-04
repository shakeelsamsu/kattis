import java.io.*;
import java.util.*;

public class humancannonball2 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            double vi = Double.parseDouble(st.nextToken());
            double theta = Double.parseDouble(st.nextToken());
            double x = Double.parseDouble(st.nextToken());
            double h1 = Double.parseDouble(st.nextToken());
            double h2 = Double.parseDouble(st.nextToken());
            double t = x / vi / Math.cos(Math.toRadians(theta));
            double y = vi * t * Math.sin(Math.toRadians(theta)) - 0.5 * 9.8 * t * t;
            out.println(y >= h1 + 1 && y <= h2 - 1 ? "Safe" : "Not Safe");
        }
        out.close();
    }
}