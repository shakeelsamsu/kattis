import java.io.*;
import java.util.*;

public class veci {

    private static ArrayList<Integer> nums;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        nums = new ArrayList<Integer>();
        char[] arr = in.readLine().toCharArray();
        int x = Integer.parseInt(new String(arr));
        ArrayList<Character> list = new ArrayList<Character>();
        for(char c : arr) list.add(c);
        permute(list, 0);
        Collections.sort(nums);
        while(nums.size() > 0 && nums.get(0) <= x) {
            nums.remove(0);
            // out.println("0");
        }
        if(nums.size() == 0) out.println(0);
        else out.println(nums.get(0));
        // out.println(nums);        
        out.close();
    }

    public static void permute(ArrayList<Character> list, int k) {
        for(int i = k; i < list.size(); i++) {
            Collections.swap(list, i, k);
            permute(list, k + 1);
            Collections.swap(list, k, i);
        }
        if(k == list.size() - 1) {
            String temp = "";
            for(char c : list) temp += Character.toString(c);
            nums.add(Integer.parseInt(temp));
        }
    }
}