/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Apr 25 18
 */

import java.util.*;
import java.io.*;

public class pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int newSum = 0;
		int oldSum = 0;
		int contestant = 0;
		for(int i = 1; i <= 5; i++) {
			sum = 0;
			for(int n = 0; n < 4; n++) {				
				sum +=in.nextInt();
				if (sum > oldSum) {
					contestant = i;
					oldSum = sum;
					newSum = sum;
				}
			}			
		}
		System.out.println(contestant + " " + newSum);
	}
}
