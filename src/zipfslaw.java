import java.io.*;
import java.util.*;

public class zipfslaw {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        TreeMap<String, Integer> freq = new TreeMap<String, Integer>();
        int n = 0;
        String res = "";
        boolean nextInt = true;
        while((line = in.readLine()) != null) {
            line = line.toLowerCase();
            if(line.equals("")) continue;
            if(nextInt) {
                n = Integer.parseInt(line);
                nextInt = false;
            }
            else if(line.equals("endoftext")) {
                if(n != 0) {
                    if(freq.values().contains(n)) {
                        res += "\n";
                        for(String s : freq.keySet()) {
                            if(freq.get(s) == n) {
                                res += s + "\n";
                            }
                        }
                    }    
                    else {
                        res += "\nThere is no such word.\n";
                    }
                    freq = new TreeMap<String, Integer>();
                }
                nextInt = true; 
            }
            else {
                String[] st = line.split("[^a-zA-Z0-9]");
                for(String s : st) {
                    if(freq.get(s) == null)
                        freq.put(s, 1);
                    else
                        freq.put(s, freq.get(s) + 1);
                }
            }
        }
        out.println(res.trim());
        out.close();
    }
}