/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Apr 25 18
 */

import java.io.*;
import java.util.*;

public class cold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int below = 0;
		for(int i = 0; i < n; i++) {
			if(in.nextInt() < 0) {
				below++;
			}
		}
		System.out.println(below);
	}

}
