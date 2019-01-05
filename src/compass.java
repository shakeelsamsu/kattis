import java.io.*;
import java.util.*;

public class compass {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int clockwise = b < a ? 360 - a + b : b - a;
        int counterclockwise = a < b ? a + 360 - b : a - b;
        out.println(counterclockwise < clockwise ? -counterclockwise : clockwise);
        out.close();
    }
}