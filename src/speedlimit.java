import java.io.*;
import java.util.*;

public class speedlimit {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true) {
            int n = Integer.parseInt(in.readLine());
            if(n == -1) break;
            int totalHours = 0;
            int miles = 0;
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                int mph = Integer.parseInt(st.nextToken());
                int hours = Integer.parseInt(st.nextToken());
                miles += (hours - totalHours) * mph;
                //out.println(i + " " + totalHours);
                totalHours = hours; 
            }
            out.println(miles + " " + "miles");
        }
        out.close();
    }
}