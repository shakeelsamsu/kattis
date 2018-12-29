import java.io.*;
import java.util.*;

public class vacuumba {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            int p = Integer.parseInt(in.readLine());
            double x = 0;
            double y = 0;
            double currentHeading = 90;
            for(int j = 0; j < p; j++) {
                st = new StringTokenizer(in.readLine());
                double angle = Double.parseDouble(st.nextToken());
                double dist = Double.parseDouble(st.nextToken());
                currentHeading += angle;
                y += Math.sin(Math.toRadians(currentHeading)) * dist;
                x += Math.cos(Math.toRadians(currentHeading)) * dist;
            }
            out.println(String.format("%.6f", x) + " " + String.format("%.6f", y));
        }
        out.close();
    }
}