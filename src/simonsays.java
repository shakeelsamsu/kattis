import java.io.*;
import java.util.*;

public class simonsays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            String command = in.nextLine();
            if (command.contains("Simon says"))
                System.out.println(command.substring(11));
        }
    }

}
