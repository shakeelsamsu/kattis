import java.io.*;
import java.util.*;
import java.math.*;

public class problemclassification {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)/*new FileReader("input.txt")*/);
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        HashMap<String, ArrayList<String>> categories = new HashMap<>();
        HashMap<String, Integer> occurrences = new HashMap<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            String category = st.nextToken();
            int x = Integer.parseInt(st.nextToken());
            ArrayList<String> words = new ArrayList<>();
            for(int j = 0; j < x; j++) words.add(st.nextToken());
            categories.put(category, words);
            occurrences.put(category, 0);
        }
        //out.println(categories);
        ArrayList<String> allWords = new ArrayList<>();
        for(String key : categories.keySet()) allWords.addAll(categories.get(key));
        //out.println(allWords);

        String space = " ";
        String before = " ";
        String after = " ";
        String line = "";
        while((line = in.readLine()) != null) {
            for(String word : allWords) {
                //need to get rid of occurrences where the word is embedded in another word
                while(line.contains(word)) {
                    int index = line.indexOf(word);
                    if(index > 0) before = line.substring(index - 1, index);
                    if(index + word.length() < line.length()) after = line.substring(index + word.length(), index + word.length() + 1);
                    if(after.equals(space) && before.equals(space)) {
                        for(String key : categories.keySet()) {
                            if(categories.get(key).contains(word)) occurrences.put(key, occurrences.get(key) + 1);
                        }
                    }
                    line = line.substring(0, index) + line.substring(index + word.length(), line.length());
                    //change line to substring without the word that was just checked
                }
            }    
        }
        ArrayList<Integer> finds = new ArrayList<Integer>(occurrences.values());
        int max = Collections.max(finds);
        ArrayList<String> keys = new ArrayList<>();
        for(String key : occurrences.keySet()) keys.add(key);
        Collections.sort(keys);
        for(String key : keys) {
            if(occurrences.get(key) == max) out.println(key);
        }
        out.close();
    }
    
}