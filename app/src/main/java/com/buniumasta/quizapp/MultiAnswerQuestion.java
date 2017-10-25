package com.buniumasta.quizapp;

import android.util.Log;

import java.util.Random;

/**
 * Created by barto on 24.10.2017.
 */

public class MultiAnswerQuestion extends Question {

    public MultiAnswerQuestion(QuestionType type, KnowledgeBase base) {
        super(type, base);
        generateQuestion(base);
    }

    @Override
    protected void generateQuestion(KnowledgeBase base) {
        Random generator = new Random();
        int indeks = generator.nextInt(3) + 1;

        switch (indeks) {
            case 1:

                article.setmHint3(getDifferentThanMe(base).getmHint3());
                setAnswerKey(true, true, false);
                break;

            case 2:

                article.setmHint1(getDifferentThanMe(base).getmHint1());
                setAnswerKey(false, true, true);

                break;

            case 3:

                article.setmHint2(getDifferentThanMe(base).getmHint2());
                setAnswerKey(true, false, true);
                break;

            case 4:

                setAnswerKey(true, true, true);
                break;

            default:

                Log.e("MultiQ.generateQ", "Invalid random number");
                break;

        }
        article.setmAnswer("Czy " + article.getmAnswer() + "...");
        article.setmHint1(article.getmHint1() + "?");
        article.setmHint2(article.getmHint2() + "?");
        article.setmHint3(article.getmHint3() + "?");

    }
}



