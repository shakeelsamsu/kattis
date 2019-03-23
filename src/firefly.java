import java.io.*;
import java.util.*;

public class firefly {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[] bot = new int[h];
        int[] top = new int[h];
        for(int i = 0; i < n; i++) {
            int height = Integer.parseInt(in.readLine());
            if(i % 2 == 0) {
                bot[height - 1]++;
            }
            else {
                top[h - height]++;
            }
        }

        int sum = 0;
        for(int i = h - 1; i >= 0; i--) {
            sum += bot[i];
            bot[i] = sum;
        }

        sum = 0;
        for(int i = 0; i < h; i++) {
            sum += top[i];
            top[i] = sum;
        }

        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0; i < h; i++) {
            if(bot[i] + top[i] < min) {
                min = bot[i] + top[i];
                count = 1;
            }
            else if(bot[i] + top[i] == min) 
                count++;
        }

        out.println(min + " " + count);
        out.close();
    }
}