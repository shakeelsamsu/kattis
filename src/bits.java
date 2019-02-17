import java.io.*;
import java.util.*;

public class bits {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> ones = new ArrayList<Integer>();
            String x = in.readLine();
            for(int j = 0; j < x.length(); j++) {
                ones.add(countOnes(convertBinary(x.substring(0, j + 1))));
            }
            out.println(Collections.max(ones));
        }
        out.close();
    }

    public static String convertBinary(String num) {
        return Integer.toString(Integer.parseInt(num), 2);
    }

    public static int countOnes(String num) {
        int count = 0;
        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '1')
                count++;
        }
        return count;
    }
}