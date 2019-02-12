import java.io.*;
import java.util.*;

public class sretan {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int k = Integer.parseInt(in.readLine());
        int pow = findClosest(k);
        out.println(generate(pow, k));
        out.close();
    }

    private static int findClosest(int k) {
        int pow = 1;
        int sum = (int) Math.pow(2, pow);
        while(sum < k) {
            pow++;
            sum += (int) Math.pow(2, pow);
        }
        return pow - 1;
    }

    private static int getSum(int pow) {
        int sum = 0;
        for(int i = 1; i <= pow; i++) {
            sum += Math.pow(2, i);
        }
        return sum;
    }

    public static String generate(int pow, int k) {
        int length = pow + 1;
        String res = "";
        int check = (int) Math.pow(2, pow + 1);
        k -= getSum(pow);
        k--;
        for(int i = pow + 1; i > 0; i--) {
            res += k % Math.pow(2, i) < Math.pow(2, i - 1) ? "4" : "7";  
        }
        return res;
    }
}