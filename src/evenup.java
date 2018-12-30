import java.io.*;
import java.util.*;

public class evenup {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        Stack<Integer> cards = new Stack<Integer>();
        StringTokenizer st = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            if(cards.size() != 0 && (card + cards.peek()) % 2 == 0) {
                cards.pop();
            }
            else cards.push(card);
        }
        out.println(cards.size());
        out.close();
    }
}