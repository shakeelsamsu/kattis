/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Oct 24 18 11:37:19 PM
 */

import java.util.*;
import java.io.*;

public class estimatingtheareaofacircle {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            double r = Double.parseDouble(st.nextToken());
            double m = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            if(r == 0) break;
            double ratio = c / m;
            double area = (2 * r) * (2 * r);
            double actualCircle = Math.PI * r * r;
            double estimatedCircle = ratio * area;
            out.printf("%.8f %.9f\n", actualCircle, estimatedCircle);
        }
        out.close();
    }
}