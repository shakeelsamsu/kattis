import java.io.*;
import java.util.*;

public class heirsdilemma {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int l = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int count = 0;
        for(int i = l; i <= h; i++) { 
            if(possible(i))
                count++; 
        }
        out.println(count);
        out.close();
    }   

    public static boolean possible(int combo) {
        return different(combo) && divisible(combo);
    }   

    public static boolean different(int n) {
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++)
            if(s.indexOf(s.substring(i, i + 1)) != s.lastIndexOf(s.substring(i, i + 1)))
                return false;
        return true;
    }

    public static boolean divisible(int combo) {
        String s = Integer.toString(combo);
        for(int i = 0; i < s.length(); i++) {
            int digit = Integer.parseInt(s.substring(i, i + 1));
            if(digit == 0) return false;
            else if(digit != 0 && combo % digit != 0)
                return false;
        }
        return true;
    }
}