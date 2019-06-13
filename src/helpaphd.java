import java.io.*;
import java.util.*;

public class helpaphd {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        while(n-- > 0) {
            String line = in.readLine();
            if(line.contains("+")) {
                out.println(Integer.parseInt(line.substring(0, line.indexOf("+"))) + Integer.parseInt(line.substring(line.indexOf("+"))));
            }
            else {
                out.println("skipped");
            }
        }
        out.close();
    }
}