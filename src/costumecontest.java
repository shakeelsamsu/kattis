import java.io.*;
import java.util.*;

public class costumecontest {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        TreeMap<String, Integer> costumes = new TreeMap<String, Integer>();
        while(n-- > 0) {
            String costume = in.readLine();
            if(!costumes.containsKey(costume))
                costumes.put(costume, 1);
            else 
                costumes.put(costume, costumes.get(costume) + 1);
        }
        TreeSet<String> res = new TreeSet<String>();
        int min = Integer.MAX_VALUE;
        for(Map.Entry<String, Integer> e : costumes.entrySet()) {
            if(min > e.getValue()) {
                res.clear();
                res.add(e.getKey());
                min = e.getValue();
            }
            else 
                res.add(e.getKey());
        }
        for(String s : res)
            out.println(s);
        out.close();
    }
}
