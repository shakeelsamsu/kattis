import java.io.*;
import java.util.*;

public class romans {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        double x = Double.parseDouble(st.nextToken());
        out.println(Math.round(x * 1000 * 5280 / 4854));
        out.close();
    }
}