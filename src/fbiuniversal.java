import java.io.*;
import java.util.*;

public class fbiuniversal {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        String vals = "0123456789ACDEFHJKLMNPRTVWX";

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int caseNum = Integer.parseInt(st.nextToken());
            String data = st.nextToken();
            String checkDigitTemp = data.substring(8);
            int checkDigit = vals.indexOf(checkDigitTemp);
            int check = (2 * vals.indexOf(data.substring(0, 1))
                + 4 * vals.indexOf(data.substring(1, 2))
                + 5 * vals.indexOf(data.substring(2, 3))
                + 7 * vals.indexOf(data.substring(3, 4))
                + 8 * vals.indexOf(data.substring(4, 5))
                + 10 * vals.indexOf(data.substring(5, 6))
                + 11 * vals.indexOf(data.substring(6, 7))
                + 13 * vals.indexOf(data.substring(7, 8))) % 27;
            if(check == checkDigit) {
                long res = 0;
                for(int j = 0; j < 8; j++) {
                    String digit = data.substring(j, j + 1);
                    res += vals.indexOf(digit) * Math.pow(27, 7 - j);
                }
                out.println(caseNum + " " + res);
            }
            else out.println(caseNum + " " + "Invalid");
        }
        out.close();
    }
}