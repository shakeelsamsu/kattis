import java.io.*;
import java.util.*;

public class teacherevaluation {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        ArrayList<Integer> scores = new ArrayList<Integer>();
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++) scores.add(Integer.parseInt(st.nextToken()));
        double avg = average(scores);
        if(p == 100 && avg != p) out.println("impossible");
        else {
            double total = sum(scores);
            int add = 0;
            while(total / scores.size() < p || add == Integer.MAX_VALUE) {
                total += 100;
                scores.add(100);
                add++;
            }
            out.println(add);
        }
        out.close();
    }
    
    public static double average(ArrayList<Integer> scores) {
        double avg = 0;
        for(int i = 0; i < scores.size(); i++) {
            avg += scores.get(i);
        }
        avg /= scores.size();
        return avg;
    }
    
    public static double sum(ArrayList<Integer> scores) {
        int sum = 0;
        for(int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);
        }
        return sum;
    }
}
