import java.util.*;
import java.io.*;

public class abc {

	public static void main(String[] args) {
        for (int x = 0; x < 100; x++) {
            Random rand = new Random();
            double criticRating = rand.nextDouble() * 100;
            System.out.println(criticRating);
        }
        System.out.println(3 * 0.2 + 5.5 * 0.3 + 0.47 * 0.5);
   }
} 
