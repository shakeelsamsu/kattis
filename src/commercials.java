import java.io.*;
import java.util.*;

public class commercials {
    
    static int[] mem;
    static boolean[] visited;
    static int cost;
    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        cost = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int[] arr = new int[n];
        mem = new int[n];
        visited = new boolean[n];
        for(int i = 0; i < arr.length; i++) 
            arr[i] = Integer.parseInt(st.nextToken());     
        max(arr, n - 1);
        int max = Integer.MIN_VALUE;
        for(int x : mem)
            if(x > max)
                max = x;
        out.println(max);
        out.close();
        
    }

    public static int max(int[] arr, int i) {
        if(i == 0) 
            return Math.max(-cost, arr[0] - cost);
        
        if(visited[i]) 
            return mem[i];
        
        int max = Math.max(arr[i] + max(arr, i - 1), arr[i]);
        max -= cost;

        visited[i] = true;
        mem[i] = max;
        return max;
    }

    
}
