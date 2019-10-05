import java.util.*;
import java.io.*;

public class bijele {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] pieces = new int[] {1, 1, 2, 2, 2, 8};
		for(int i = 0; i < 6; i++) {
			int piece = in.nextInt();
			if(piece > pieces[i]) {
				System.out.print(-1 * (piece - pieces[i]));
				System.out.print(" ");
			}
			else if(piece < pieces[i]) {
				System.out.print(pieces[i] - piece);
				System.out.print(" ");
			}
			else {
				System.out.print(0);
				System.out.print(" ");
			}
		}
		
		
	}

}
