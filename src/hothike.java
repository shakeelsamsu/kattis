import java.io.*;
import java.util.*;

public class hothike {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        String[] tokens = in.readLine().split(" ");
        int[] temps = new int[tokens.length];
        for(int i = 0; i < tokens.length; i++) {
            temps[i] = Integer.parseInt(tokens[i]);
        }
        int day = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < temps.length - 2; i++) {
            if(Math.max(temps[i], temps[i + 2]) < max) {
                max = Math.max(temps[i], temps[i + 2]);
                day = i + 1;
            }
        }
        out.println(day + " " + max);
        out.close();
    }
}
