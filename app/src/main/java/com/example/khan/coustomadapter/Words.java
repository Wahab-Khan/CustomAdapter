package com.example.khan.coustomadapter;

/**
 * Created by KHAN on 8/27/2017.
 */

public class Words {
    private String pashtoWord;
    private String englishWord;

    public Words(String pashtoWord, String englishWord) {
        this.pashtoWord = pashtoWord;
        this.englishWord = englishWord;
    }

    public String getPashtoWord() {
        return pashtoWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setPashtoWord(String pashtoWord) {
        this.pashtoWord = pashtoWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }
}
