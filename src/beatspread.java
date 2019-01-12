import java.io.*;
import java.util.*;

public class beatspread {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int sum = Integer.parseInt(st.nextToken());
            int diff = Integer.parseInt(st.nextToken());
            if(diff > sum) {
                out.println("impossible");
                continue;
            }
            ArrayList<Integer> solved = solve(sum, diff);
            if(solved.size() != 0) out.println(solved.get(1) + " " + solved.get(0));
            else out.println("impossible");
        }
        out.close();
    }

    public static ArrayList<Integer> solve(int s, int d) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i <= s; i++) {
            for(int j = 0; j <= i; j++) {
                if(i + j == s && Math.abs(i - j) == d) {
                    nums.add(i);
                    nums.add(j);
                }
            }
        }
        Collections.sort(nums);
        return nums;
    }
}