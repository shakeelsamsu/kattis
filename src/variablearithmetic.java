import java.io.*;
import java.util.*;

public class variablearithmetic {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("System.out")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        HashMap<String, Integer> variables = new HashMap<String, Integer>();
        ArrayList<String> unknown = new ArrayList<String>();
        boolean first = true;
        while(true) {
            String[] input = in.readLine().split(" ");
            if(input[0].equals("0")) break;
            if(input.length > 1 && input[1].equals("=")) {
                String var = input[0];
                int val = isNum(input[2]) ? Integer.parseInt(input[2]) : variables.get(input[2]);
                variables.put(var, val);
            }
            else {
                if(!first) out.println();
                first = false;
                int sum = 0;
                for(int i = 0; i < input.length; i += 2) {
                    if(isNum(input[i])) sum += Integer.parseInt(input[i]);
                    else if(variables.get(input[i]) != null) sum += variables.get(input[i]);
                    else unknown.add(input[i]);
                }
                int temp = 1;
                if(sum != 0) out.print(sum);
                if(sum != 0 && unknown.size() > 0) out.print(" + ");
                for(String s : unknown) {
                    if(temp != unknown.size()) out.print(s + " + ");
                    else out.print(s);
                    temp++;
                }
                unknown.clear();
            }
        }
        out.close();
    }

    public static boolean isNum(String s) {
        return s.matches("\\d+");
    }
}