import java.util.*;
import java.io.*;

public class quickestimate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			String price = in.next();
			int estimate = price.length();
			System.out.println(estimate);
		}
	}

}
 
