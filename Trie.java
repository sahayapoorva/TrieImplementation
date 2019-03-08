public class Trie {
    private TrieNode root;

    public void insert(String word) {
        if(!word.isBlank() && root == null) {
            root = new TrieNode();
        }

        TrieNode current = root;

        for(char c : word.toCharArray()) {
            current = current.children.computeIfAbsent(c, x -> new TrieNode());
        }

        current.isWord = true;
    }


    public boolean find(String word) {
        boolean isPresent = false;

        if(root != null) {
            TrieNode current = root;
            for(int i = 0; i < word.length(); i++) {
                if(current.children.containsKey(word.charAt(i))) {
                    current = current.children.get(word.charAt(i));
                    if((i == word.length() - 1) && current.isWord) {
                        isPresent = true;
                    }
                } else {
                    break;
                }
            }
        }

        return isPresent;
    }
}
