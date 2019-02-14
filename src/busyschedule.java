import java.io.*;
import java.util.*;

public class busyschedule {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true) {
            int n = Integer.parseInt(in.readLine());
            if(n == 0) break;
            ArrayList<time> times = new ArrayList<time>();
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                String time = st.nextToken();
                String am = st.nextToken();
                time t = new time(time, am);
                times.add(t);
            }
            Collections.sort(times);
            for(time t : times) {
                out.println(t);
            }
            out.println();
        }
        out.close();
    }

    static class time implements Comparable<time> {
        public int hour;
        private int actualHour;
        public int min;
        public boolean am;

        public time(String time, String am) {
            this.am = am.equals("a.m.");
            this.hour = Integer.parseInt(time.substring(0, time.indexOf(":")));
            this.actualHour = this.hour;
            this.min = Integer.parseInt(time.substring(time.indexOf(":") + 1));
            if((!this.am && this.hour != 12) || (this.hour == 12 && this.am)) hour += 12;
            hour %= 24;
        }

        public int compareTo(time t) {
            return (hour - t.hour) * 100 + (min - t.min); 
        }

        public String toString() {
            return actualHour + ":" + String.format("%02d", min) + (am ? " a.m." : " p.m.");
        }
    }
}