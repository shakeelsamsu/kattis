import java.io.*;
import java.util.*;

public class combinationlock {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int tick = 360 / 40;
        while(true) {
            int degrees = 720;
            String line = in.readLine();
            if(line.equals("0 0 0 0")) break;
            String[] input = line.split(" ");
            int start = Integer.parseInt(input[0]);
            int first = Integer.parseInt(input[1]);
            int second = Integer.parseInt(input[2]);            
            int third = Integer.parseInt(input[3]);
            if(first > start) degrees += tick * ((40 - first) + start);
            else degrees += tick * Math.abs(start - first);
            degrees += 360;
            if(second < first) degrees += tick * ((40 - first) + second);
            else degrees += tick * Math.abs(second - first);
            if(third > second) degrees += tick * ((40 - third) + second);
            else degrees += tick * Math.abs(third - second);
            out.println(degrees);    
        }
        out.close();
    }
}