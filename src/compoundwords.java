import java.io.*;
import java.util.*;
import java.math.*;

public class compoundwords {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader in = new BufferedReader(new FileReader("Input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        ArrayList<String> words = new ArrayList<String>();
        while((line = in.readLine()) != null) {
            String[] input = line.split(" ");
            for(String word: input) words.add(word);
        }
        TreeSet<String> combos = new TreeSet<String>();
        for(int i = 0; i < words.size(); i++) {
            String temp = words.get(i);
            for(int j = 0; j < words.size(); j++) {
                if(i != j) {
                    temp += words.get(j);
                    combos.add(temp); 
                    temp = words.get(i);  
                }
            }
        }
        for(String word: combos) out.println(word);
        out.close();
    }
}