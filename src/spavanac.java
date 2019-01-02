import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;

public class spavanac {

  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    StringTokenizer st = new StringTokenizer(in.readLine());
    
    int hour = Integer.parseInt(st.nextToken());
    int min = Integer.parseInt(st.nextToken());
    
    if(min < 45) {
      min = 60 - (45 - min);
      if(hour == 0) hour = 23;
      else hour--;
    }
    else min -= 45;
    out.println(hour + " " + min);
    out.close();

  }

}