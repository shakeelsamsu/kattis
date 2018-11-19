import java.io.*;
import java.util.*;
import java.math.*;

public class reversebinary {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String n = toBinary(in.readLine());
        String num = "";
        for(int i = n.length() - 1; i >= 0; i--) {
            num += n.substring(i, i + 1);
        }
        out.println(toDecimal(num));
        out.close();
    }

    public static String toBinary(String num) {
        return Integer.toString(Integer.parseInt(num), 2);
    }

    public static String toDecimal(String num) {
        return Integer.toString(Integer.parseInt(num, 2), 10);
    }
}