import java.util.*;
import java.math.*;
import java.io.*;

public class thegrandadventure {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int n = Integer.parseInt(in.readLine());
		while(n-- > 0) {
			String line = in.readLine().replace(".", "");
			Stack<Character> stack = new Stack<Character>();
			boolean status = true;
			for(char c : line.toCharArray()) {
				if(!status) break;
				if(c == '$' || c == '|' || c == '*')
					stack.push(c);
				else {
					if(stack.isEmpty()) {
						out.println("NO");
						status = false;
						break;
					}
					char x = stack.pop();
					if(c == 'b' && x != '$') {
						out.println("NO");
						status = false;
					}
					if(c == 't' && x != '|') {
						out.println("NO");
						status = false;
					}
					if(c == 'j' && x != '*') {
						out.println("NO");
						status = false;
					}
				}
			}
			if(!stack.isEmpty() && status) {
				out.println("NO");
				status = false;
			}
			if(status) {
				out.println("YES");
			}
		}
		out.close();
	}
}
