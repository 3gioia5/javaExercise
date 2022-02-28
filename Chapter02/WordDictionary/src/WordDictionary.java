import java.util.HashMap;

public class WordDictionary {
    private HashMap<String, String> words = new HashMap<>();

    public void addWord(String english, String korean) {
        words.put(english, new String(korean));
    }

    public String find(String english) {
        String response = null;
        for (String key : words.keySet()) {
            if (english.toUpperCase().equals(key.toUpperCase())) {
                response = words.get(key);
            }
        }
        return response;
    }
}
