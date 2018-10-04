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
        /*
        boolean neither = false;
        boolean increasing = true;
        boolean decreasing = true;
        for(int j = 1; j < n; j++) {
            int char1 = (int) nameStarts.get(j);
            int char2 = (int) nameStarts.get(j - 1);
            if(char2 >= char1 && j == 1) {
                increasing = false;
            } 
            if(char2 <= char1 && j == 1) {
                decreasing = false;
            }
            if(increasing) {
                if(char2 > char1) neither = true;
            }
            if(decreasing) {
                if(char2 < char1) neither = true;
            }
        }
        if(neither) out.println("NEITHER");
        else if(increasing) out.println("INCREASING");
        else if(decreasing) out.println("DECREASING");
        else out.println("NEITHER");
        out.close(); 
        */
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