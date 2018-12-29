import java.io.*;
import java.util.*;

public class rollcall {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        ArrayList<Name> names = new ArrayList<Name>();
        ArrayList<String> firsts = new ArrayList<String>();
        ArrayList<String> lasts = new ArrayList<String>();
        while((line = in.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            String first = st.nextToken();
            String last = st.nextToken();
            firsts.add(first);
            lasts.add(last);
            Name n = new Name(first, last);
            names.add(n);
        }
        Collections.sort(names);
        for(Name n : names) {
            if(Collections.frequency(firsts, n.first) >= 2) out.println(n.toString());
            else out.println(n.first);
        }
        out.close();
    }

    public static class Name implements Comparable<Name> {
        public String first;
        public String last;

        public Name(String a, String b) {
            first = a;
            last = b;
        }

        public int compareTo(Name n) {
            if(n.last.equals(this.last)) return this.first.compareTo(n.first);
            return this.last.compareTo(n.last);
        }

        public String toString() {
            return first + " " + last;
        }
    }
}