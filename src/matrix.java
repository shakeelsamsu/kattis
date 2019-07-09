import java.io.*;
import java.util.*;

public class matrix {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line1;
        int t = 1;
        while((line1 = in.readLine()) != null) {
            int[] arr = new int[4];
            StringTokenizer st = new StringTokenizer(line1);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(in.readLine());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            out.println("Case " + t + ":");
            int determinant = a * d  - b * c;
            out.println(d / determinant + " " + -b / determinant);
            out.println(-c / determinant + " " + a / determinant);
            in.readLine();
            t++;
        }
        out.close();
    }
}