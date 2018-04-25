import java.io.*;
import java.util.*;

public class Modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		HashSet<Integer> modulo = new HashSet<>();
		for(int i = 0; i < 10; i++) {
			modulo.add(in.nextInt() % 42);
		}
		System.out.println(modulo.size());
	}

}
