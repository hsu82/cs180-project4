import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by jay on 2017/3/23.
 */
public class Parser {
    public Parser() {
    }

    public Document getDocument(String url)
            throws ParseException {
        try {
            Document d = Jsoup.connect(url).get();
            return d;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Elements getLinks(Document doc)
            throws ParseException {
        Elements links = doc.select("a[href]");
        return links;
    }

    public String getBody(Document doc)
            throws ParseException {
        return doc.body().text();
    }
}
