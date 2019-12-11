import java.io.*;
import java.util.*;
import java.math.*;

public class drinkingsong {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        //StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(in.readLine());
        String word = in.readLine();
        while(n > 1) {
            out.println(n + " bottles of " + word + " on the wall, " + n + " bottles of " + word + ".");
            if(n == 2) out.println("Take one down, pass it around, 1 bottle of " + word + " on the wall.");
            else out.println("Take one down, pass it around, " + (n - 1) + " bottles of " + word + " on the wall.");
            out.println();
            n--;
        }
        out.println("1 bottle of " + word + " on the wall, 1 bottle of " + word + ".");
        out.println("Take it down, pass it around, no more bottles of " + word + ".");
        out.close();
    }
}