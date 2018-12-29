import java.io.*;
import java.util.*;

public class cups {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = in.nextInt();
        TreeMap<Integer, String> cups = new TreeMap<Integer, String>();
        for(int i = 0; i < n; i++) {
            int radius;
            String color;
            if(in.hasNextInt()) {
                radius = in.nextInt() / 2;
                color = in.next();
            }
            else {
                color = in.next();
                radius = in.nextInt();
            }
            cups.put(radius, color);
        }
        //out.println(cups);
        for(int r : cups.keySet()) {
            out.println(cups.get(r));
        }
        out.close();
    }
}