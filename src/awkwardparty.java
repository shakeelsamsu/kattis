import java.util.*;
import java.math.*;
import java.io.*;

public class awkwardparty {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int n = Integer.parseInt(in.readLine());
		int[] locations = new int[1000001];
		int[] mins = new int[1000001];
		StringTokenizer st = new StringTokenizer(in.readLine());
		for(int i = 1; i <= n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(locations[x] != 0 && mins[x] != 0 && i - locations[x] < mins[x]) {
				mins[x] = i - locations[x];
				locations[x] = i;
			} 
			else if(locations[x] != 0 && mins[x] == 0) {
				mins[x] = i - locations[x];
				locations[x] = i;
			}
			else {
				locations[x] = i;
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i : mins) {
			if(i != 0 && i < min)
				min = i; 
		}
		System.out.println(min == Integer.MAX_VALUE ? n : min);
	}
}
