import java.io.*;
import java.util.*;

public class leftbeehind {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x == 0 && y == 0) break;
            if(x + y == 13) out.println("Never speak again.");
            else if(x == y) out.println("Undecided.");
            else if(x < y) out.println("Left beehind.");
            else out.println("To the convention.");
        }
        out.close();
    }
}