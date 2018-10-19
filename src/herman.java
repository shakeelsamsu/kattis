import java.io.*;
import java.util.*;

public class herman {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        double r = Double.parseDouble(st.nextToken());
        out.printf("%.6f\n", Math.PI * r * r);
        out.printf("%.6f", r * r * 2);
        out.close();
    }
}