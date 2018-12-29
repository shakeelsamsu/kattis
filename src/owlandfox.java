import java.io.*;
import java.util.*;

public class owlandfox {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            int x = Integer.parseInt(in.readLine());
            int sum = sd(x);
            int res = 0;
            for(int j = x - 1; j >= 0; j--) {
                if(sd(j) == sum - 1) {
                    res = j;
                    break;
                }
            }
            out.println(res);
        }
        out.close();
    }

    public static int sd(int n) {
        int res = 0;
        while(n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }
}