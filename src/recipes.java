import java.io.*;
import java.util.*;

public class recipes {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)/* new FileReader("input.txt")*/);
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            out.println("Recipe # " + (i + 1));
            st = new StringTokenizer(in.readLine());
            int num = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            double sf = (double) d / p;
            HashMap<String, double[]> ingredients = new HashMap<String, double[]>();
            String main = "";
            double mainWeight = 0;
            String[] ingreds = new String[num];
            for(int j = 0; j < num; j++) {
                st = new StringTokenizer(in.readLine());
                String ingredient = st.nextToken();
                double weight = Double.parseDouble(st.nextToken());
                double percentage = Double.parseDouble(st.nextToken());
                //out.println("i: " + ingredient);
                if(percentage == 100) {
                    main = ingredient;
                    mainWeight = weight * sf;
                }
                double[] input = {weight, percentage};
                ingredients.put(ingredient, input);
                ingreds[j] = ingredient;
            }
            for(int t = 0; t < num; t++) {
                double[] info = ingredients.get(ingreds[t]);
                out.print(ingreds[t] + " ");
                out.printf("%.1f\n", info[1] * mainWeight / 100);
            }
            //out.println(ingredients.keySet());
            out.println("----------------------------------------");
        }
        out.close();
    }
}