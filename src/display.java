import java.io.*;
import java.util.*;

public class display {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        //PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("System.out")));

        HashMap<Integer, String> line1 = new HashMap<Integer, String>();
        HashMap<Integer, String> line2 = new HashMap<Integer, String>();
        HashMap<Integer, String> line3 = new HashMap<Integer, String>();
        HashMap<Integer, String> line4 = new HashMap<Integer, String>();
        HashMap<Integer, String> line5 = new HashMap<Integer, String>();
        HashMap<Integer, String> line6 = new HashMap<Integer, String>();
        HashMap<Integer, String> line7 = new HashMap<Integer, String>();
        
        line1.put(0, "+---+");
        line1.put(1, "    +");
        line1.put(2, "+---+");
        line1.put(3, "+---+");
        line1.put(4, "+   +");
        line1.put(5, "+---+");
        line1.put(6, "+---+");
        line1.put(7, "+---+");
        line1.put(8, "+---+");
        line1.put(9, "+---+");

        line2.put(0, "|   |");
        line2.put(1, "    |");
        line2.put(2, "    |");
        line2.put(3, "    |");
        line2.put(4, "|   |");
        line2.put(5, "|    ");
        line2.put(6, "|    ");
        line2.put(7, "    |");
        line2.put(8, "|   |");
        line2.put(9, "|   |");

        line3.put(0, "|   |");
        line3.put(1, "    |");
        line3.put(2, "    |");
        line3.put(3, "    |");
        line3.put(4, "|   |");
        line3.put(5, "|    ");
        line3.put(6, "|    ");
        line3.put(7, "    |");
        line3.put(8, "|   |");
        line3.put(9, "|   |");

        line4.put(0, "+   +");
        line4.put(1, "    +");
        line4.put(2, "+---+");
        line4.put(3, "+---+");
        line4.put(4, "+---+");
        line4.put(5, "+---+");
        line4.put(6, "+---+");
        line4.put(7, "    +");
        line4.put(8, "+---+");
        line4.put(9, "+---+");

        line5.put(0, "|   |");
        line5.put(1, "    |");
        line5.put(2, "|    ");
        line5.put(3, "    |");
        line5.put(4, "    |");
        line5.put(5, "    |");
        line5.put(6, "|   |");
        line5.put(7, "    |");
        line5.put(8, "|   |");
        line5.put(9, "    |");

        line6.put(0, "|   |");
        line6.put(1, "    |");
        line6.put(2, "|    ");
        line6.put(3, "    |");
        line6.put(4, "    |");
        line6.put(5, "    |");
        line6.put(6, "|   |");
        line6.put(7, "    |");
        line6.put(8, "|   |");
        line6.put(9, "    |");

        line7.put(0, "+---+");
        line7.put(1, "    +");
        line7.put(2, "+---+");
        line7.put(3, "+---+");
        line7.put(4, "    +");
        line7.put(5, "+---+");
        line7.put(6, "+---+");
        line7.put(7, "    +");
        line7.put(8, "+---+");
        line7.put(9, "+---+");

        while(true) {
            String str = in.readLine();
            if(str.equals("end")) break;
            int[] time = {Integer.parseInt(str.substring(0, 1)), Integer.parseInt(str.substring(1, 2)), Integer.parseInt(str.substring(3, 4)), Integer.parseInt(str.substring(4, 5))};
            out.print(line1.get(time[0]) + "  ");
            out.print(line1.get(time[1]) + "     ");
            out.print(line1.get(time[2]) + "  ");
            out.println(line1.get(time[3]));
            out.print(line2.get(time[0]) + "  ");
            out.print(line2.get(time[1]) + "     ");
            out.print(line2.get(time[2]) + "  ");
            out.println(line2.get(time[3]));
            out.print(line3.get(time[0]) + "  ");
            out.print(line3.get(time[1]) + "  o  ");
            out.print(line3.get(time[2]) + "  ");
            out.println(line3.get(time[3]));
            out.print(line4.get(time[0]) + "  ");
            out.print(line4.get(time[1]) + "     ");
            out.print(line4.get(time[2]) + "  ");
            out.println(line4.get(time[3]));
            out.print(line5.get(time[0]) + "  ");
            out.print(line5.get(time[1]) + "  o  ");
            out.print(line5.get(time[2]) + "  ");
            out.println(line5.get(time[3]));
            out.print(line6.get(time[0]) + "  ");
            out.print(line6.get(time[1]) + "     ");
            out.print(line6.get(time[2]) + "  ");
            out.println(line6.get(time[3]));
            out.print(line7.get(time[0]) + "  ");
            out.print(line7.get(time[1]) + "     ");
            out.print(line7.get(time[2]) + "  ");
            out.println(line7.get(time[3]));
            out.println();
            out.println();
        }
        out.println("end");
        out.close();
    }
}