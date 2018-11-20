import java.io.*;
import java.util.*;

public class synchronizinglists {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int count = 1;
        while(true) {
            int n = Integer.parseInt(in.readLine());
            if(n == 0) break;
            if(count != 1) out.println();
            ArrayList<Integer> first = new ArrayList<Integer>();
            ArrayList<Integer> second = new ArrayList<Integer>();
            for(int i = 0; i < n; i++) first.add(Integer.parseInt(in.readLine()));
            ArrayList<Integer> firstSorted = new ArrayList<Integer>(first);
            Collections.sort(firstSorted);
            for(int i = 0; i < n; i++) second.add(Integer.parseInt(in.readLine()));
            ArrayList<Integer> secondSorted = new ArrayList<Integer>(second);
            Collections.sort(secondSorted);
            for(int i = 0; i < n; i++) {
                out.println(secondSorted.get(firstSorted.indexOf(first.get(i))));
            }
            count++;
        }
        out.close();
    }
}