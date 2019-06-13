import java.util.Scanner;

public class dicecup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int reps = Math.abs(d2 - d1) + 1;
        int min = Math.min(d1, d2);
        for(int i = 1; i <= reps; i++) {
            System.out.println(i + min);
        }
    }
}