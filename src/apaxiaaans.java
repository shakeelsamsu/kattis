import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class apaxiaaans {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String name = in.next();
    ArrayList<Character> stringChars = new ArrayList<Character>();
	for (char c : name.toCharArray()) {
  		stringChars.add(c);
	}
    for(int i = 0; i < stringChars.size() - 1; i++) {
      if(stringChars.get(i) == stringChars.get(i+1)) {
        stringChars.remove(i);
        i--;
      }
    }
	StringBuilder sb = new StringBuilder();
    for (char s : stringChars)
    {
        sb.append(s);
    }

    System.out.println(sb.toString());
  }
}
