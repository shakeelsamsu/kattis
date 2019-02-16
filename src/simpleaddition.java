import java.io.*;
import java.math.*;
import java.util.*;

public class simpleaddition {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        BigInteger a = new BigInteger(in.readLine());
        BigInteger b = new BigInteger(in.readLine());
        out.println(a.add(b));
        out.close();
    }
}