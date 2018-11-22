import java.io.*;
import java.util.*;

public class averagespeed {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader in = new BufferedReader(new FileReader("input.txt"));        
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        double lastTime = 0;
        double currentTime = 0;
        double elapsedTime = 0;
        double speed = 0;
        double totalDistance = 0;
        while((line = in.readLine()) != null) {
            String[] input = line.split(" ");
            String[] time = input[0].split(":");
            if(input.length == 1) {
                currentTime = Double.parseDouble(time[0]);
                currentTime += Double.parseDouble(time[1]) / 60;
                currentTime += Double.parseDouble(time[2]) / 60 / 60;
                elapsedTime = currentTime - lastTime;
                totalDistance += elapsedTime * speed;
                out.println(input[0] + " " + String.format("%.2f", totalDistance) + " km");
            }
            else {
                currentTime = Double.parseDouble(time[0]);
                currentTime += Double.parseDouble(time[1]) / 60;
                currentTime += Double.parseDouble(time[2]) / 60 / 60;
                elapsedTime = currentTime - lastTime;
                totalDistance += elapsedTime * speed;
                speed = Double.parseDouble(input[1]); 
            }
            lastTime = currentTime;
        }
        out.close();
    }
}