import java.io.*;
import java.util.*;

public class autori {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] array  = s.split("-");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i].charAt(0));
        }
    }

}
