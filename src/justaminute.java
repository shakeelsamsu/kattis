import java.util.*;
import java.io.*;

public class justaminute {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        double sum = 0;
        int mins = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int minutes = Integer.parseInt(st.nextToken());
            double seconds = (double) Integer.parseInt(st.nextToken());
            sum += (seconds / (minutes * 60)) * minutes;
            mins += minutes;
        }
        double average = sum / mins;
        if(average <= 1) out.println("measurement error");
        else out.printf("%.9f", average);
        out.close();
    }
}