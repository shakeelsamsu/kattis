import java.util.*;
import java.io.*;

public class shatteredcake {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int w = Integer.parseInt(in.readLine());
        int sum = 0;
        int pieces = Integer.parseInt(in.readLine());
        for(int i = 0; i < pieces; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        out.println(sum / w);
        out.close();
    }
}