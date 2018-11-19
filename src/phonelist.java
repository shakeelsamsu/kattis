import java.io.*;
import java.util.*;
import java.math.*;

public class phonelist {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            boolean status = true;
            int phones = Integer.parseInt(in.readLine());
            ArrayList<String> numeros = new ArrayList<String>();
            for(int p = 0; p < phones; p++) numeros.add(in.readLine());
            Collections.sort(numeros);
            for(int j = 0; j < numeros.size() - 1; j++) {
                if(numeros.get(j + 1).indexOf(numeros.get(j)) == 0) status = false;
            }
            if(status) out.println("YES");
            else out.println("NO");
        }
        out.close();
    }
}