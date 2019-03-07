import java.io.*;
import java.util.*;

public class grandpabernie {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            String location = st.nextToken();
            int year = Integer.parseInt(st.nextToken());
            if(map.get(location) == null) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(year);
                map.put(location, list);
            }
            else {
                map.get(location).add(year);
            }
        }
        HashSet<String> visited = new HashSet<String>();
        int q = Integer.parseInt(in.readLine());
        while(q-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            String location = st.nextToken();
            int time = Integer.parseInt(st.nextToken());
            if(visited.contains(location)) {
                out.println(map.get(location).get(time - 1));
            }
            else {
                Collections.sort(map.get(location));
                out.println(map.get(location).get(time - 1));
            }
            visited.add(location);
        }
        out.close();
    }
}