import java.io.*;
import java.util.*;

public class deathknight {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(in.readLine().indexOf("CD") == -1) count++;
        }
        out.println(count);
        out.close();
    }
}