package com.dsa.dsa.ds.tries;

public interface Vocabulary {
    boolean add(String word);
    boolean isPrefix(String prefix);
    boolean contains(String word);
}
