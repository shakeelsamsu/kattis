import java.io.*;
import java.util.*;

public class onechicken {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());        
        if(n < m) {
            if(m - n == 1) out.println("Dr. Chaz will have 1 piece of chicken left over!");
            else out.println("Dr. Chaz will have " + (m - n) + " pieces of chicken left over!");
        }
        else {
            if(n - m == 1) out.println("Dr. Chaz needs 1 more piece of chicken!");
            else out.println("Dr. Chaz needs " + (n - m) + " more pieces of chicken!");
        }
        out.close();
    }
}