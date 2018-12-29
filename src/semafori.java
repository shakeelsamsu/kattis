import java.io.*;
import java.util.*;

public class semafori {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int currentDist = 0;
        int time = 0;
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        TrafficLight[] lights = new TrafficLight[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            lights[i] = new TrafficLight(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        int currentLight = 0;
        while(currentDist < l) {
            if(currentLight < lights.length && lights[currentLight].dist == currentDist) {
                int totalLight = lights[currentLight].green + lights[currentLight].red;
                if(time % totalLight < lights[currentLight].red) {
                    time += lights[currentLight].red - time % totalLight;
                }
                currentLight++;
            }
            else {
                currentDist++;
                time++;
            }
        }
        out.println(time);
        out.close();
    }

    public static class TrafficLight {
        public int dist;
        public int red;
        public int green;

        public TrafficLight(int d, int r, int g) {
            dist = d; 
            red = r;
            green = g;
        }
    }
}