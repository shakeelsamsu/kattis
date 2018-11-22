import java.io.*;
import java.util.*;

public class warehouse {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int t = Integer.parseInt(st.nextToken());
            TreeMap<String, Integer> toys = new TreeMap<String, Integer>();
            for(int j = 0; j < t; j++) {
                st = new StringTokenizer(in.readLine());
                String toy = st.nextToken();
                int quantity =  Integer.parseInt(st.nextToken());
                if(toys.keySet().contains(toy)) toys.put(toy, toys.get(toy) + quantity);
                else toys.put(toy, quantity);
            }
            Collection<Integer> temp = toys.values();
            ArrayList<Integer> shipments = new ArrayList<Integer>(temp);
            Collections.sort(shipments);
            Collections.reverse(shipments);
            out.println(shipments.size());
            while(!shipments.isEmpty()) {
                int shipment = shipments.get(0);
                for(String key : toys.keySet()) {
                    if(shipment == toys.get(key)) {
                        out.println(key + " " + shipment);
                        shipments.remove(0);
                    }
                }
            }
        }
        out.close();
    }
}