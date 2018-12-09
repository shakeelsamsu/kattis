import java.io.*;
import java.util.*;

public class securedoors {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        HashMap<String, Boolean> people = new HashMap<String, Boolean>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            String action = st.nextToken();
            String name = st.nextToken();
            boolean inside = action.equals("entry");
            boolean anomaly = false;
            if(people.get(name) != null) {
                boolean last = people.get(name);
                if(last && inside) anomaly = true;
                else if(!last && !inside) anomaly = true;
                else {
                    people.put(name, inside);
                }
            }
            else {
                people.put(name, inside);
                if(people.get(name)) out.println(name + " entered");
                else out.println(name + " exited (ANOMALY)");
                continue;
            }
            if(anomaly)  {
                if(people.get(name)) out.println(name + " entered (ANOMALY)");
                else out.println(name + " exited (ANOMALY)");
            }
            else {
                if(people.get(name)) out.println(name + " entered");
                else out.println(name + " exited");
            }
        }
        out.close();
    }
}
