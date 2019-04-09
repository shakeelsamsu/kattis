import java.io.*;
import java.math.*;
import java.util.*;

public class checkingforcorrectness {

    private static BigInteger MOD = new BigInteger("10000");

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        while((line = in.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            BigInteger a = new BigInteger(st.nextToken().trim());
            String operation = st.nextToken().trim();
            BigInteger b = new BigInteger(st.nextToken().trim());
            if(operation.equals("+")) {
                String res = (a.add(b)).mod(MOD).toString();
                out.println(res);
            }
            if(operation.equals("*")) {
                String res = (a.multiply(b)).mod(MOD).toString();
                out.println(res);
            }
            if(operation.equals("^")) {
                String res = (a.modPow(b, MOD)).toString();
                out.println(res);
            }
        }    
        out.close();    
    }
}