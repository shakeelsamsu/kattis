/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Oct 4 18 07:32:57 PM
 */

import java.io.*;
import java.util.*;

public class tetration {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        double n = Double.parseDouble(st.nextToken());
        out.printf("%.6f", Math.pow(n, 1/n));
        out.close();
    }
}