import java.io.*;
import java.util.*;
import java.math.*;

public class icpcawards {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int teams = Integer.parseInt(st.nextToken());
        ArrayList<String> unis = new ArrayList<String>();
        for(int i = 0; i < teams; i++) {
            while(unis.size() < 12) {    
                st = new StringTokenizer(in.readLine());
                String uni = st.nextToken();
                String team = st.nextToken();
                if(!unis.contains(uni)) {
                    unis.add(uni);
                    out.println(uni + " " + team);
                }
            }
        }
        out.close();
    }
}