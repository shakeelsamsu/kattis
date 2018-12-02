import java.io.*;
import java.util.*;

public class natjecanje {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        boolean[] damaged = new boolean[n];
        boolean[] hasBackup = new boolean[n];
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < s; i++) damaged[Integer.parseInt(st.nextToken()) - 1] = true;
        st = new StringTokenizer(in.readLine());        
        for(int i = 0; i < r; i++) hasBackup[Integer.parseInt(st.nextToken()) - 1] = true;        
        int count = 0;
        // out.println(Arrays.toString(damaged));
        // out.println(Arrays.toString(hasBackup));
        for(int i = 0; i < damaged.length; i++) {
            boolean replaced = false;
            if(!damaged[i]) continue;
            if(damaged[i] && hasBackup[i]) {
                replaced = true;
                hasBackup[i] = false;
            }
            else if(damaged[i]) {
                if(i == 0) {
                    if(hasBackup[i + 1] && !damaged[i + 1]) {
                        hasBackup[i + 1] = false;
                        replaced = true;
                    }
                }
                else if(i == damaged.length - 1) {
                    if(hasBackup[i - 1] && !damaged[i - 1]) {
                        hasBackup[i - 1] = false;
                        replaced = true;
                    }
                }
                else {
                    if(hasBackup[i - 1]) {
                        replaced = true;
                        hasBackup[i - 1] = false;
                    }
                    else if(hasBackup[i + 1]) {
                        replaced = true;
                        hasBackup[i + 1] = false;
                    }
                }
            }
            if(!replaced) count++;
        }
        out.println(count);
        // out.println(Arrays.toString(damaged));
        // out.println(Arrays.toString(hasBackup));
        out.close();
    }
}