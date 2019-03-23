import java.io.*;
import java.util.*;

public class watchdog {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            ArrayList<int[]> hatches = new ArrayList<int[]>();
            for(int i = 0; i < h; i++) {
                st = new StringTokenizer(in.readLine());
                int[] hatch = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
                hatches.add(hatch);
            }
            int x, y;
            loop: {
                boolean status = true;
                for(x = 0; x < s; x++) {
                    for(y = 0; y < s; y++) {
                        for(int r = 0; r <= s / 2; r++) {
                            status = true;
                            if(!outside(x, y, r, s)) {
                                for(int j = 0; status && j < hatches.size(); j++) {
                                    status = contains(x, y, r, hatches.get(j));
                                }
                                if(status) {
                                    out.println(x + " " + y);
                                    break loop;
                                }
                            }
                            else status = false;
                        }
                    }
                }
                if(!status) {
                    out.println("poodle");
                }
            }
        }
        out.close();
    }

    private static boolean outside(int x, int y, int r, int s) {
        if(x + r > s) return true;
        if(x - r < 0) return true;
        if(y + r > s) return true;
        if(y - r < 0) return true;
        return false;
    }

    private static boolean contains(int x, int y, int r, int[] hatch) {
        int hatchX = hatch[0];
        int hatchY = hatch[1];
        if(hatchX == x && hatchY == y) return false;
        return Math.sqrt(Math.pow(hatchX - x, 2) + Math.pow(hatchY - y, 2)) <= r;
    }
}