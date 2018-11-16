import java.io.*;
import java.util.*;
import java.math.*;

public class wertyu {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)/*new FileReader("input.txt")*/);
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        HashMap<Character, String> map = new HashMap<>();
        //need to do something special for Q
        map.put('1', "`");
        map.put('2', "1");
        map.put('3', "2");
        map.put('4', "3");
        map.put('5', "4");
        map.put('6', "5");
        map.put('7', "6");
        map.put('8', "7");
        map.put('9', "8");
        map.put('0', "9");
        map.put('-', "0");
        map.put('=', "-");

        map.put('W', "Q");
        map.put('E', "W");
        map.put('R', "E");
        map.put('T', "R");
        map.put('Y', "T");
        map.put('U', "Y");
        map.put('I', "U");
        map.put('O', "I");
        map.put('P', "O");
        map.put('[', "P");
        map.put(']', "[");
        map.put('\\', "]");

        map.put('S', "A");
        map.put('D', "S");
        map.put('F', "D");
        map.put('G', "F");
        map.put('H', "G");
        map.put('J', "H");
        map.put('K', "J");
        map.put('L', "K");
        map.put(';', "L");
        map.put('\'', ";");

        map.put('X', "Z");
        map.put('C', "X");
        map.put('V', "C");
        map.put('B', "V");
        map.put('N', "B");
        map.put('M', "N");
        map.put(',', "M");
        map.put('.', ",");
        map.put('/', ".");

        String line = "";
        while((line = in.readLine()) != null) {
            for(int i = 0; i < line.length(); i++) {
                char curr = line.charAt(i);
                if(curr == 'Q') out.print("/t");
                else if(curr == ' ') out.print(" ");
                else out.print(map.get(curr));
            }
            out.println();
        }
        out.close();
    }
}