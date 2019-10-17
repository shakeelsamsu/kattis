import java.io.*;
import java.util.*;

public class hissingmicrophone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String message = "no hiss";
		for(int i=0; i<line.length()-1; i++) {
			if(line.charAt(i)== 's' && line.charAt(i+1)=='s') {
				message = "hiss";
				break;
			}
		}
		System.out.println(message);
	}

}
