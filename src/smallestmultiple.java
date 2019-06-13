import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class smallestmultiple {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String line = "";
        while((line = in.readLine()) != null) {
            String[] input = line.split(" ");
            BigInteger smallest = new BigInteger(input[0]);
            for(int z = 1; z < input.length; z++) {
                smallest = lcm(smallest.toString(), input[z]);
            } 
            System.out.println(smallest);
        }
        in.close();
    }

    public static BigInteger lcm(String a, String b) {
        BigInteger s = new BigInteger(a); 
        BigInteger s1 = new BigInteger(b);
        BigInteger mul = s.multiply(s1);
        BigInteger gcd = s.gcd(s1);
        BigInteger lcm = mul.divide(gcd);
        return lcm;
    }

}