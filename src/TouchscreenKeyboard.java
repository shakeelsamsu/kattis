import java.util.*;

public class Keyboard {

static String one = "qwertyuiop";
static String two = "asdfghjkl";
static String three = "zxcvbnm";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			String ref = in.next();
			int numWords = in.nextInt();
			ArrayList<String> words = new ArrayList<>();
			HashMap<String , Integer> map = new HashMap<>();
			for (int j = 0; j < numWords; j++)
			{
				String word = in.next();
				words.add(word);
				map.put(word, totalDistance(ref, word));
			}
			
			Collections.sort(words, new Comparator<String>() {
				public int compare(String a, String b) {
					int num1 = map.get(a);
					int num2 = map.get(b);
					
					if (num1 == num2)
						return a.compareTo(b);
					else
						return num1 - num2;
				}
			});
			for (int v = 0; v < words.size(); v++)
				System.out.println(words.get(v) + " " + map.get(words.get(v)));
			}
		}
	
	private static int row(char c) {
		if(one.contains("" + c)) {
			return 1;
		}
		else if(two.contains("" + c)) {
			return 2;
		}
			return 3;
		
	}
	
	private static int column(char c) {
		if(one.contains("" + c)) {
			return one.indexOf(c);
		}
		else if(two.contains("" + c)) {
			return two.indexOf(c);
		}
			return three.indexOf(c);
	}
	
	private static int distance(char x, char y) {
		int xOne = column(x);
		int xTwo = column(y);
		int yOne = row(x);
		int yTwo = row(y);
		return Math.abs(xTwo - xOne) + Math.abs(yTwo - yOne);
	}
	
	private static int totalDistance(String x, String y) {
		int distance = 0;
		for(int i = 0; i < x.length(); i++) {
			distance += distance(x.charAt(i), y.charAt(i));
		}
		return distance;
	}
}
