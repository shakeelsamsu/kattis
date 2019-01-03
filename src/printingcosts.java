import java.io.*;
import java.util.*;

public class printingcosts {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        HashMap<Character, Integer> costs = new HashMap<Character, Integer>();
        costs.put(' ', 0);
        costs.put('&', 24);
        costs.put(',', 7);
        costs.put('2', 22);
        costs.put('8', 23);
        costs.put('>', 10);
        costs.put('D', 26);
        costs.put('J', 18);
        costs.put('P', 23);
        costs.put('V', 19);
        costs.put('\\', 10);
        costs.put('b', 25);
        costs.put('h', 21);
        costs.put('n', 18);
        costs.put('t', 17);
        costs.put('z', 19);
        costs.put('!', 9);
        costs.put('\'', 3);
        costs.put('-', 7);
        costs.put('3', 23);
        costs.put('9', 26);
        costs.put('?', 15);
        costs.put('E', 26);
        costs.put('K', 21);
        costs.put('Q', 31);
        costs.put('W', 26);
        costs.put(']', 18);
        costs.put('c', 17);
        costs.put('i', 15);
        costs.put('o', 20);
        costs.put('u', 17);
        costs.put('{', 18);
        costs.put('\"', 6);
        costs.put('(', 12);
        costs.put('.', 4);
        costs.put('4', 21);
        costs.put(':', 8);
        costs.put('@', 32);
        costs.put('F', 20);
        costs.put('L', 16);
        costs.put('R', 28);
        costs.put('X', 18);
        costs.put('^', 7);
        costs.put('d', 25);
        costs.put('j', 20);
        costs.put('p', 25);
        costs.put('v', 13);
        costs.put('|', 12);
        costs.put('#', 24);
        costs.put(')', 12);
        costs.put('/', 10);
        costs.put('5', 27);
        costs.put(';', 11);
        costs.put('A', 24);
        costs.put('G', 25);
        costs.put('M', 28);
        costs.put('S', 25);
        costs.put('Y', 14);
        costs.put('_', 8);
        costs.put('e', 23);
        costs.put('k', 21);
        costs.put('q', 25);
        costs.put('w', 19);
        costs.put('}', 18);
        costs.put('$', 29);
        costs.put('*', 17);
        costs.put('0', 22);
        costs.put('6', 26);
        costs.put('<', 10);
        costs.put('B', 29);
        costs.put('H', 25);
        costs.put('N', 25);
        costs.put('T', 16);
        costs.put('Z', 22);
        costs.put('`', 3);
        costs.put('f', 18);
        costs.put('l', 16);
        costs.put('r', 13);
        costs.put('x', 13);
        costs.put('~', 9);
        costs.put('%', 22);
        costs.put('+', 13);
        costs.put('1', 19);
        costs.put('7', 16);
        costs.put('=', 14);
        costs.put('C', 20);
        costs.put('I', 18);
        costs.put('O', 26);
        costs.put('U', 23);
        costs.put('[', 18);
        costs.put('a', 23);
        costs.put('g', 30);
        costs.put('m', 22);
        costs.put('s', 21);
        costs.put('y', 24);

        String line = "";
        while((line = in.readLine()) != null) {
            char[] input = line.toCharArray();
            int cost = 0;
            for(char c : input) {
                cost += costs.get(c);
            }
            out.println(cost);
        }
        out.close();
    }
}
