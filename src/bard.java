import java.io.*;
import java.util.*;

public class bard {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        long[] songs = new long[n];
        int total = 0;
        int e = Integer.parseInt(in.readLine());
        for(int i = 0; i < e; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int k = Integer.parseInt(st.nextToken());
            ArrayList<Integer> now = new ArrayList<Integer>();
            while(st.hasMoreTokens()) {
                int v = Integer.parseInt(st.nextToken());
                now.add(v);
            }
            if(!now.contains(1)) {
                for(int u = 0; u < now.size(); u++) {
                    for(int v = u + 1; v < now.size(); v++) {
                        songs[now.get(u) - 1] |= songs[now.get(v) - 1];
                        songs[now.get(v) - 1] |= songs[now.get(u) - 1];
                    }
                }
            }
            if(now.contains(1)) {
                total++;
                for(int v = 0; v < songs.length; v++) {
                    if(now.contains(v+1)) {
                        songs[v] += (long) Math.pow(2, total - 1);
                    }
                }
            }
        }
        for(int i = 0; i < songs.length; i++)
            if(songs[i] == Math.pow(2, total) - 1)
                out.println(i+1);
        out.close();       
    }
}