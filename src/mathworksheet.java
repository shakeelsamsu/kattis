import java.io.*;
import java.util.*;

public class mathworksheet {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        boolean first = true;
        while(true) {
            int n = Integer.parseInt(in.readLine());
            if(n == 0) break;
            if(!first) out.println();
            first = false;
            String[] nums = new String[n];
            int maxLength = 0;
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                int a = Integer.parseInt(st.nextToken());
                char op = st.nextToken().charAt(0);
                int b = Integer.parseInt(st.nextToken());
                String res = "";
                switch(op) {
                    case '+':
                        res = Integer.toString(a + b);
                        maxLength = Math.max(maxLength, res.length());
                        break;
                    case '-':
                        res = Integer.toString(a - b);
                        maxLength = Math.max(maxLength, res.length());
                        break;
                    case '*':
                        res = Integer.toString(a * b);
                        maxLength = Math.max(maxLength, res.length());
                        break;
                }
                nums[i] = res;
            }
            String f = "%"+maxLength+"s";
            int index = 0;
            String curr = "";
            while(index < n) {
                if(curr.length() - 1 + maxLength >= 50) {
                    out.println(curr.substring(0, curr.length() - 1));
                    curr = String.format(f, nums[index]) + " ";
                }
                else {
                    curr += String.format(f, nums[index]) + " ";
                }
                index++;
            }
            out.println(curr.substring(0, curr.length() - 1));
        }
        out.close();
    }
}