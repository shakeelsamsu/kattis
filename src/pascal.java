import java.io.*;
import java.util.*;

public class pascal {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        out.println(factor(n) < 0 ? n - 1 : n - n / factor(n));
        out.close();
    }

    private static int factor(int n) {
        if(n % 2 == 0) return 2;
        for(int i = 3; i <= Math.sqrt(n); i += 2) {
            if(n % i == 0) {
                return i;
            }
        }
        return -1;
    }


}