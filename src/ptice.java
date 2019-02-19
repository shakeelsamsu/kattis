import java.io.*;
import java.util.*;

public class ptice {
    
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        String seq = in.readLine();
        String[] names = {"Adrian", "Bruno", "Goran"};
        char[] adrian = {'A', 'B', 'C'};
        char[] bruno = {'B', 'A', 'B', 'C'};
        char[] goran = {'C', 'C', 'A', 'A', 'B', 'B'};
        int a = countCommon(seq, adrian);
        int b = countCommon(seq, bruno);
        int g = countCommon(seq, goran);
        int[] counts = {a, b, g};
        int max = Math.max(a, Math.max(b, g));
        out.println(max);
        for(int i = 0; i < 3; i++)
            if(counts[i] == max)
                out.println(names[i]);
        out.close();
    }
    
    private static int countCommon(String seq, char[] arr) {
        int count = 0;
        for(int i = 0; i < seq.length(); i++) 
            if(seq.charAt(i) == arr[i % arr.length])
                count++;
        return count;
    }
}
