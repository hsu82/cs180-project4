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
        if (url == null){
            throw new ParseException("getDocument() failed. String url is null.");
        }
        if(url.equals("")){
            throw new ParseException("getDocument() failed. String url is empty.");
        }
        try {
            Document d = Jsoup.connect(url).get();
            if(d == null){
                throw new ParseException("getDocument() failed: Document is null.");
            }
            return d;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Elements getLinks(Document doc)
            throws ParseException {
        if(doc == null){
            throw new ParseException("getLinks() failed. Document parameter is null.");
        }
        Elements links = doc.select("a[href]");
        return links;
    }

    public String getBody(Document doc)
            throws ParseException {
        if (doc == null){
            throw new ParseException("getBody() failed. Document parameter is null.");
        }
        return doc.body().text();
    }
}
