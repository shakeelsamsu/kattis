import java.io.*;
import java.util.*;
import java.math.*;

public class sumsquareddigits {
    public static void main(String args[]) throws Exception {
        
        HashMap<Character, Integer> letters = new HashMap<>();
        letters.put('A', 10);
        letters.put('B', 11);
        letters.put('C', 12);
        letters.put('D', 13);
        letters.put('E', 14);
        letters.put('F', 15);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int caseNum = Integer.parseInt(st.nextToken());
            int base  = Integer.parseInt(st.nextToken());
            String num = st.nextToken();
            num = convertBase(num, 10, base);
            int sum = 0;
            for(int j = 0; j < num.length(); j++) {
                String letter = num.substring(j, j + 1);
                int curr;
                if(letter.charAt(0) >= 'A') curr = letters.get(letter.charAt(0)); 
                else curr = Integer.parseInt(letter);
                sum += curr * curr;
            }
            out.println(caseNum + " " + sum);
        }
        out.close();
    }
    
    public static String convertBase(String num, int from, int to) {
        return Integer.toString(Integer.parseInt(num, from), to).toUpperCase();
    }
}
