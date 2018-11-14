import java.io.*;
import java.util.*;
public class everywhere {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(in.readLine());
            HashSet<String> cities = new HashSet<>();
            for(int j = 0; j < a; j++) cities.add(in.readLine());
            out.println(cities.size());
        }
        out.close();
    }
}
