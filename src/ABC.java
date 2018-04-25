import java.util.*;
import java.io.*;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = in.nextInt();
        }
        Arrays.sort(num);
        char[] abc = in.next().toCharArray();
        for (int x = 0; x < 3; x++) {
            System.out.print(num[abc[x] - 'A'] + " ");
        }
   }
} 
