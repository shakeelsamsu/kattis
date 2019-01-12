import java.io.*;
import java.util.*;

public class thebackslashproblem {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        while((line = in.readLine()) != null) {
            int loi = Integer.parseInt(line);
            line = in.readLine();
            for(int i = 0; i < loi; i++) {
                String x = "";
                for(int j = 0; j < line.length(); j++) {
                    if(!special(line.charAt(j)))
                        x += line.substring(j, j + 1);
                    else {
                        x += "\\" + line.substring(j, j + 1);
                    }
                }
                line = x;
            }
            out.println(line);
        }
        out.close();
    }

    private static boolean special(char c) {
        return c >= '!' && c <= '*' || c >= '[' && c <= ']';
    }
}