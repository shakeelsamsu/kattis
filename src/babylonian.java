import java.io.*;
import java.util.*;
import java.lang.Math;

public class babylonian
{
  public static void main(String[] args) throws Exception {
  	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    int n = Integer.parseInt(in.readLine());
    for(int i = 0; i < n; i++) {
        String input = in.readLine();
        String num = "";
        int pow = 0;
        int sum = 0;
        for(int j = input.length(); j > 0; j--) {
            String temp = input.substring(j - 1, j);
            if(temp.equals(",")) {
                if(num.equals("")) {
                    pow++;
                    continue;  
                } 
                else sum += (Integer.parseInt(num) * Math.pow(60, pow));
                pow++;
                num = "";
                temp = "";
            }
            num = temp + num;
            if(j == 1 && !num.equals("")) sum += (Integer.parseInt(num) * Math.pow(60, pow));
        }
        out.println(sum);
    }
    out.close();
    }
}