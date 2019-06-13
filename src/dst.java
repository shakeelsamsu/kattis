import java.io.*;
import java.util.*;

public class dst {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            String direction = st.nextToken();
            boolean forwards = direction.equals("F");
            int change = Integer.parseInt(st.nextToken());
            int hour = Integer.parseInt(st.nextToken());
            int minute = Integer.parseInt(st.nextToken());
            int changeHour = change / 60;
            int changeMinute = change % 60;
            if(forwards) {
                if(minute + changeMinute >= 60) {
                    if(hour == 23) hour = 0;
                    else hour++;
                    minute -= 60 - changeMinute;
                }
                else {
                    minute += changeMinute;
                }
                if(hour + changeHour >= 24) {
                    hour = (hour + changeHour) % 24;
                    changeHour -= 1;
                }
                else hour += changeHour;
            }
            else {
                if(minute - changeMinute < 0) {
                    if(hour <= 0) hour = 23;
                    else hour--;
                    minute += 60 - changeMinute;
                }
                else {
                    minute -= changeMinute;
                }
                if(hour - changeHour < 0) {
                    hour = 23;
                    changeHour -= 1;
                }
                else hour -= changeHour;
            }
            out.println(hour + " " + minute);    
        }
        out.close();
    }
}