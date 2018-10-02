import java.util.*;
import java.io.*;

public class egypt {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        boolean exit = false;
        while(!exit) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b ==0 && c == 0) {
                exit = true;
                break;
            }
            if(checkPythag(a, b, c)) {
                out.println("right");
            }
            else {
                out.println("wrong");
            }
        }
        out.close();
    }
    public static boolean checkPythag(int a, int b, int c) {
        double hyp = (double) Math.max(a, Math.max(b, c));
        if(hyp == a) {
            double check = Math.sqrt(b * b + c * c);
            if(hyp == check) return true;
            return false; 
        }
        if(hyp == b) {
            double check = Math.sqrt(a * a + c * c);
            if(hyp == check) return true;
            return false; 
        }
        if(hyp == c) {
            double check = Math.sqrt(b * b + a * a);
            if(hyp == check) return true;
            return false; 
        }
        return false;
    }
}