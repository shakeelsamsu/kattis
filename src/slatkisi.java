import java.io.*;
import java.util.*;

public class slatkisi {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        double c = Double.parseDouble(st.nextToken());
        double k = Double.parseDouble(st.nextToken());
        out.println((long) (Math.round(c / Math.pow(10, k)) * Math.pow(10, k)));
        out.close();
    }
}