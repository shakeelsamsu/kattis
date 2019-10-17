import java.util.*;
import java.util.regex.*;
import java.io.*;
import java.net.URL;

public class Parser {
    
    final Pattern title = Pattern.compile("<title>.*</title>");
    final Pattern link = Pattern.compile("<link>.*</link>");
    final Pattern pubDate = Pattern.compile("<pubDate>.*</pubDate>");
    BufferedReader rss;
    PrintWriter out;

    public Parser(BufferedReader rss) {
        this.rss = rss;
    }

    public ArrayList<Problem> parse() throws Exception {
        ArrayList<Problem> problems = new ArrayList<Problem>();
        String line = "";
        while((line = rss.readLine()) != null) {
            Matcher mTitle = title.matcher(line);
            String title = null;
            while(mTitle.find()) {
                title = mTitle.group();
                title = title.substring(title.indexOf(">") + 1, title.indexOf("</"));
                if(title.equals("Recent Problems - Kattis")) continue;
                Matcher mLink = link.matcher(rss.readLine()); 
                String temp = null;
                if(mLink.find()) temp = mLink.group();
                URL url = null;
                if(temp != null) url = new URL(temp.substring(temp.indexOf(">") + 1, temp.indexOf("</")));
                rss.readLine(); //skip the <guid> in the RSS
                Matcher mDate = pubDate.matcher(rss.readLine());
                String date = null;
                if(mDate.find()) date = mDate.group();
                if(date != null) date = date.substring(date.indexOf(">") + 1, date.indexOf("</"));
                problems.add(new Problem(title, url, date));
            }
        }
        return problems;
    }
}