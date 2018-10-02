import java.util.Scanner;
import java.util.Arrays;
import java.math.*;

public class encodedmessage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {	
			int col;
			int row = 1;
			boolean finished = false;
			String str = in.next();
			int dimensions = (int) Math.sqrt(str.length());
			int temp = dimensions - 1;
			col = dimensions;
			int square = (int) Math.pow(dimensions, 2); 
			char[] msg = str.toCharArray();
			for(int x = 0; x < msg.length; x++) {
				if(temp <= square) {
					System.out.print(msg[temp]);
				}
				else {
					temp -= (square + 1);
					System.out.print(msg[temp]);
				}
				temp += dimensions;
				
				/*
				if(row == dimensions) finished = true;
				if(row == dimensions && col == 1) System.out.print(msg[0]);
				row++;
				if(finished) {
					col--;
					row = 1;
					finished = false;
				}
				*/
			}
			System.out.println();
		}
	}
}
 
