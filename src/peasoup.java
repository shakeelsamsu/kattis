import java.util.*;
import java.math.*;
import java.io.*;

public class peasoup {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int n = Integer.parseInt(in.readLine());
		while(n-- > 0) {
			int x = Integer.parseInt(in.readLine());
			String name = in.readLine();
			boolean ps, pan;
			ps = pan = false;
			while(x-- > 0 && !(ps && pan)) {
				String line = in.readLine();
				if(line.equals("pea soup"))
					ps = true;
				else if(line.equals("pancakes")) {
					pan = true;
				}
			}
			if(ps && pan) {
				out.println(name);
				out.close();
				break;
			}
		}
		out.println("Anywhere is fine I guess");
		out.close();
	}
}
