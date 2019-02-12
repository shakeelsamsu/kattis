import java.io.*;
import java.util.*;

public class recount {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
        HashMap<String, Integer> votes = new HashMap<String, Integer>();
        while(true) {
            String line = in.readLine();
            if(line.equals("***")) break;
            if(votes.get(line) == null) {
                votes.put(line, 1);
            }
            else {
                votes.put(line, votes.get(line) + 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        String winner = "";
        for(Map.Entry<String, Integer> entry : votes.entrySet()) {
            if(max < entry.getValue()) {
                max = entry.getValue();        
                winner = entry.getKey();        
            }
            list.add(entry.getValue());
        }
        boolean runoff = Collections.frequency(list, max) != 1;
        out.println(runoff ? "Runoff!" : winner);
        out.close();

    }
}