package com.example.android.miwok;

/**
 * Created by driftineo on 2/5/17.
 */

class Word {
    private String wordONe;
    private String wordTwo;
    private int imageResource;
    private int soundResource;

    public Word (String wordONe){
        this.wordONe = wordONe;
    }

    public Word(String wordONe, String wordTwo) {
        this.wordONe = wordONe;
        this.wordTwo = wordTwo;
    }

    public Word(String wordONe, String wordTwo, int imageResource) {
        this.wordONe = wordONe;
        this.wordTwo = wordTwo;
        this.imageResource = imageResource;
    }

    public Word(String wordONe, String wordTwo, int imageResource, int soundResource) {
        this.wordONe = wordONe;
        this.wordTwo = wordTwo;
        this.imageResource = imageResource;
        this.soundResource = soundResource;
    }

    public String getWordONe() {
        return wordONe;
    }

    public void setWordONe(String wordONe) {
        this.wordONe = wordONe;
    }

    public String getWordTwo() {
        return wordTwo;
    }

    public void setWordTwo(String wordTwo) {
        this.wordTwo = wordTwo;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public int getSoundResource() {
        return soundResource;
    }

    public void setSoundResource(int soundResource) {
        this.soundResource = soundResource;
    }
}
