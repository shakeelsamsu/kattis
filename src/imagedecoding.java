import java.io.*;
import java.util.*;
import java.math.*;

public class imagedecoding {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int count = 1;
        while(true) {
            int n = Integer.parseInt(in.readLine());
            if(n == 0) break;
            if(count != 1) out.println();
            int length = 0;
            boolean error = false;
            for(int i = 0; i < n; i++) {
                String[] input = in.readLine().split(" ");
                boolean hash = input[0].equals("#");
                int tempLength = 0;
                for(int j = 1; j < input.length; j++) {
                    int reps = Integer.parseInt(input[j]);
                    if(i == 0) length += reps;
                    if(hash) {
                        for(int h = 0; h < reps; h++) out.print("#");
                        hash = false;
                    }
                    else {
                        for(int p = 0; p < reps; p++) out.print(".");
                        hash = true;
                    }
                    tempLength += reps;
                }
                if(i != 0 && tempLength != length) error = true;
                tempLength = 0;
                out.println();
            }
            if(error)out.println("Error decoding image");
            count++;
        }
        out.close();
    }
}