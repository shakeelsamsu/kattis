import java.io.*;
import java.util.*;
import java.math.*;

public class permutedarithmeticsequence {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            ArrayList<Integer> nums = new ArrayList<Integer>();
            int k = Integer.parseInt(st.nextToken());
            for(int j = 0; j < k; j++) nums.add(Integer.parseInt(st.nextToken()));
            ArrayList<Integer> sorted = new ArrayList<Integer>(nums);
            Collections.sort(sorted);
            if(isArithmetic(nums)) out.println("arithmetic");
            else if(isArithmetic(sorted)) out.println("permuted arithmetic");
            else out.println("non-arithmetic");
        }
        out.close();
    }
        public static boolean isArithmetic(ArrayList<Integer> seq) {
            int difference = seq.get(1) - seq.get(0);
            for(int i = seq.size() - 1; i > 0; i--) {
                if(seq.get(i) - seq.get(i - 1) != difference) return false;
            }
            return true;
        }
}