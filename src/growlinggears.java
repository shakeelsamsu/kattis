import java.io.*;
import java.util.*;

public class growlinggears {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            if(n == 1) {
                in.readLine();
                out.println(1);
                continue;
            }
            int max = Integer.MIN_VALUE;
            double maxTorque = Integer.MIN_VALUE;
            for(int i = 1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                double temp = calcMax(a, b, c);
                // out.println(temp);
                // out.println(maxTorque);
                if(temp > maxTorque) {
                    maxTorque = temp;
                    max = i;
                }
            }
            out.println(max);
        }
        out.close();
    }

    private static double calcMax(int a, int b, int c) {
        double x = (double) (-b) / (-2 * (double) a);
        return -a * x * x + b * x + c;
    }
}