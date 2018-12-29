import java.io.*;
import java.util.*;

public class baloni {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] balloons = new int[n];
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++) balloons[i] = Integer.parseInt(st.nextToken());
        ArrayList<Integer> currentHeights = new ArrayList<Integer>();
        currentHeights.add(balloons[0] - 1);
        int arrows = 1;
        //out.println("0 " + currentHeights);
        for(int i = 1; i < n; i++) {
            if(!currentHeights.contains(balloons[i])) {
                arrows++;
                currentHeights.add(balloons[i] - 1);
            }
            else {
                currentHeights.remove(currentHeights.indexOf(balloons[i]));
                currentHeights.add(balloons[i] - 1);
            }
            //out.println(i + " " + currentHeights);
        }
        out.println(arrows);
        out.close();
    }
}