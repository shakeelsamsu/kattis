import java.io.*;
import java.util.*;

public class heartrate {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            double b = Double.parseDouble(st.nextToken());
            double p = Double.parseDouble(st.nextToken());
            
            double actual = 60 * b / p;
            double min = actual - (60 / p);
            double max = actual + (60 / p);
            out.println(min + " " + actual + " " + max);
        }
        out.close();
    }
}