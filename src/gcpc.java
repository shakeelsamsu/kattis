import java.io.*;
import java.util.*;

public class gcpc {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashSet<Integer> above = new HashSet<Integer>();
		Team[] teams = new Team[n];
		
		for(int i = 0; i < n; i++) teams[i] = new Team(0, 0);

		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(in.readLine());
			int t = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			teams[t-1].update(p);
			if(t-1 == 0) {
				HashSet<Integer> toRemove = new HashSet<Integer>();
				for(int j : above) {
					if(teams[0].compareTo(teams[j]) >= 0) toRemove.add(j);
				}
				for(int x : toRemove) above.remove(x);
			}
			if(teams[t-1].compareTo(teams[0]) > 0) above.add(t-1);
			System.out.println(above.size() + 1);
		}
	}
}

class Team implements Comparable<Team> {
	int a;
	int b;

	public Team(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int compareTo(Team t) {
		if(this.a == t.a) {
			return t.b - this.b;
		}
		return this.a - t.a;
	}

	public void update(int b) {
		this.a += 1;
		this.b += b;
	}

	public String toString() {
		return a + " " + b;
	}
}
