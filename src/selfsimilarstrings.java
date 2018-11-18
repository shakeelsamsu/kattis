import java.io.*;
import java.util.*;
import java.math.*;

public class selfsimilarstrings {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        while((line = in.readLine()) != null) {
            int degrees = 0;
            int length = 1;
            boolean found = true;
            while(length < line.length() && found) {
                String temp = line;
                ArrayList<String> checked = new ArrayList<>();
                for(int i = 0; i <= temp.length() - length; i++) {    
                    String sub = temp.substring(i, i + length);
                    if(checked.contains(sub)) continue;
                    int index = temp.indexOf(sub);
                    if(temp.lastIndexOf(sub) == index) found = false;
                    checked.add(sub);
                }
                //out.println(checked);
                if(found) degrees++; 
                length++;
            }
            out.println(degrees);
        }
        out.close();
    }
}