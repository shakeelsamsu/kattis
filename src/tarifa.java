import java.io.*;
import java.util.*;

public class tarifa {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int available = x;
        for(int i = 0; i < n; i++) {
            available += (x - in.nextInt());
        }
        System.out.println(available);
    }
}