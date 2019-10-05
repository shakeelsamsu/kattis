import java.io.*;
import java.util.*;

public class quadrant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		if(x > 0 && y > 0) {
			System.out.println(1);
		}
		if(x < 0 && y > 0) {
			System.out.println(2);
		}
		if(x < 0 && y < 0) {
			System.out.println(3);
		}
		if(x > 0 && y < 0) {
			System.out.println(4);
		}
	}

}
