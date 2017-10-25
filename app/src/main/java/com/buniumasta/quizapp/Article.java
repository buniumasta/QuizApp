package com.buniumasta.quizapp;

/**
 * Created by barto on 21.10.2017.
 */

public class Article {
    private String mAnswer;
    private String mHint1;
    private String mHint2;
    private String mHint3;

    public Article(String answer, String hint1, String hint2, String hint3) {
        this.mAnswer = answer;
        this.mHint1 = hint1;
        this.mHint2 = hint2;
        this.mHint3 = hint3;
    }

    public String getmAnswer() {
        return mAnswer;
    }

    public void setmAnswer(String name) {
        mAnswer = name;
    }

    public String getmHint1() {
        return mHint1;
    }

    public void setmHint1(String name) {
        mHint1 = name;
    }

    public String getmHint2() {
        return mHint2;
    }

    public void setmHint2(String name) {
        mHint2 = name;
    }

    public String getmHint3() {
        return mHint3;
    }

    public void setmHint3(String name) {
        mHint3 = name;
    }
}
