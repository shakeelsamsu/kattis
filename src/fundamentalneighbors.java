/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Oct 5 18 9:30:43 PM
 */

import java.util.*;
import java.io.*;

public class fundamentalneighbors {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String line;
        while((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            HashMap<Integer, Integer> primes = primeFactors(n);
            //out.println("primes: " + primes);
            int neighbour = 1;
            for(int key : primes.keySet()) {
                neighbour *= (int) Math.pow(primes.get(key), key);
            }
            out.println(n + " " + neighbour);
        }
        out.close();
    }
    public static HashMap<Integer, Integer> primeFactors(int n) 
    { 
        HashMap<Integer, Integer> out = new HashMap<Integer, Integer>();
        int count2 = 0;
        while (n % 2 == 0) { 
            count2++;
            n /= 2; 
        } 
        if(count2 != 0) out.put(2, count2);
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            int counti = 0;
            while (n % i == 0) 
            {
                counti++;
                n /= i; 
            } 
            if(counti != 0) out.put(i, counti);
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) out.put(n, 1);
        
        return out;
    } 
}