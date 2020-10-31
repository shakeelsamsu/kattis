import java.util.*;
import java.io.*;

public class threedprinter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int statues = in.nextInt();
		double printers = 1;
		int days = 1;
		while(statues > printers) {
			printers = printers + Math.pow(2, days - 1);
			days++;
		}
		System.out.print(days);
	}

}
