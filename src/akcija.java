import java.util.*;
import java.io.*;

public class akcija {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(in.readLine()));
        }
        Collections.sort(nums);
        int price = 0;
        for(int i = n - 1; i > n % 3; i -= 3) {
            price += nums.get(i);
            price += nums.get(i - 1);
        }
        for(int i = 0; i < n % 3; i++) {
            price += nums.get(i);
        }
        System.out.println(price);
    }
}