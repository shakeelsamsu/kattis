import java.io.*;
import java.util.*;

public class mjehuric {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int[] template = {1, 2, 3, 4, 5};
        int[] arr = new int[5];
        StringTokenizer st = new StringTokenizer(in.readLine());
        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        while(!Arrays.equals(arr, template)) {
            boolean status = false;
            for(int i = 0; !Arrays.equals(arr, template) && i < arr.length - 1; i++) {
                if(arr[i + 1] < arr[i]) {
                    status = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                if(status) {
                    status = false;
                    String str = Arrays.toString(arr);
                    out.println(str.substring(1, str.length() - 1).replace(",", ""));
                }
            }
        }
        out.close();
    }
}