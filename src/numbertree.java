import java.util.*;
import java.io.*;

public class numbertree {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        String instructions = "";
        if(st.hasMoreTokens()) instructions = st.nextToken();
        long i = 1;
        for(char c : instructions.toCharArray()) {
            i <<= 1;
            if(c != 'L') 
                i++;
        }
        out.println((long) Math.pow(2, n + 1) - (i));
        out.close();
    }
}