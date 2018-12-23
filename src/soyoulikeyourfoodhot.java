import java.io.*;
import java.util.*;

public class soyoulikeyourfoodhot {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int total = (int)(Double.parseDouble(st.nextToken()) * 100 + 0.5);
        int p1 = (int) (Double.parseDouble(st.nextToken()) * 100 + 0.5);
        int p2 = (int) (Double.parseDouble(st.nextToken()) * 100 + 0.5);
        out.println(total + " " + p1 + " " + p2);
        int count = 0;
        int pitaNum = 0;
        boolean none = true;
        while(count <= total) {
            if((total - count) % p2 == 0) {
                none = false;
                out.println(pitaNum + " " + (total - count) / p2);
            }
            pitaNum++;
            count += p1;
        }
        if(none) out.println("none");
        out.close();
    }
}