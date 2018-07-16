import java.util.Arrays;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class zigzag {
  public static char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
	int num = Integer.parseInt(st.nextToken());
    if(num < 26) {
      String out = findChars(num, 'a');
      System.out.println(out);
    }
    else {
      
    }
  }
  public static String findChars(int distance, char reference) {
    String chars = Character.toString(reference);
    char endChar = 'z';
    for(int i =0; i < letters.length; i++) {
      if(Math.abs(Arrays.asList(letters).indexOf(reference) - i + 1) == distance) {
        endChar = letters[i];
        break;
      }
    }
    chars = chars + Character.toString(endChar);
    return chars;
  }
}

