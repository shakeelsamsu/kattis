import java.io.*;
import java.util.*;

public class alldifferentdirections {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        while((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            if(n == 0) break;
            ArrayList<Position> positions = new ArrayList<Position>();
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                double x = Double.parseDouble(st.nextToken());
                double y = Double.parseDouble(st.nextToken());
                double heading = 0;
                while(st.hasMoreTokens()) {
                    String query = st.nextToken();
                    if(query.equals("start"))
                        heading = Double.parseDouble(st.nextToken());
                    else if(query.equals("walk")) {
                        double dist = Double.parseDouble(st.nextToken());
                        x += Math.cos(Math.toRadians(heading)) * dist;
                        y += Math.sin(Math.toRadians(heading)) * dist;
                    }
                    else if(query.equals("turn")) {
                        double tempHeading = Double.parseDouble(st.nextToken());
                        if(heading + tempHeading >= 360) {
                            heading = heading - 360 + tempHeading;
                        }
                        else heading += tempHeading;
                    }
                    // out.println(i + " " + heading);
                }
                positions.add(new Position(x, y));
            }
            // for(Position p : positions) 
            //     out.println(p.x + " " + p.y);
            Position avg = getAverage(positions);
            out.println(String.format("%.6f", avg.x) + " " + String.format("%.6f", avg.y) + " " + String.format("%.6f", maxDistance(positions, avg)));
        }
        out.close();
    }

    static class Position {
        double x; 
        double y;

        public Position(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static Position getAverage(ArrayList<Position> list) {
        double totalX = 0;
        double totalY = 0;
        for(Position p : list) {
            totalX += p.x;
            totalY += p.y;
        }
        return new Position(totalX / list.size(), totalY / list.size());
    }

    public static double maxDistance(ArrayList<Position> list, Position avg) {
        double max = 0;
        for(Position p : list) {
            double dist = Math.sqrt(Math.pow(avg.x - p.x, 2) + Math.pow(avg.y - p.y, 2));
            if(dist > max) max = dist;
        }
        return max;
    }
}