import java.io.*;
import java.util.*;
import java.math.*;

public class metaprogramming {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(/*new InputStreamReader(System.in)*/ new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        HashMap<String, Integer> dictionary = new HashMap<>();
        while((line = in.readLine()) != null) {
            String[] input = line.split(" ");
            String command = input[0];
            if(command.equals("define")) {
                int val = Integer.parseInt(input[1]);    
                dictionary.put(input[2], val);
            }            
            else if (command.equals("eval")) {
                String arg1 = input[1];
                String comparison = input[2];
                String arg2 = input[3];
                if(!dictionary.containsKey(arg1) || !dictionary.containsKey(arg2)) out.println("undefined");
                else {
                    int comp1 = dictionary.get(arg1);
                    int comp2 = dictionary.get(arg2);
                    if(comparison.equals("=")) out.println(comp1 == comp2);
                    else if(comparison.equals("<")) out.println(comp1 < comp2);
                    else if(comparison.equals(">")) out.println(comp1 > comp2);
                }
            }
        }
        out.close();
    }
}
