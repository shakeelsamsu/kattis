import java.io.*;
import java.util.*;

public class vauvau {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int aggA = Integer.parseInt(st.nextToken());
        int calmA = Integer.parseInt(st.nextToken());
        int aggB = Integer.parseInt(st.nextToken());
        int calmB = Integer.parseInt(st.nextToken());
        int totalA = aggA + calmA;
        int totalB = aggB + calmB;
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < 3; i++) {
            int time = Integer.parseInt(st.nextToken());
            int count = 0;
            if(time % totalA <= aggA && time % totalA > 0) count++;
            if(time % totalB <= aggB && time % totalB > 0) count++;
            if(count == 0) out.println("none");
            else if(count == 1) out.println("one");
            else out.println("both");
        }
        out.close();
    }
}