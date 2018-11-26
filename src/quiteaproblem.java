import java.io.*;
import java.util.*;

public class quiteaproblem {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        while((line = in.readLine()) != null) {
            line = line.toLowerCase();
            if(line.contains("problem")) out.println("yes");
            else out.println("no");
        }
        out.close();
    }
}
