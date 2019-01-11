import java.io.*;
import java.util.*;

public class tolower {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        
        int count = 0;
        for(int i = 0; i < p; i++) {
            int j;
            boolean status = true;
            for(j = 0; j < t; j++) {
                String s = in.readLine();
                if(!lowercase(s.substring(0, 1).toLowerCase() + s.substring(1))) 
                    status = false;
            }
            if(status) count++;
        }
        out.println(count);
        out.close();
    }

    public static boolean lowercase(String s) {
        return s.equals(s.toLowerCase());
    }
}