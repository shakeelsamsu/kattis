import java.io.*;
import java.util.*;

public class chartingprogress {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        int index = 0;
        while((line = in.readLine()) != null) {
            if(line.equals("")) {
                out.println();
                index = 0;
            }
            if(!line.contains("*")) {
                out.println(line);
                continue;
            }
            int stars = countStars(line);
            index += stars;
            for(int i = 0; i < line.length() - index; i++)
                out.print(".");
            for(int i = line.length() - index; i < line.length() - index + stars; i++)
                out.print("*");
            for(int i = line.length() - index + stars; i < line.length(); i++)
                out.print(".");
            out.println();
        }
        out.close();
    }

    public static int countStars(String line) {
        int count = 0;
        for(int i = 0; i < line.length(); i++) 
            if(line.charAt(i) == '*')
                count++;
        return count;
    }
}