package com.dsa.dsa.ds.tries;

public class Trie {

    /*
    Trie is a type of k-ary search tree used for storing and searching a specific key from a set.
    Using Trie, search complexities can be brought to optimal limit (key length).
    Trie - also known as digital tree or prefix tree

     */

    private TrieNode root;

    public void insert(String word) {
        TrieNode current = root;

        for (char l: word.toCharArray()) {
            current = current.getChildren().computeIfAbsent(l, c -> new TrieNode());
        }
       // current.setEndOfWord(true);
    }
}
