import java.io.*;
import java.util.*;

public class vote {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            int c = Integer.parseInt(in.readLine());
            ArrayList<Integer> votes = new ArrayList<Integer>();
            int total = 0;
            for(int j = 0; j < c; j++) {
                votes.add(Integer.parseInt(in.readLine())); 
                total += votes.get(j);
            }
            int max = Collections.max(votes);
            int freq = Collections.frequency(votes, max);
            if(freq == 1) {
                boolean majority = max > total / 2;
                if(majority) out.println("majority winner " + (votes.indexOf(max) + 1));
                else out.println("minority winner " + (votes.indexOf(max) + 1));
            }
            else {
                out.println("no winner");
            }
        }
        out.close();
    }
}