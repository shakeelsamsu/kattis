import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;

public class htoo {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        String molecule = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        String result = in.readLine();

        HashMap<String, Integer> pool = new HashMap<String, Integer>();
        int i = 0;
        while(i < molecule.length()) {
            String key = molecule.substring(i, i++ + 1);
            String num = "";
            while(i < molecule.length() && molecule.substring(i, i + 1).matches("[0-9]"))
                num += molecule.substring(i, i++ + 1);
            int res = ((num.equals("") ? 1 : Integer.parseInt(num)) * n);
            pool.put(key, pool.get(key) != null ? pool.get(key) + res : res);
        }

        HashMap<String, Integer> required = new HashMap<String, Integer>();
        i = 0;
        while(i < result.length()) {
            String key = result.substring(i, i++ + 1);
            String num = "";
            while(i < result.length() && result.substring(i, i + 1).matches("[0-9]"))
                num += result.substring(i, i++ + 1);
            int res = ((num.equals("") ? 1 : Integer.parseInt(num)));
            required.put(key, required.get(key) != null ? required.get(key) + res : res);
        }

        int min = Integer.MAX_VALUE;
        for(Map.Entry<String, Integer> element : required.entrySet()) {
            String key = element.getKey();
            if(pool.get(key) == null) {
                min = 0;
                break;
            }
            min = Math.min(pool.get(key) / required.get(key), min);
        }
        out.println(min);
        out.close();
    }
}