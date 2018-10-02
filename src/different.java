/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Apr 25 18
 */

import java.util.*;
import java.io.*;

public class different {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNextLong()) {
			System.out.println(Math.abs(in.nextLong() - in.nextLong()));
		}
   }
} 
