import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public Map<Character, TrieNode> children;
    public boolean isWord;

    TrieNode() {
        this.children = new HashMap<>();
        this.isWord = false;
    }
}
