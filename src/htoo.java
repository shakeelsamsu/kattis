import java.io.*;
import java.util.*;

public class htoo {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int[] elements = new int[26];
        Arrays.fill(elements, Integer.MAX_VALUE);
        String[] input = in.readLine().split("");
        int i = Arrays.asList(input).indexOf(" ") + 1;
        String temp = "";
        for(; i < input.length; i++) {
            temp += input[i];
        }
        int multiplier = Integer.parseInt(temp);
        i = 0;
        while(!input[i].equals(" ")) {
            char element = input[i].charAt(0);
            i++;
            temp = "";
            while(input[i].matches("\\d+")) {
                temp += input[i];
                i++;
            } 
            if(temp.equals("")) temp = "1";
            if(elements[element - 'A'] == Integer.MAX_VALUE) elements[element - 'A'] = Integer.parseInt(temp) * multiplier;
            else elements[element - 'A'] = elements[element - 'A'] + Integer.parseInt(temp) * multiplier;
        }
        // out.println(Arrays.toString(elements));
        String[] product = in.readLine().split("");
        i = 0;
        boolean impossible = false;
        int min = Integer.MAX_VALUE;
        int[] required = new int[26];
        Arrays.fill(required, Integer.MAX_VALUE);
        for(; !impossible && i < product.length; i++) {
            char element = product[i].charAt(0);
            temp = "";
            while(i + 1 < product.length && product[i + 1].matches("\\d+")) {
                i++;
                temp += product[i];
            } 
            if(temp.equals("")) temp = "1";
            int req = Integer.parseInt(temp);
            int index = element - 'A';
            if(elements[index] == Integer.MAX_VALUE) {
                impossible = true;
            }
            else {
                if(required[index] == Integer.MAX_VALUE) required[index] = req;
                else required[index] = required[index] + req;
            }
            // out.println(i);
        }
        for(i = 0; !impossible && i < 26; i++) {
            if(elements[i] != Integer.MAX_VALUE && required[i] != Integer.MAX_VALUE) {
                elements[i] = elements[i] / required[i];
                if(elements[i] < min) min = elements[i];
            }
        }
        // out.println(Arrays.toString(required));
        // out.println(Arrays.toString(elements));
        // out.println(impossible);
        if(impossible) out.println(0);
        else out.println(min);
        out.close();
    }
}