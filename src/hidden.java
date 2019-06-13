import java.io.*;
import java.util.*;

public class hidden {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        char[] checkTemp = st.nextToken().toCharArray();
        char[] phraseTemp = st.nextToken().toCharArray();
        ArrayList<Character> original = new ArrayList<Character>();
        for (char c : checkTemp) original.add(c);
        ArrayList<Character> check = new ArrayList<Character>();
        for (char c : checkTemp) check.add(c);
        ArrayList<Character> phrase = new ArrayList<Character>();
        for (char c : phraseTemp) phrase.add(c);
        ArrayList<Character> added = new ArrayList<Character>(); 
        for(int i = 0; i < phrase.size(); i++) {
            for(int j = 0; j < check.size(); j++) {
                if(phrase.get(i) == check.get(j)) {
                    added.add(phrase.get(i));
                    check.remove(j);
                    j = check.size();
                }
            }
            if(added.size() == original.size()) i = phrase.size();
        }
        if(original.equals(added)) out.println("PASS");
        else out.println("FAIL");
        //out.println(added);
        out.close();
    }
}