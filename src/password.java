import java.io.*;
import java.util.*;

public class password {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        double[] prob = new double[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            st.nextToken();
            prob[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(prob);
        int attempt = 1;
        double exp = 0;
        for(int i = n - 1; i >= 0; i--) {
            exp += attempt * prob[i]; 
            attempt++;
        }
        out.println(exp);
        out.close();
    }
}