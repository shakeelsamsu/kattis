import java.io.*;
import java.util.*;

public class nizovi {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = in.readLine();
        String formatter = "";
        while(line.length() > 0) {
            // System.out.println("line: " + line);
            if(line.substring(0, 1).equals("{")) {
                System.out.println(formatter + "{");
                formatter += "  ";
                line = line.substring(1);
            } 
            else if(line.substring(0, 1).equals("}")) {
                formatter = formatter.substring(0, formatter.length() - 2);
                if(line.length() > 1 && line.substring(1, 2).equals(",")) {
                    System.out.println(formatter + "},");
                    line = line.substring(2);
                }    
                else {
                    System.out.println(formatter + "}");
                    line = line.substring(1);
                }
            }
            else {
                String temp;
                if(line.indexOf(",") != -1 && line.indexOf(",") < line.indexOf("}") && (line.indexOf("{") == -1 || line.indexOf(",") < line.indexOf("{"))) {
                    temp = line.substring(0, line.indexOf(",") + 1);
                    line = line.substring(line.indexOf(",") + 1);
                }
                else if(line.indexOf("{") != -1 && line.indexOf("{") < line.indexOf("}")) {
                    temp = line.substring(0, line.indexOf("{"));
                    line = line.substring(line.indexOf("{"));
                }
                else {
                    temp = line.substring(0, line.indexOf("}"));
                    line = line.substring(line.indexOf("}"));
                }
                System.out.println(formatter + temp);   
            }
        }
        out.close();
    }
}