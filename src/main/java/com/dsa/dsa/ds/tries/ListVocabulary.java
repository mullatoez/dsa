package com.dsa.dsa.ds.tries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListVocabulary implements Vocabulary{

    public List<String> words = new ArrayList<>();

    public ListVocabulary(List<String> words) {
        this.words = words;
        Collections.sort(this.words);
    }

    @Override
    public boolean add(String word) {
        return false;
    }

    @Override
    public boolean isPrefix(String prefix) {
        return false;
    }

    @Override
    public boolean contains(String word) {
        return false;
    }
}
