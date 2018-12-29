import java.io.*;
import java.util.*;

public class sortofsorting {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true) {
            int n = Integer.parseInt(in.readLine());
            if(n == 0) break;
            out.println();
            TreeSet<Name> names = new TreeSet<Name>();
            for(int i = 0; i < n; i++) {
                Name x = new Name(in.readLine());
                names.add(x);
            }
            for(Name l : names) {
                out.println(l.name);
            }
        }
        out.close();
    }

    public static class Name implements Comparable<Name> {
        public String name;
        public String two;

        public Name(String a) {
            name = a;
            two = a.substring(0, 2);
        }

        public int compareTo(Name n) {
            if(n.two.equals(this.two)) return 1;
            return this.two.compareTo(n.two);
        }
    }
}