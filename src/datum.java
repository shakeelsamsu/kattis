import java.io.*;
import java.util.*;

public class datum {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int day = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int[] starts = {4, 0, 0, 3, 5, 1, 3, 6, 2, 4, 0, 2};
        switch ((starts[month - 1] + day - 1) % 7) {
            case 0:
                out.println("Sunday");
                out.close();
            case 1:
                out.println("Monday");
                out.close();
            case 2:
                out.println("Tuesday");
                out.close();
            case 3:
                out.println("Wednesday");
                out.close();
            case 4:
                out.println("Thursday");
                out.close();
            case 5:
                out.println("Friday");
                out.close();
            case 6:
                out.println("Saturday");
                out.close();
        } 
    }
}