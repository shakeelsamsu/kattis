import java.io.*;
import java.util.*;

public class earlywinter {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        ArrayList<Integer> days = new ArrayList<Integer>();
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++) {
            int day = Integer.parseInt(st.nextToken());
            if(day <= d) break;
            days.add(day);
        }
        // int min = Collections.min(days);
        if(days.size() != n) {
            out.println("It hadn't snowed this early in " + days.size() + " years!");
        }
        else out.println("It had never snowed this early!");
        out.close();
    }
}
