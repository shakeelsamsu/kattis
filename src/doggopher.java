import java.util.*;
import java.math.*;
import java.io.*;

public class doggopher {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		double gx = Double.parseDouble(st.nextToken());
		double gy = Double.parseDouble(st.nextToken());
		double dx = Double.parseDouble(st.nextToken());
		double dy = Double.parseDouble(st.nextToken());
		String line = "";
		boolean escaped = false;
		while((line = in.readLine()) != null) {
			st = new StringTokenizer(line);
			double hx = Double.parseDouble(st.nextToken());
			double hy = Double.parseDouble(st.nextToken());
			if(Math.hypot(Math.abs(gx - hx), Math.abs(gy - hy)) * 2 < Math.hypot(Math.abs(dx - hx), Math.abs(dy - hy))) {
				out.println("The gopher can escape through the hole at (" + String.format("%.3f", hx) + "," + String.format("%.3f", hy) + ").");
				escaped = true;
			}
		}
		if(!escaped) {
			out.println("The gopher cannot escape.");
		}
		out.close();
	}
}
