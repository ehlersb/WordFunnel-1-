import java.util.ArrayList;

/**
 * Created by Benjamin Ehlers on 12/29/2018.
 */
public class WordFunnel {
    private String word;
    private String funnelWord;

    public WordFunnel(String word, String funnelWord) {
        this.word = word;
        this.funnelWord = funnelWord;
    }

    public boolean funnel(){
        ArrayList<String> wordArrayList;
        wordArrayList = stringToArrayList(word);

        ArrayList<String> wordSubstrings;
        wordSubstrings = oneLessCharacterSubstrings(wordArrayList);
        for (int i = 0; i < wordSubstrings.size(); i++) {
            if(funnelWord.equals(wordSubstrings.get(i))) return true;
        }
        return false;
    }

    private ArrayList<String> stringToArrayList(String word) {
        ArrayList<String> wordArrayList = new ArrayList<>();
        for(int i = 0; i < word.length(); i++) {
            wordArrayList.add(word.substring(i, i + 1));
        }
        return wordArrayList;
    }

    private ArrayList<String> oneLessCharacterSubstrings(ArrayList<String> wordArrayList) {
        ArrayList<String> wordSubstrings = new ArrayList<>();
        for(int i = 0; i < wordArrayList.size(); i++) {
            String wordToAdd = "";
            for(int j = 0; j < wordArrayList.size(); j++) {
                if(i != j) // excludes one character at index i
                wordToAdd += wordArrayList.get(j);
            }
            wordSubstrings.add(wordToAdd);
        }
        return wordSubstrings;
    }
}
