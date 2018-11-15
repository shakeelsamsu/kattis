import java.io.*;
import java.util.*;

public class isithalloween {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = in.readLine();
        if(line.equals("OCT 31") || line.equals("DEC 25")) out.println("yup");
        else out.println("nope");
        out.close();
    }
}
