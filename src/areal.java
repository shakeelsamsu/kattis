import java.util.*;
import java.io.*;

public class areal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double area = in.nextDouble();
		double length = Math.sqrt(area);
		double perimeter = 4 * length;
		System.out.println(perimeter);
	}

}
