import java.io.*;
import java.util.*;
import java.math.*;

public class zoo {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int listNum = 1;
        while(true) {
            int n = Integer.parseInt(in.readLine());
            if(n == 0) break;
            ArrayList<String> animals = new ArrayList<String>();
            for(int i = 0; i < n; i++) {
                String[] input = in.readLine().split(" ");
                animals.add(input[input.length - 1].toLowerCase());
            }
            out.println("List " + listNum + ":");
            TreeSet<String> temp = new TreeSet<String>(animals);
            for(String animal : temp) out.println(animal + " | " + Collections.frequency(animals, animal));
            listNum++;
        }
        out.close();
    }
}