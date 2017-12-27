package com.buniumasta.quizapp;

import android.util.Log;

/**
 * Created by barto on 21.10.2017.
 */

public abstract class Question {
    protected Article article;
    protected boolean[] answersKey;
    private QuestionType type = null;

    public Question(QuestionType type, KnowledgeBase base) {
        this.type = type;
        Article articleTemporary = base.getRandomArticle();

        article = new Article(articleTemporary.getmAnswer(), articleTemporary.getmHint1(), articleTemporary.getmHint2(), articleTemporary.getmHint3(), articleTemporary.getmPictureResourceId());
        answersKey = new boolean[3];
        answersKey[0] = true;
        answersKey[1] = true;
        answersKey[2] = true;
    }

    protected abstract void generateQuestion(KnowledgeBase base);

    public QuestionType returnType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

    public String getmAnswer() {
        return article.getmAnswer();
    }

    public String getmHint1() {
        return article.getmHint1();
    }

    public String getmHint2() {
        return article.getmHint2();
    }

    public String getmHint3() {
        return article.getmHint3();
    }

    public int getPictureResourceId() {return article.getmPictureResourceId();}

    public void setAnswerKey(boolean first, boolean second, boolean third) {
        answersKey[0] = first;
        answersKey[1] = second;
        answersKey[2] = third;
    }

    public boolean checkAsnwers(boolean answersToBeChecked[]) {
        if (answersKey.length == answersToBeChecked.length) {
            for (int i = 0; i < answersKey.length; i++) {
                if (answersKey[i] != answersToBeChecked[i]) return false;
            }
        } else Log.e("Question:CheckAnswers", "Wrong Table Sizes");

        return true;
    }

    public boolean[] getAnswersKey() {
        return answersKey;
    }

    public void setAnswersKey(boolean answersToBeSet[]) {
        if (answersKey.length == answersToBeSet.length) {
            for (int i = 0; i < answersKey.length; i++) {
                answersKey[i] = answersToBeSet[i];
            }
        }
    }

    public Article getDifferentThanMe(KnowledgeBase base) {
        Article hintArticle;
        String answerString;
        String myString = article.getmAnswer();
        boolean condition = true;
        do {
            hintArticle = base.getRandomArticle();
            answerString = hintArticle.getmAnswer();
            condition = answerString.equals(myString);
        } while (condition);
        return hintArticle;
    }
}
