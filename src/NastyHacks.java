import java.io.*;
import java.util.*;

public class NastyHacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int revenue = in.nextInt();
			int expected = in.nextInt();
			int cost = in.nextInt();
			if(expected - cost > revenue) {
				System.out.println("advertise");
			}
			if(expected - cost < revenue) {
				System.out.println("do not advertise");
			}
			if(expected - cost == revenue) {
				System.out.println("does not matter");
			}
			in.nextLine();
			}
		
	}

}
