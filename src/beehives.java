import java.io.*;
import java.util.*;

public class beehives {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            double d = Double.parseDouble(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if(d == 0 && n == 0) break;
            ArrayList<Position> positions = new ArrayList<Position>();
            int sour = 0;
            int sweet = 0;
            for(int i = 0; i < n; i++) {
                st = new StringTokenizer(in.readLine());
                Position p = new Position(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
                positions.add(p);
            }
            for(int i = 0; i < positions.size(); i++) {
                for(int j = i + 1; j < positions.size(); j++) {
                    if(calcDistance(positions.get(i), positions.get(j)) < d) {
                        if(positions.get(i).visited && positions.get(j).visited)
                            continue;
                        else if(positions.get(i).visited || positions.get(j).visited)
                            sour++;
                        else
                            sour += 2;
                        positions.get(i).visited = true;
                        positions.get(j).visited = true;
                    }
                }
            }
            sweet = n - sour;
            out.println(sour + " sour, " + sweet + " sweet");
        }
        out.close();
    }    
    
    private static double calcDistance(Position a, Position b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
}

class Position implements Comparable<Position> {
    double x;
    double y;
    boolean sweet;
    boolean visited;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
        sweet = false;
        visited = false;
    }

    public int compareTo(Position p) {
        return (int) (p.x - x + p.y - y);
    }
}