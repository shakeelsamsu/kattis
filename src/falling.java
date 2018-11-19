import java.io.*;
import java.util.*;

public class falling {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int d = Integer.parseInt(in.readLine());
        if(d == 0) {
            out.println("0 0");
            out.close();
        }
        else if(d == 1) {
            out.println("0 1");
            out.close();
        }
        else if(d == 3) {
            out.println("1 2");
            out.close();
        }
        else if(Math.sqrt(d) == (int) Math.sqrt(d)) {
            out.println("0 " + (int) Math.sqrt(d));
            out.close();
        }
        ArrayList<Integer> factors = factors(d);
        //out.println(factors);
        boolean satisified = false;
        int[] current = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        for(int i = 0; i < factors.size() / 2; i++) {
            int a = factors.get(i);
            int b = factors.get(factors.size() - 1 - i);
            if(Math.abs(b - a) % 2 == 0) {
                int[] nums = solveSystem(a, b);
                if(nums[1] * nums[1] - nums[0] * nums[0] == d) {
                    if(nums[0] < current[0]) current = nums;
                    satisified = true;
                } 
            }
        }
        if(satisified) out.print(current[0] + " " + current[1]);
        else out.println("impossible");
        out.close();
    }

    public static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i = 1; i < (int) Math.sqrt(n) + 1; i++) {
            if(n % i == 0) {
                factors.add(i);
                factors.add(n / i);
            }
        }
        Collections.sort(factors);
        return factors;
    }

    public static int[] solveSystem(int a, int b) {
        int n1 = (b - a) / 2;
        int n2 = b - n1;
        int[] nums = {n1, n2};
        return nums;
    }
}