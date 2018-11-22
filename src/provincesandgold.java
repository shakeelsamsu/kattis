import java.io.*;
import java.util.*;

public class provincesandgold {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine()); 
        
        int gold = Integer.parseInt(st.nextToken());
        int silver = Integer.parseInt(st.nextToken());
        int copper = Integer.parseInt(st.nextToken());
        int totalBp = gold * 3 + silver * 2 + copper;
        if(totalBp >= 8) out.println("Province or Gold");
        else if(totalBp >= 6) out.println("Duchy or Gold");
        else if(totalBp >= 5) out.println("Duchy or Silver");
        else if(totalBp >= 3) out.println("Estate or Silver");
        else if(totalBp >= 2) out.println("Estate or Copper");
        else out.println("Copper");
        out.close();
    }
}