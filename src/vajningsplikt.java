import java.io.*;
import java.util.*;

public class vajningsplikt {
    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();

        String straight = getStraight(a);
        String right = getRight(a);
        String left = getLeft(a);

        if(left.equals(b)) {
            if(right.equals(c) || straight.equals(c)) {
                out.println("Yes");
            }
            else {
                out.println("No");
            }
        }
        else if (straight.equals(b)) {
            if(right.equals(c)) {
                out.println("Yes");
            }
            else {
                out.println("No");
            }
        }
        else {
            out.println("No");
        }
        out.close();
    }

    public static String getLeft(String dir) {
        String res = "";
        switch (dir) {
            case "North":
                res = "East";
                break;
            case "East":
                res = "South";
                break;
            case "South":
                res = "West";
                break;
            case "West":
                res = "North";
                break;
        }
        return res;
    }

    public static String getRight(String dir) {
        String res = "";
        switch (dir) {
            case "North":
                res = "West";
                break;
            case "East":
                res = "North";
                break;
            case "South":
                res = "East";
                break;
            case "West":
                res = "South";
                break;
        }
        return res;
    }

    public static String getStraight(String dir) {
        String res = "";
        switch (dir) {
            case "North":
                res = "South";
                break;
            case "East":
                res = "West";
                break;
            case "South":
                res = "North";
                break;
            case "West":
                res = "East";
                break;
        }
        return res;
    }
}