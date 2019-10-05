import java.util.*;
import java.io.*;

public class planina {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double answer = Math.pow(Math.pow(2, n) + 1, 2);
        System.out.printf("%.0f", answer);
        }
        
}
