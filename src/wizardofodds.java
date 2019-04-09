import java.io.*;
import java.util.*;
import java.math.*;

public class wizardofodds {
    
    public static final BigInteger TWO = new BigInteger("2");
    
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger k = new BigInteger(st.nextToken());
        out.println(TWO.pow(k.intValue()).compareTo(n) < 0 ? "You will become a flying monkey!" : "Your wish is granted!");
        out.close();
    }
}
