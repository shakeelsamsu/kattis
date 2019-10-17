import java.io.*;
import java.util.*;

public class ladder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double height = in.nextDouble();
		double angle = in.nextDouble();
		double ladder = height / Math.sin(Math.toRadians(angle));
		System.out.printf("%.0f", Math.ceil(ladder));
	}

}
