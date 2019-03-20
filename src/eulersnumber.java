import java.io.*;
import java.util.*;
import java.math.*;

public class eulersnumber {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        BigDecimal approx = new BigDecimal(1);
        int n = Integer.parseInt(in.readLine());
        BigDecimal sum;
        if(n == 0) 
            sum = BigDecimal.ONE;
        else 
            sum = new BigDecimal(2);
        BigInteger factorial = new BigInteger(Integer.toString(1));
        for(int i = 2; i <= n; i++) {
            factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
            sum = sum.add(BigDecimal.ONE.divide(new BigDecimal(factorial), 15, BigDecimal.ROUND_DOWN));
            // out.println(BigDecimal.ONE.divide(new BigDecimal(factorial)));
        }
        out.println(sum);
        out.close();
    }

    private static BigInteger factorial(BigInteger n) {
        if(n.equals(BigInteger.ONE))
            return BigInteger.ONE;
        return factorial(n.subtract(BigInteger.ONE)).multiply(n);
    }
}