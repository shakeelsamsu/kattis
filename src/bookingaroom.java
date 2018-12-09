import java.io.*;
import java.util.*;

public class bookingaroom {
    public static void main(String[] args) throws Exception  {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        HashSet<Integer> rooms = new HashSet<Integer>();
        for(int i = 1; i <= n; i++) {
            rooms.add(i);
        }
        for(int i = 0; i < r; i++) {
            rooms.remove(Integer.parseInt(in.readLine()));
        }
        if(rooms.size() == 0) {
            out.println("too late");
            out.close();
        }
        for(int room : rooms) {
            out.println(room);
            out.close();
        }
    }
}