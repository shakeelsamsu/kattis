import java.util.*;
import java.io.*;

public class QuickEstimates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			String price = in.next();
			int estimate = price.length();
			System.out.println(estimate);
		}
	}

}
 
