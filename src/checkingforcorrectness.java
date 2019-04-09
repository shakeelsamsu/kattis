import java.io.*;
import java.math.*;
import java.util.*;

public class checkingforcorrectness {

    private static BigInteger MOD = new BigInteger("10000");

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader in = new BufferedReader(new FileReader("System.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        while((line = in.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            BigInteger a = new BigInteger(st.nextToken().trim());
            String operation = st.nextToken().trim();
            BigInteger b = new BigInteger(st.nextToken().trim());
            if(operation.equals("+")) {
                String res = (a.add(b)).mod(MOD).toString();
                res = removeZero(res);
                out.println(res);
            }
            if(operation.equals("*")) {
                String res = (a.multiply(b)).mod(MOD).toString();
                res = removeZero(res);
                out.println(res);
            }
            if(operation.equals("^")) {
                String res = (a.modPow(b, MOD)).toString();
                res = removeZero(res);
                out.println(res);
            }
        }    
        // out.println(removeZero("01"));
        // out.println(removeZero("001"));
        // out.println(removeZero("0001"));
        // out.println(removeZero("010"));
        // out.println(removeZero("1001"));
        // out.println(removeZero("0101"));
        // out.println(removeZero("00"));
        out.close();    
    }

    public static String removeZero(String str) {
        if(str.equals("0")) return str;
        for(int i = 0; i < str.length(); i++) {
            if(str.substring(i, i + 1).equals("0")) {
                str = str.substring(i + 1);
                i--;
            }
            else break;
        }
        return str;
    }
}