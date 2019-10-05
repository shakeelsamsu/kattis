import java.io.*;
import java.util.*;

public class twostones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		if(x % 2 == 0) {
			System.out.println("Bob");
		}
		else {
			System.out.println("Alice");
		}
	}

}
