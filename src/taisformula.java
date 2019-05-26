import java.util.*;
import java.math.*;
import java.io.*;

public class taisformula {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int n = Integer.parseInt(in.readLine());
		Point[] points = new Point[n];
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			points[i] = new Point(Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
		}
		double total = 0;
		for(int i = 1; i < n; i++) {
			Point a = points[i - 1];
			Point b = points[i];
			total += Math.abs(a.t - b.t) * (a.v + b.v) / 2;
		}
		out.println(total / 1000);
		out.close();
	}
}

class Point {
	int t;
	double v;

	public Point(int t, double v) {
		this.t = t;
		this.v = v;
	}
}