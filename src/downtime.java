import java.io.*;
import java.util.*;
import java.math.*;

public class downtime {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] times = new int[101001];
        while(n-- > 0) {
            int time = Integer.parseInt(in.readLine());
            times[time]++;
            times[time + 1000]--;
        }

        int max = 0;
        for(int i = 1; i < times.length; i++) {
            times[i] += times[i - 1];
            max = Math.max(max, times[i]);
        }
        out.println((int) Math.ceil(max / (double) k));
        out.close();
    }
}