import java.io.*;
import java.util.*;
import java.net.*;

public class Main {
    static final String USER_AGENT = ""; //replace with your own user-agent String
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://open.kattis.com/rss/new-problems");

        URLConnection connection = url.openConnection();
        connection.addRequestProperty("User-Agent", USER_AGENT);
        InputStream input = connection.getInputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(input));

        Parser parser = new Parser(in);
        ArrayList<Problem> problems = new ArrayList<Problem>();
        problems = parser.parse();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Problems.md")));
        Tabler.write(out, problems);
        out.close();
    }
}