import java.io.*;
import java.text.*;
import java.util.*;

public class Tabler {
    public static void write(PrintWriter out, ArrayList<Problem> problems) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();
        out.println("# [Recent Kattis Problems](https://open.kattis.com/rss/new-problems)");
        out.println("Parsed on " + df.format(date));
        out.println("| " + problems.size() + " Problems | Published |");
        out.println("| - | - |");
        for(Problem problem : problems) {
            out.println("| [" + problem.getTitle() + "](" + problem.getURL() + ") | "
                        + problem.getDate() + " |");
        }
        out.close();
    }
}