import java.io.*;
import java.util.*;
import java.math.*;

public class anothercandies {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            in.readLine();
            String numChildren = in.readLine();
            BigInteger children = new BigInteger(numChildren);
            BigInteger sum = new BigInteger("0");
            for(int c = 0; c < Integer.parseInt(numChildren); c++) {
                BigInteger candies = new BigInteger(in.readLine()); 
                sum = sum.add(candies);
            }
            if(sum.mod(children).equals(BigInteger.valueOf(0))) out.println("YES");
            else out.println("NO");
        }
        out.close();
    }
}