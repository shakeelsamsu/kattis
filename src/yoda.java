import java.util.*;
import java.math.*;
import java.io.*;

public class yoda {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		StringBuilder x = new StringBuilder(in.readLine());
		StringBuilder y = new StringBuilder(in.readLine());
		
		String a = x.reverse().toString();
		String b = y.reverse().toString();

		for(int i = 0; i < Math.min(x.length(), y.length()); i++) {
			if(Integer.parseInt(a.substring(i, i + 1)) > Integer.parseInt(b.substring(i, i + 1)))
				b = b.substring(0, i) + "-" + b.substring(i + 1);
			else if(Integer.parseInt(a.substring(i, i + 1)) < Integer.parseInt(b.substring(i, i + 1)))
				a = a.substring(0, i) + "-" + a.substring(i + 1);
			
		}
		a = a.replace("-", "");
		b = b.replace("-", "");

		x = new StringBuilder(a);
		y = new StringBuilder(b);

		out.println(x.length() == 0 ? "YODA" : Integer.parseInt(x.reverse().toString()));
		out.println(y.length() == 0 ? "YODA" : Integer.parseInt(y.reverse().toString()));
		out.close();
	}
}
