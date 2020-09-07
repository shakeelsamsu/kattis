import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ceremony {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        ArrayList<Integer> towers = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            towers.add(Integer.parseInt(st.nextToken()));
        }
        int min = n;
        Collections.sort(towers, (x, y) -> y - x);
        for (int j = 1; j < n; j++) {
            if(j + towers.get(j) < min) min = j + towers.get(j);
        }
        out.println(min);
        out.close();
    }
}
