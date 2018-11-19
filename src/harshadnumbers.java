import java.io.*;
import java.util.*;
import java.math.*;

public class harshadnumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        while(!isHarshad(n)) n++;
        out.println(n);
        out.close();
    }

    public static boolean isHarshad(int n) {
        return n % sumDigits(n) == 0;
    }

    public static int sumDigits(int n) {
        String num = Integer.toString(n); 
        int sum = 0;
        for(int i = 0; i < num.length(); i++) sum += Integer.parseInt(num.substring(i, i + 1));
        return sum;
    }
}
        