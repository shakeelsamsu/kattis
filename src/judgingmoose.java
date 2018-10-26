/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Oct 26 18 11:57:54 AM
 */
 
import java.util.Scanner;

public class judgingmoose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a == 0 && b == 0) System.out.println("Not a moose");
        else if(a == b) System.out.println("Even " + (2 * a));
        else {
            long max = Math.max(a, b) * 2;
            System.out.println("Odd " + max);
        }
    }
}