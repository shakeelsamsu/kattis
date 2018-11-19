import java.io.*;
import java.util.*;
import java.math.*;

public class runlengthencodingrun {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        String command = st.nextToken();
        String line = st.nextToken();
        if(command.equals("D")) {
            for(int i = 0; i < line.length(); i += 2) {
                int num = Integer.parseInt(line.substring(i + 1, i + 2));
                for(int j = 0; j < num; j++) out.print(line.substring(i, i + 1));
            }
        }
        else {
            int count = 0;
            char curr = line.charAt(0);
            for(int i = 0; i < line.length(); i++) {
                if(curr == line.charAt(i)) count++;
                else {
                    out.print(curr);
                    out.print(count);
                    count = 1;
                    if(i < line.length()) curr = line.charAt(i);
                }
            }  
            out.print(curr);
            out.print(count);
        }
        out.close();
    }
}