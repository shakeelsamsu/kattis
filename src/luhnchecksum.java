import java.io.*;
import java.util.*;

public class luhnchecksum {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            int[] nums = split(in.readLine());
            int[] luhn = new int[nums.length];
            for(int j = nums.length - 2; j >= 0; j -= 2) {
                luhn[j] = nums[j] * 2 <= 9 ? nums[j] * 2 : nums[j] * 2 % 10 + 1;
            }
            for(int j = nums.length - 1; j >= 0; j -= 2) {
                luhn[j] = nums[j];
            }
            // out.println(Arrays.toString(nums));
            // out.println(Arrays.toString(luhn));
            out.println(sum(luhn) % 10 == 0 ? "PASS" : "FAIL");
        }
        out.close();
    }

    public static int[] split(String s) {
        int[] arr = new int[s.length()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s.substring(i, i + 1));
        }
        return arr;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }
}