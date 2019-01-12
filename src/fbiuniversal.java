import java.io.*;
import java.util.*;

public class fbiuniversal {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        String vals = "0123456789ACDEFHJKLMNPRTVWX";
        HashMap<String, Integer> confusedVals = new HashMap<String, Integer>();
        confusedVals.put("B", 8);
        confusedVals.put("G", vals.indexOf("C"));
        confusedVals.put("I", 1);
        confusedVals.put("O", 0);
        confusedVals.put("Q", 0);
        confusedVals.put("S", 5);
        confusedVals.put("U", vals.indexOf("V"));
        confusedVals.put("Y", vals.indexOf("V"));
        confusedVals.put("Z", vals.indexOf("2"));

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int caseNum = Integer.parseInt(st.nextToken());
            String data = st.nextToken();
            String checkDigitTemp = data.substring(8);
            int checkDigit;
            if(confusedVals.containsValue(checkDigitTemp)) 
                checkDigit = confusedVals.get(checkDigitTemp);
            else checkDigit = vals.indexOf(checkDigitTemp);
            int check = (2 * (confusedVals.containsValue(data.substring(0, 1)) ? confusedVals.get(data.substring(0, 1)) : vals.indexOf(data.substring(0, 1)))
                + 4 * (confusedVals.containsValue(data.substring(1, 2)) ? confusedVals.get(data.substring(1, 2)) : vals.indexOf(data.substring(1, 2)))
                + 5 * (confusedVals.containsValue(data.substring(2, 3)) ? confusedVals.get(data.substring(2, 3)) : vals.indexOf(data.substring(2, 3)))
                + 7 * (confusedVals.containsValue(data.substring(3, 4)) ? confusedVals.get(data.substring(3, 4)) : vals.indexOf(data.substring(3, 4)))
                + 8 * (confusedVals.containsValue(data.substring(4, 5)) ? confusedVals.get(data.substring(4, 5)) : vals.indexOf(data.substring(4, 5)))
                + 10 * (confusedVals.containsValue(data.substring(5, 6)) ? confusedVals.get(data.substring(5, 6)) : vals.indexOf(data.substring(5, 6)))
                + 11 * (confusedVals.containsValue(data.substring(6, 7)) ? confusedVals.get(data.substring(6, 7)) : vals.indexOf(data.substring(6, 7)))
                + 13 * (confusedVals.containsValue(data.substring(7, 8)) ? confusedVals.get(data.substring(7, 8)) : vals.indexOf(data.substring(7, 8)))) % 27;
            if(check == checkDigit) {
                long res = 0;
                for(int j = 0; j < 8; j++) {
                    String digit = data.substring(j, j + 1);
                    res += (confusedVals.containsValue(digit) ? confusedVals.get(digit) * Math.pow(27, 7 - j) : vals.indexOf(digit) * Math.pow(27, 7 - j));
                }
                out.println(caseNum + " " + res);
            }
            else out.println(caseNum + " " + "Invalid");
        }
        out.close();
    }
}