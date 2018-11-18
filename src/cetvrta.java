import java.io.*;
import java.util.*;

public class cetvrta {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        ArrayList<Integer> xList = new ArrayList<Integer>();
        ArrayList<Integer> yList = new ArrayList<Integer>();

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            xList.add(Integer.parseInt(st.nextToken()));
            yList.add(Integer.parseInt(st.nextToken()));
        }
        int x = 0;
        int y = 0;
        for(int i = 0; i < 3; i++) {
            if(Collections.frequency(xList, xList.get(i)) == 1) x = xList.get(i);
            if(Collections.frequency(yList, yList.get(i)) == 1) y = yList.get(i);
        }
        out.println(x + " " + y);
        out.close();
    }
}