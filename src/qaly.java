import java.util.*;
import java.io.*;

public class qaly {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        double qaly = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            qaly += Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken());
        }
        out.println(String.format("%.3f", qaly));
        out.close();
    }
}
