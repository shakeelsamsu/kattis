import java.util.*;
import java.math.*;
import java.io.*;

public class anti11 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int n = Integer.parseInt(in.readLine());
		int max = 2;
		BigInteger[] fib = new BigInteger[10001];
		fib[0] = BigInteger.ONE;
		fib[1] = BigInteger.valueOf(2);
		fib[2] = BigInteger.valueOf(3);
		while(n-- > 0) {
			int x = Integer.parseInt(in.readLine());
			if(x > max) {
				int i = max + 1;
				while(i <= x) {
					fib[i] = fib[i - 2].add(fib[i - 1]);
					i++;
				}
				max = x;
			}
			out.println(fib[x].mod(BigInteger.valueOf(1000000007)));
		}
		out.close();
	}
}
