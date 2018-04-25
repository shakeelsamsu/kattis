import java.util.*;
import java.io.*;

public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char[] moves = in.next().toCharArray();
		int position = 1;
		for(int i = 0; i < moves.length; i++) {
			if(moves[i] == 'A') {
				if(position == 1) {
					position = 2;
				}
				else if(position == 2) {
					position = 1;
				}
			}
			if(moves[i] == 'B') {
				if(position == 2) {
					position = 3;
				}
				else if(position == 3) {
					position = 2;
				}
			}
			if(moves[i] == 'C') {
				if(position == 1) {
					position = 3;
				}
				else if(position == 3) {
					position = 1;
				}
			}
		}
		System.out.println(position);
   }
} 
