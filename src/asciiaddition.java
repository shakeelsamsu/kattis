import java.io.*;
import java.util.*;

public class asciiaddition {
    
    private static char[][] zero = {"xxxxx".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "xxxxx".toCharArray(),};
                                    
    private static char[][] one = {"....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(),};
                                    
    private static char[][] two = {"xxxxx".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "xxxxx".toCharArray(), 
                                    "x....".toCharArray(), 
                                    "x....".toCharArray(), 
                                    "xxxxx".toCharArray(),};

    private static char[][] three = {"xxxxx".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "xxxxx".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "xxxxx".toCharArray(),};
                                    
    private static char[][] four = {"x...x".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "xxxxx".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(),};
                                    
    private static char[][] five = {"xxxxx".toCharArray(), 
                                    "x....".toCharArray(), 
                                    "x....".toCharArray(), 
                                    "xxxxx".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "xxxxx".toCharArray(),};
                                    
    private static char[][] six = {"xxxxx".toCharArray(), 
                                    "x....".toCharArray(), 
                                    "x....".toCharArray(), 
                                    "xxxxx".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "xxxxx".toCharArray(),};
                                    
    private static char[][] seven = {"xxxxx".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(),};
                                    
    private static char[][] eight = {"xxxxx".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "xxxxx".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "xxxxx".toCharArray(),};
                                    
    private static char[][] nine = {"xxxxx".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "x...x".toCharArray(), 
                                    "xxxxx".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "....x".toCharArray(), 
                                    "xxxxx".toCharArray(),};
                                    
    private static char[][] plus = {".....".toCharArray(), 
                                    "..x..".toCharArray(), 
                                    "..x..".toCharArray(), 
                                    "xxxxx".toCharArray(), 
                                    "..x..".toCharArray(), 
                                    "..x..".toCharArray(), 
                                    ".....".toCharArray(),};
    
    private static HashMap<char[][], String> nums;
    
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        nums = new HashMap<char[][], String>();
        nums.put(zero, "0");
        nums.put(one, "1");
        nums.put(two, "2");
        nums.put(three, "3");
        nums.put(four, "4");
        nums.put(five, "5");
        nums.put(six, "6");
        nums.put(seven, "7");
        nums.put(eight, "8");
        nums.put(nine, "9");

        String line = in.readLine();
        ArrayList<char[][]> input = new ArrayList<char[][]>();
        for(int i = 0; i < line.length() / 6 + 1; i++) {
            char[][] num = new char[7][5];
            num[0] = line.substring(i * 5 + i, i * 5 + i + 5).toCharArray();
            input.add(num);
        }
        for(int i = 1; i < 7; i++) {
            line = in.readLine();
            int count = 0;
            for(int j = 0; j < line.length() / 6 + 1; j++) {
                char[][] num = input.get(count);
                num[i] = line.substring(j * 5 + j, j * 5 + j + 5).toCharArray();
                count++;
            }
        }
        String a = "";
        int i = 0;
        while(!Arrays.deepEquals(input.get(i), plus)) {
            a += findCorresponding(input.get(i));
            i++;
        }
        i++;
        String b = "";
        while(i < input.size()) {
            b += findCorresponding(input.get(i));
            i++;
        }
        String res = Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        // out.println(a + " + " + b);
        // out.println(res);
        String[] output = new String[7];
        Arrays.fill(output, "");
        for(i = 0; i < res.length(); i++) {
            char[][] temp = findCorresponding(res.substring(i, i + 1));
            for(int j = 0; j < 7; j++) 
                output[j] += String.valueOf(temp[j]);
            for(int j = 0; i != res.length() - 1 && j < 7; j++) 
                output[j] += ".";
        }
        for(String s : output)
            out.println(s);
        out.close();
    }

    private static String findCorresponding(char[][] input) {
        for(Map.Entry<char[][], String> entry : nums.entrySet()) {
            if(Arrays.deepEquals(input, entry.getKey()))
                return entry.getValue();
        }
        return null;
    }

    private static char[][] findCorresponding(String input) {
        for(Map.Entry<char[][], String> entry : nums.entrySet()) {
            if(input.equals(entry.getValue()))
                return entry.getKey();
        }
        return null;
    }
}


