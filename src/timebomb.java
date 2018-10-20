import java.io.*;
import java.util.*;

public class timebomb {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        char[][] zero = {
                        {'*', '*', '*'},
                        {'*', ' ', '*'},
                        {'*', ' ', '*'},
                        {'*', ' ', '*'},
                        {'*', '*', '*'},
                        };
        char[][] one = {
                        {' ', ' ', '*'},
                        {' ', ' ', '*'},
                        {' ', ' ', '*'},
                        {' ', ' ', '*'},
                        {' ', ' ', '*'},
                        };
        char[][] two = {
                        {'*', '*', '*'},
                        {' ', ' ', '*'},
                        {'*', '*', '*'},
                        {'*', ' ', ' '},
                        {'*', '*', '*'},
                        };
        char[][] three = {
                        {'*', '*', '*'},
                        {' ', ' ', '*'},
                        {'*', '*', '*'},
                        {' ', ' ', '*'},
                        {'*', '*', '*'},
                        }; 
        char[][] four = {
                        {'*', ' ', '*'},
                        {'*', ' ', '*'},
                        {'*', '*', '*'},
                        {' ', ' ', '*'},
                        {' ', ' ', '*'},
                        }; 
        char[][] five = {
                        {'*', '*', '*'},
                        {'*', ' ', ' '},
                        {'*', '*', '*'},
                        {' ', ' ', '*'},
                        {'*', '*', '*'},
                        }; 
        char[][] six = {
                        {'*', '*', '*'},
                        {'*', ' ', ' '},
                        {'*', '*', '*'},
                        {'*', ' ', '*'},
                        {'*', '*', '*'},
                        }; 
        char[][] seven = {
                        {'*', '*', '*'},
                        {' ', ' ', '*'},
                        {' ', ' ', '*'},
                        {' ', ' ', '*'},
                        {' ', ' ', '*'},
                        };
        char[][] eight = {
                        {'*', '*', '*'},
                        {'*', ' ', '*'},
                        {'*', '*', '*'},
                        {'*', ' ', '*'},
                        {'*', '*', '*'},
                        };
        char[][] nine =  {
                        {'*', '*', '*'},
                        {'*', ' ', '*'},
                        {'*', '*', '*'},
                        {' ', ' ', '*'},
                        {'*', '*', '*'},
                        };
        HashMap<String, char[][]> digits = new HashMap<String, char[][]>();
        digits.put("0", zero);
        digits.put("1", one);
        digits.put("2", two);
        digits.put("3", three);
        digits.put("4", four);
        digits.put("5", five);
        digits.put("6", six);
        digits.put("7", seven);
        digits.put("8", eight);
        digits.put("9", nine);
        String line1 = in.readLine();
        String line2 = in.readLine();
        String line3 = in.readLine();
        String line4 = in.readLine();
        String line5 = in.readLine();
        int numDigits = line1.length() / 3;
        String num = "";
        //out.println(line1.length());
        for(int i = 0; i < line1.length(); i += 3) {
            char[][] grid = new char[5][3];
            char[] sub1 = line1.substring(i, i + 3).toCharArray();
            char[] sub2 = line2.substring(i, i + 3).toCharArray();
            char[] sub3 = line3.substring(i, i + 3).toCharArray();
            char[] sub4 = line4.substring(i, i + 3).toCharArray();
            char[] sub5 = line5.substring(i, i + 3).toCharArray();
            grid[0] = sub1;
            grid[1] = sub2;
            grid[2] = sub3;
            grid[3] = sub4;
            grid[4] = sub5;
            //out.println(Arrays.deepToString(grid));
            for(String key : digits.keySet()) {
                char[][] check = digits.get(key);
                if(Arrays.deepEquals(grid, check)) num += key;
            }
            i++;
        }
        int number = Integer.parseInt(num);
        if(number % 6 == 0) out.println("BEER!!");
        else out.println("BOOM!!");
        out.close();
    }
}