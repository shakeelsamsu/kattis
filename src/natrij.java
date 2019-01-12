import java.io.*;
import java.util.*;

public class natrij {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String[] currTime = in.readLine().split(":");
        String[] newTime = in.readLine().split(":");

        int currHour = Integer.parseInt(currTime[0]);
        int newHour = Integer.parseInt(newTime[0]);
        int currMin = Integer.parseInt(currTime[1]);
        int newMin = Integer.parseInt(newTime[1]);
        int currSec = Integer.parseInt(currTime[2]);
        int newSec = Integer.parseInt(newTime[2]);

        int sec = 0;
        int min = 0;
        int hour = 0;
        if(currSec <= newSec) sec = newSec - currSec;
        else {
            sec = 60 - currSec + newSec;
            currMin++;
        }
        if(currMin <= newMin) min += newMin - currMin;
        else {
            min += 60 - currMin + newMin;
            currHour++;
        }
        if(currHour <= newHour) hour += newHour - currHour;
        else {
            hour += 24 - currHour + newHour;
        }
        if(hour == 0 && min == 0 && sec == 0) out.println("24:00:00");
        else out.println(String.format("%02d", hour) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sec));
        out.close();
    }
}