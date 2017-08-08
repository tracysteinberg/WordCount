package com.example.tracysteinberg.wordcounter;

import static android.R.id.input;

/**
 * Created by tracysteinberg on 08/08/2017.
 */

public class CountingWord {

    String words;

    public CountingWord(String inputWords){
        this.words = inputWords;
    }

    public String getWords() {
        return words;
    }

    public int wordCounter() {
        String[] words = this.words.trim().split("\\s+");
        return words.length;
    }


//    int wordCount = 0;
//    boolean isBlank = false;
//    input = input.trim();
//
//
//    for (int z=); z <input.length();
//                     z++) {
//
//
//
//
//    }


}
