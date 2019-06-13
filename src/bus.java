import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class bus {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            int stops = in.nextInt();
            System.out.println(passengers(stops));
        }
    }

    public static int passengers(int stops) {
        double result = 1;
        if(stops < 2) return 1;
        for(int i = 1; i < stops; i++) {
            result += 0.5;
            result *= 2;
        }
        int num = (int) result;
        return num;
    }
}