/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Sep 26 18 8:53:47
 */

import java.io.*;
import java.util.*;

public class statistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        while(in.hasNextInt()) {
            int n = in.nextInt();
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                int a = in.nextInt();
                if (a < min)
                    a = min;
                if (a > max)
                    a = max;
            }
            System.out.println("Case " + count + ": " + min + " " + max + " " + (max - min));
            count++;
        }
    }
}
