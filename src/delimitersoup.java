import java.io.*;
import java.util.*;

public class delimitersoup {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        char[] arr = in.readLine().toCharArray();
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < n; i++) {
            char c = arr[i];
            if(c == ' ') continue;
            if(c == ']' || c == '}' || c == ')') {
                if(stack.isEmpty()) {
                    out.println(c + " " + i);
                    out.close();
                }
                else {
                    char check = stack.pop();
                    if(check != (c == ')' ? c - 1 : c - 2)) {
                        // out.println(i + " " + check + " " + c + " " + (char) (check + 1));
                        out.println(c + " " + i);
                        out.close();
                    }
                }
            }
            else   
                stack.push(c);
        }
        out.println("ok so far");
        out.close();
    }
}