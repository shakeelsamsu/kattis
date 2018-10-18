import java.io.*;
import java.util.*;

public class sibice {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int min = Math.min(w, h);
        double max = Math.sqrt(w * w + h * h);
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int match = Integer.parseInt(st.nextToken());
            if(match <= max) out.println("DA");
            else out.println("NE");
        }
        out.close();
    }
}