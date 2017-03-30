import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jay on 2017/3/21.
 */
public class Word implements Serializable {
    private String word;
    private List<Integer> postings = new ArrayList<>();
    static long serialVersionUID;
    public Word(String word, int urlID){
        this.word = word;
        this.postings.add(urlID);
        this.serialVersionUID = -3696191086353573895L;
    }
    public void addURLID(int urlID){
        postings.add(urlID);
    }
    public String getWord(){
        return word;
    }
    public List<Integer> getList(){
            return postings;
    }

    @Override
    public boolean equals(Object obj) {
        return word.equals(((Word) obj).word);
    }

}