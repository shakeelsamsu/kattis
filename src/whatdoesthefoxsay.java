import java.io.*;
import java.util.*;

public class whatdoesthefoxsay {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n  = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            ArrayList<String> words = new ArrayList<String>();
            for(String s : input) words.add(s);
            String line = "";
            while(!(line = in.readLine()).equals("what does the fox say?")) {
                StringTokenizer st = new StringTokenizer(line);
                String animal = st.nextToken();
                String goes = st.nextToken();
                String sound = st.nextToken();
                words.removeAll(Collections.singleton(sound));
                // out.println(words);
            }
            for(String s : words) out.print(s.trim() + " ");
        }
        out.close();
    }
}