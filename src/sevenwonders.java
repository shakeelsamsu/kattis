import java.io.*;
import java.util.*;

public class sevenwonders {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        char[] cards = in.readLine().toCharArray();
        int t = 0;
        int c = 0;
        int g = 0;
        for(int i = 0; i < cards.length; i++) {
            if(cards[i] == 'T') t++;
            else if(cards[i] == 'C') c++;
            else g++;
        }
        int sum = t * t + c * c + g * g;
        while(t-- > 0 && c-- > 0 && g-- > 0) sum += 7;
        out.println(sum);
        out.close();
    }
}
