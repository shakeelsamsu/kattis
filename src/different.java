import java.util.*;
import java.io.*;

public class different {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLong()) {
			System.out.println(Math.abs(in.nextLong() - in.nextLong()));
		}
   }
} 
