import java.io.*;
import java.util.*;

public class modulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<Integer> modulo = new HashSet<>();
		for(int i = 0; i < 10; i++) {
			modulo.add(in.nextInt() % 42);
		}
		System.out.println(modulo.size());
	}

}
