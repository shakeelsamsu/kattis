import java.io.*;
import java.util.*;

public class erase {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int switches = Integer.parseInt(in.readLine());
        String a = in.readLine();
        String b = in.readLine();
        String check;
        if(switches % 2 == 1) {
            check = a.replace("0", "2");
            check = check.replace("1", "0");
            check = check.replace("2", "1");
        }
        else {
            check = a;
        }
        if(check.equals(b)) {
            out.println("Deletion succeeded");
        }
        else {
            out.println("Deletion failed");
        }
        //out.println(check);
        //out.println(a);
        //out.println(b);
        out.close();
    }
}


