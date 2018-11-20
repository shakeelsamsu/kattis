import java.io.*;
import java.util.*;
import java.math.*;

public class conundrum {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = in.readLine();
        int count = 0;
        for(int i = 0; i < line.length(); i+=3) {
            if(!line.substring(i, i + 1).equals("P")) count++;
            if(!line.substring(i + 1, i + 2).equals("E")) count++;
            if(!line.substring(i + 2, i + 3).equals("R")) count++;
        }
        out.println(count);
        out.close();
    }
}