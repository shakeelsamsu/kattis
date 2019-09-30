import java.io.*;
import java.util.*;

public class avion {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
      
        String res = "";
        for(int i = 1; i <= 5; i++) {
            if((in.readLine()).contains("FBI"))
                res += i + " ";
        }
        if(res.length() > 0)
            out.println(res);
        else
            out.println("HE GOT AWAY!");
        out.close();
    }
}
