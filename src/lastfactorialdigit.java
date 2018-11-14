import java.io.*;
import java.util.*;
import java.math.*;

public class lastfactorialdigit {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            BigInteger num = new BigInteger(in.readLine());
            out.println(factorial(num).mod(new BigInteger("10")));
        }
        out.close();
    }
    
    public static BigInteger factorial(BigInteger num) {
        if(num.equals(BigInteger.valueOf(1))) return num;
        return num.multiply(factorial(num.subtract(new BigInteger("1"))));
    } 
}
