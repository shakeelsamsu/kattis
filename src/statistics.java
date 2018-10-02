/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Sep 26 18 8:53:47
 */

import java.io.*;
import java.util.*;

public class statistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        while(in.hasNextInt()) {
            ArrayList<Integer> nums = new ArrayList<Integer>();
            int n = in.nextInt();
            for(int i = 0; i < n; i++) nums.add(in.nextInt());
            Collections.sort(nums);
            int max = nums.get(nums.size() - 1);
            int min = nums.get(0);
            int range = nums.get(nums.size() - 1) - nums.get(0);
            System.out.println("Case " + count + ": " + min + " " + max + " " + range);
            count++;
        }
    }
}