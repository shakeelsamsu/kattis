import java.util.*;
import java.math.*;
import java.io.*;

public class competitivearcadebasketball {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> points = new HashMap<String, Integer>();
		ArrayList<String> winners = new ArrayList<String>();
		while(n-- > 0) in.readLine();
		while(m-- > 0) {
			st = new StringTokenizer(in.readLine());
			String player = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			if(!points.containsKey(player)) {
				points.put(player, score);
			}
			else {
				points.put(player, points.get(player) + score);
			}
			if(points.get(player) >= p && !winners.contains(player)) {
				winners.add(player);
			}
		}
		if(winners.isEmpty()) {
			out.println("No Winner!");
		}
		else {
			for(String w : winners) {
				out.println(w + " wins!");
			}
		}
		out.close();
	}
}


