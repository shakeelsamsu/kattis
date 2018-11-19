import java.io.*;
import java.util.*;

public class babybites {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        int count = 1;
        for(int i = 0; i < n; i++) {
            if(input[i].equals("mumble")) count++;
            else {
                if(Integer.parseInt(input[i]) != count) {
                    out.println("something is fishy");
                    out.close();       
                }
                else count++;
            }
        }
        out.println("makes sense");
        out.close(); 
    }
}