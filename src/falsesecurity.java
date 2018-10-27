import java.io.*;
import java.util.*;

public class falsesecurity {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        HashMap<Character, String> morse = new HashMap<Character, String>();
        morse.put('A', ".-");
        morse.put('B', "-...");
        morse.put('C', "-.-.");
        morse.put('D', "-..");
        morse.put('E', ".");
        morse.put('F', "..-.");
        morse.put('G', "--.");
        morse.put('H', "....");
        morse.put('I', "..");
        morse.put('J', ".---");
        morse.put('K', "-.-");
        morse.put('L', ".-..");
        morse.put('M', "--");
        morse.put('N', "-.");
        morse.put('O', "---");
        morse.put('P', ".--.");
        morse.put('Q', "--.-");
        morse.put('R', ".-.");
        morse.put('S', "...");
        morse.put('T', "-");
        morse.put('U', "..-");
        morse.put('V', "...-");
        morse.put('W', ".--");
        morse.put('X', "-..-");
        morse.put('Y', "-.--");
        morse.put('Z', "--..");
        morse.put('_', "..--");
        morse.put(',', ".-.-");
        morse.put('.', "---.");
        morse.put('?', "----");
        String line = "";
        while((line = in.readLine()) != null) {
            String code = "";
            ArrayList<Integer> order = new ArrayList<Integer>();
            for(int i = 0; i < line.length(); i++) {
                code += morse.get(line.charAt(i));
                order.add(morse.get(line.charAt(i)).length());
            }
            //System.out.println("code: " + code);
            Collections.reverse(order);
            //System.out.println("al: " + order);
            String str = "";
            int temp = 0;
            for(int i = 0; i < order.size(); i++) {
                String sec = code.substring(temp, temp + order.get(i));
                //System.out.println("sec: " + sec);
                for(Character key : morse.keySet()) {
                    if(morse.get(key).equals(sec)) {
                        str += key;
                        break;
                    }
                }
                temp += order.get(i);
            }
            //System.out.println(str + "hi");
            System.out.println(str);
        }
        out.close();
    }
}