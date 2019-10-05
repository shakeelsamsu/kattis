import java.io.*;
import java.util.*;

public class pizza2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double radius = in.nextDouble();
        double circumference = in.nextDouble();
        System.out.printf("%.6f", (Math.PI * Math.pow(radius - circumference, 2)) / (Math.PI * Math.pow(radius, 2)) * 100);
	}

}
