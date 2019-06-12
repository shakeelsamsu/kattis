import java.util.*;
import java.math.*;
import java.io.*;

public class mathhomework {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int b = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());

		ArrayList<State> states = new ArrayList<State>();
		for(int i = 0; i <= l / b; i++) {
			for(int j = 0; j <= l / d; j++) {
				for(int k = 0; k <= l / c; k++) {
					if(b * i + j * d + k * c == l) {
						states.add(new State(i, j, k));
					}
				}
			}
		}
		if(states.size() == 0) {
			out.println("impossible");
		}
		else {
			for(State s : states) {
				out.println(s);
			}
		}
		out.close();
	}
}

class State implements Comparable<State> {
	
	int b, d, l;

	public State(int b, int d, int l) {
		this.b = b;
		this.d = d;
		this.l = l;
	}

	public int compareTo(State s) {
		return this.b - s.b + this.d - s.d + this.l - s.l;
	}

	public String toString() {
		return b + " " + d + " " + l;
	}
}
