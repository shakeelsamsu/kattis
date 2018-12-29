import java.io.*;
import java.util.*;

public class froshweek2 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int t = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[] tasks = new int[t];
        int[] quiets = new int[l];
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < t; i++) tasks[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < l; i++) quiets[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(tasks);
        Arrays.sort(quiets);
        int completed = 0;
        int j = 0;
        int i = 0;
        while(i < t && j < l) {
            if(quiets[i] >= tasks[j]) {
                completed++;
                j++;
            }
            i++;
        }
        out.println(completed);
        out.close();
    }
}