import java.io.*;
import java.util.*;

public class primalrepresentation {
    
    private static ArrayList<Integer> factors;
    
    public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String line = "";
        while((line = in.readLine()) != null) {
            factors = new ArrayList<Integer>();
            int n = Integer.parseInt(line);
            factor(Math.abs(n));
            if(n < 0)
                out.print("-1 ");
            while(!factors.isEmpty()) {
                int factor = factors.get(0);
                int freq = Collections.frequency(factors, factor);
                if(freq > 1)
                    out.print(factor + "^" + freq + " ");
                else
                    out.print(factor + " ");
                factors.removeAll(Collections.singleton(factor));
            }
            out.println();
        }
        out.close();
    }
    
    private static void factor(int n) {
        while(n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for(int i = 3; i <= Math.sqrt(n); i += 2) {
            while(n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if(n > 2)
            factors.add(n);
    }
}
