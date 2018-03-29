import java.util.*;
import java.io.*;

public class AlphabetSpam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String title = in.next();
		char[] titleChars = title.toCharArray();
		double whitespace = 0;
		double lowercase = 0;
		double uppercase = 0;
		double symbols = 0;
		for(int i = 0; i < titleChars.length; i++) {
			if(titleChars[i] == '_') {
				whitespace++;
			}
			if(titleChars[i] > 96 && titleChars[i] < 123) {
				lowercase++;
			}
			if(titleChars[i] > 64 && titleChars[i] < 91) {
				uppercase++;
			}
			if((titleChars[i] > 32 && titleChars[i] < 65) || (titleChars[i] > 122 && titleChars[i] < 127) || (titleChars[i] > 90 && titleChars[i] < 97 && titleChars[i] != 95)) {
				symbols++;
			}
		}
		System.out.println(whitespace / titleChars.length);
		System.out.println(lowercase / titleChars.length);
		System.out.println(uppercase / titleChars.length);
		System.out.println(symbols / titleChars.length);
	}

}
