import java.io.*;
import java.util.*;
import java.math.*;

public class ones {
    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        while((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            int count = 1;    
            long ones = 1;        
            while(ones % n != 0) {
                ones *= 10;
                ones++;
                count++;
                ones = ones % n;
            }
            out.println(count);
        }
        out.close();
    }

}