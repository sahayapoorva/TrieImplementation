public class Main {
    public static void main(String... args) {
        Trie t = new Trie();

        t.insert("Apoorva");
        t.insert("Ajay");
        t.insert("Sahay");
        t.insert("Ankit Sahay");

        System.out.println(t.find("Ankit"));
        System.out.println(t.find("Ankit Saha"));
        System.out.println(t.find("Ankit Sahay"));
    }
}
