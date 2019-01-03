import java.io.*;
import java.util.*;

public class skener {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        for(int i = 0; i < r; i++) {
            char[] chars = in.readLine().toCharArray();
            for(int t = 0; t < v; t++) {
                for(int j = 0; j < c; j++) {
                    for(int l = 0; l < h; l++) {
                        out.print(chars[j]);
                    }
                }
                out.println();
            }
        }
        out.close();
    }
}