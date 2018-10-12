/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Oct 3 18 11:07:14
 */

import java.io.*;
import java.util.*;

public class lineup {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        ArrayList<String> nameStarts = new ArrayList<String>(); 
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            nameStarts.add(st.nextToken());
        }
        ArrayList<String> sorted = new ArrayList<String>(nameStarts);
        Collections.sort(sorted);
        ArrayList<String> reversed = new ArrayList<String>(sorted);
        Collections.reverse(reversed);
        boolean increasing = false;
        boolean decreasing = false;
        if(nameStarts.equals(sorted)) {
            increasing = true;
        }
        if(nameStarts.equals(reversed)) {
            decreasing = true;
        }
        if(increasing) out.println("INCREASING");
        else if(decreasing) out.println("DECREASING");
        else out.println("NEITHER");
        out.close();
    }
}
