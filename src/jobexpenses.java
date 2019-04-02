import java.io.*;
import java.util.*;

public class jobexpenses {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        int expenses = 0;
        while(st.hasMoreTokens()) {
            int k = Integer.parseInt(st.nextToken());
            if(k < 0) expenses += -k;
        }
        out.println(expenses);
        out.close();
    }
}