import java.io.*;
import java.util.*;
import java.net.*;

public class Problem {
    private String title;
    private URL url;
    private String pubDate;

    public Problem(String title, URL url, String pubDate) {
        this.title = title;
        this.url = url;
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public URL getURL() {
        return url;
    }

    public String getDate() {
        return pubDate;
    }

    public String toString() {
        return title + " " + url + " " + pubDate;
    }

}