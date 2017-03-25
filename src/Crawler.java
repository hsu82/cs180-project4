import java.util.List;

/**
 * Created by Paulina on 3/23/2017.
 */
public class Crawler extends Object {

    private static int currentID;
    private static String domain;
    private static int limit;
    private static List<Page> parsed;
    private static Parser parser;
    private MyQueue toParse;
    private static int totalURLs;
    private static List<String> visited;
    private static List<Word> words;

    public Crawler(String seed, String domain, int limit){ //crawler.words and crawler.parsed should be stored

        totalURLs++;
        this.domain = domain;
        this.limit = limit;
        // Word cs = new Word(domain+seed, currentID);
        // words.add(cs);
        //Page ps = new Page(domain+seed,currentID);
        //parsed.add(ps);
    }
}