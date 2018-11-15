import java.io.*;
import java.util.*;
import java.math.*;

public class arithmetic {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        BigInteger num = new BigInteger(in.readLine(), 8);
        String str = num.toString(16);
        out.println(str.toUpperCase());
        out.close();
    }
}