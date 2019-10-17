import java.io.*;
import java.net.*;
import java.util.*;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Parser {

    // Tag Name Constants
    private static final String TITLE = "title";
    private static final String LINK = "link";
    private static final String PUB_DATE = "pubDate";
    private static final String ITEM = "item";

    private Document doc;

    public Parser(InputStream in) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        doc = builder.parse(in);
    }

    public ArrayList<Problem> parse() throws Exception {
        ArrayList<Problem> ret = new ArrayList<Problem>();
        NodeList list = doc.getElementsByTagName(ITEM);
        for (int i = 0; i < list.getLength(); i++) {
            Node itemNode = list.item(i);
            if (itemNode != null && itemNode.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) itemNode;
                String title = getElementText(element, TITLE);
                String pubDate = getElementText(element, PUB_DATE);
                String link = getElementText(element, LINK);
                URL url = new URL(link);
                ret.add(new Problem(title, url, pubDate));
            }
        }
        return ret;
    }

    private String getElementText(Element element, String tagName) {
        return element.getElementsByTagName(tagName).item(0).getTextContent();
    }
}