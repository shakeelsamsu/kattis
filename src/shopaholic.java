import java.io.*;
import java.util.*;

public class shopaholic {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        ArrayList<Long> nums = new ArrayList<Long>();
        for(int i = 0; i < n; i++) {
            nums.add(Long.parseLong(st.nextToken()));
        }
        Collections.sort(nums);
        long total = 0;
        //out.println(nums);
        for(int i = n - 3; i >= 0; i -= 3) {
            total += nums.get(i);
        }
        /*if(n % 3 != 0) {
            int mod = n % 3;
            if(mod == 1) {
                total += nums.get(n - 1);
            }
            else {
                total += nums.get(n - 1);
                total += nums.get(n - 2);
            }
        }*/
        out.println(total);
        out.close();
    }
}