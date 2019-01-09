import java.io.*;
import java.util.*;

public class cetiri {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++) list.add(Integer.parseInt(st.nextToken()));
		Collections.sort(list);
		out.println(find(list));
		out.close();
	}
	
	public static int find(ArrayList<Integer> nums) {
		int diff1 = nums.get(1) - nums.get(0);
		int diff2 = nums.get(2) - nums.get(1);
		if(diff1 == diff2) return nums.get(2) + diff1;
		else if(diff2 > diff1) return nums.get(2) - diff1;
		return nums.get(0) + diff2;
	}
}