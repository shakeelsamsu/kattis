import java.util.*;
import java.io.*;

public class fallingapart {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) nums.add(Integer.parseInt(input[i]));
        Collections.sort(nums);
        Collections.reverse(nums);
        boolean a = true;
        int aSum = 0;
        int bSum = 0;
        for(int j = 0; j < nums.size(); j++) {
            if(a) {
                aSum += nums.get(j);
                a = false;
            }
            else {
                bSum += nums.get(j);
                a = true;
            }
        }
        out.println(aSum + " " + bSum);
        out.close();
    }
}