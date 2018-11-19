import java.io.*;
import java.util.*;

public class ostgotska {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = in.readLine();
        String[] words = line.split(" ");
        int count = 0;
        for(int i = 0; i < words.length; i++) if(words[i].contains("ae")) count++;
        if((double) count / words.length >= 0.4) out.println("dae ae ju traeligt va");
        else out.println("haer talar vi rikssvenska");
        out.close();
    }
}