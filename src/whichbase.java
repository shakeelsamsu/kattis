import java.io.*;
import java.util.*;

public class whichbase {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out))); 
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int caseNum = Integer.parseInt(st.nextToken());
            String num = st.nextToken();
            out.println(caseNum + " " + (possible(num) ? convertBase(num, 8) : "0") + " " + convertBase(num, 10) + " " + convertBase(num, 16));
        }
        out.close();
    }

    public static boolean possible(String s) {
        return !s.contains("8") && !s.contains("9");
    }

    public static String convertBase(String num, int r) {
        return Integer.toString(Integer.parseInt(num, r));
    }
}