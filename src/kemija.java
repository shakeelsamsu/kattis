import java.io.*;
import java.util.*;
import java.math.*;

public class kemija {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = in.readLine();
        line = line.replaceAll("apa", "a");
        line = line.replaceAll("epe", "e");
        line = line.replaceAll("ipi", "i");
        line = line.replaceAll("opo", "o");
        line = line.replaceAll("upu", "u");
        out.println(line);
        out.close();
    }
}