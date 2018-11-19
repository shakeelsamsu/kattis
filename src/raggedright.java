import java.io.*;
import java.util.*;
import java.math.*;

public class raggedright {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        long sum = 0;
        while((line = in.readLine()) != null) lengths.add(line.length());
        //out.println(lengths);
        int toRemove = lengths.get(lengths.size() - 1);
        Collections.sort(lengths);
        int maxLength = lengths.get(lengths.size() - 1);
        lengths.remove(lengths.indexOf(toRemove));
        for(int i = 0; i < lengths.size(); i++) sum += (maxLength - lengths.get(i)) * (maxLength - lengths.get(i)); 
        //out.println(lengths);
        //out.println(maxLength);
        out.println(sum);
        out.close();
    }
}