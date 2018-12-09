import java.io.*;
import java.util.*;

public class babelfish {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        HashMap<String, String> dict = new HashMap<String, String>();
        while(!((line = in.readLine()).equals(""))) {
            StringTokenizer st = new StringTokenizer(line);
            String value = st.nextToken();
            String key = st.nextToken();
            dict.put(key, value);
        }
        while((line = in.readLine()) != null) {
            if(dict.get(line) == null) out.println("eh");
            else out.println(dict.get(line));
        }
        out.close();
    }
}