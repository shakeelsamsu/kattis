import java.util.*;
import java.io.*;

public class simon {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            ArrayList<String> phrase = new ArrayList<String>();
            for(String s : input) phrase.add(s);
            if(phrase.contains("simon") && phrase.contains("says")) {
                for(int k = 2;  k < phrase.size(); k++) {
                    System.out.print(phrase.get(k) + " ");
                }
                System.out.println();
            }
            else {
                System.out.println();
            }
        }
    }
}