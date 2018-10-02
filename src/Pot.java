/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Apr 25 18
 */

import java.io.*;
import java.util.*;

public class pot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double product = 0;
		for(int i = 0; i < n; i++) {
			String one = in.next();
			String power = one.substring(one.length() - 1); 
			String base = one.substring(0, one.length() - 1);
			double convPower = Double.parseDouble(power);
			double convBase = Double.parseDouble(base);
			product = product + Math.pow(convBase, convPower);
			in.nextLine();
			}
		System.out.printf("%.0f", product);
	}

}
