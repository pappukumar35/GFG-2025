package April;
public class mege{
     private class TrieNode {
          TrieNode[] children;
          boolean isEndOfWord;
  
          TrieNode() {
              children = new TrieNode[26];  // For lowercase a-z
              isEndOfWord = false;
          }
      }
  
      private TrieNode root;
  
      public Trie() {
          root = new TrieNode();
      }
  
      // Insert a word into the Trie
      public void insert(String word) {
          TrieNode node = root;
          for (char c : word.toCharArray()) {
              int idx = c - 'a';
              if (node.children[idx] == null) {
                  node.children[idx] = new TrieNode();
              }
              node = node.children[idx];
          }
          node.isEndOfWord = true;
      }
  
      // Search for a word in the Trie
      public boolean search(String word) {
          TrieNode node = root;
          for (char c : word.toCharArray()) {
              int idx = c - 'a';
              if (node.children[idx] == null) {
                  return false;
              }
              node = node.children[idx];
          }
          return node.isEndOfWord;
      }
  
      // Check if a prefix exists in the Trie
      public boolean isPrefix(String prefix) {
          TrieNode node = root;
          for (char c : prefix.toCharArray()) {
              int idx = c - 'a';
              if (node.children[idx] == null) {
                  return false;
              }
              node = node.children[idx];
          }
          return true;
      }
     public static void main(String[] args) {
          
     }
}