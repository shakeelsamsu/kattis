import java.io.*;
import java.util.*;

public class symmetricorder {
    public static void main (String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        int count = 1;
        while((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            if(n == 0) break;
            ArrayList<Name> names = new ArrayList<Name>();
            for(int i = 0; i < n; i++) {
                String name = in.readLine();
                names.add(new Name(name));
            }
            Collections.sort(names);
            //out.println(names);
            int alt = n - 1;
            int orig = 0;
            String[] arr = new String[n];
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0) arr[orig++] = names.get(i).name;
                else arr[alt--] = names.get(i).name;
            }
            out.println("SET " + count++);
            for(String s : arr) {
                out.println(s);
            }
        }
        out.close();
    }
}

class Name implements Comparable<Name> {
    String name;
    
    public Name(String name) {
        this.name = name;
    }
    
    public int compareTo(Name n) {
        return name.length() - n.name.length();
    }

    public String toString() {
         return name;
    }
}