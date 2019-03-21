import java.io.*;
import java.util.*;
import java.math.*;

public class basicremains {

    private static String ref = "0123456789";

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int b = Integer.parseInt(st.nextToken());
            if(b == 0) break;
            BigInteger p = new BigInteger(st.nextToken(), b);
            BigInteger m = new BigInteger(st.nextToken(), b);
            out.println(convertBack(new BigInteger(p.toString(10)).mod(new BigInteger(m.toString(10))), b));
        }
        out.close();
    }

    // private static BigInteger convertBase(BigInteger p, int b) {
    //     if(p.equals(BigInteger.ZERO)) return BigInteger.ZERO;
    //     BigInteger base = new BigInteger(Integer.toString(b));
    //     BigInteger res = BigInteger.ZERO;
    //     String s = p.toString();
    //     int count = 0;
    //     for(int i = s.length() - 1; i >= 0; i--) { 
    //         BigInteger temp = new BigInteger(s.substring(i, i + 1));
    //         res = res.add(temp.multiply(base.pow(count)));
    //         count++;
    //     }
    //     return res;
    // } 

    private static String convertBack(BigInteger num, int base) {
        String baseNums = ref.substring(0, base);
        String res = "";
        BigInteger b = new BigInteger(Integer.toString(base));
        if(num.equals(BigInteger.ZERO))
            return "0";
        while(!num.equals(BigInteger.ZERO)) {
            int i = num.mod(b).intValue();
            res = baseNums.substring(i, i + 1) + res;
            num = num.divide(b);
        }
        return res;
    }
}