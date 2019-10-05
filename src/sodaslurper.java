import java.io.*;
import java.util.*;

public class sodaslurper {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int bottles = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        int req = Integer.parseInt(st.nextToken());
        int sodas = 0;
        while(bottles - req >= 0) {
            bottles -= req;
            bottles++;
            sodas++;
        }
        out.println(sodas);
        out.close();
    }
}
