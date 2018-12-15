import java.io.*;
import java.util.*;

public class freefood {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        ArrayList<Boolean> times = new ArrayList<Boolean>();
        for(int i = 0; i < 365; i++) times.add(false);
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j = start - 1; j < end; j++) {
                if(!times.get(j)) times.set(j, true);
            }
        }
        out.println(Collections.frequency(times, true));
        out.close();
    }
}