package com.buniumasta.quizapp;

import java.util.ArrayList;

/**
 * Created by barto on 22.10.2017.
 */

public class Quiz {
    int size;
    private ArrayList<Question> questionList;
    private int[] resultPoints;

    public Quiz(KnowledgeBase base) {
        questionList = new ArrayList<Question>();
        size = 4;
        resultPoints = new int[size];
        for (int i = 0; i < size; i++) {
            resultPoints[i] = -1;
        }

        questionList.add(QuestionFactory.buildQuestion(QuestionType.SINGLE_ANSWER, base));
        questionList.add(QuestionFactory.buildQuestion(QuestionType.MULTI_ANSWER, base));
        questionList.add(QuestionFactory.buildQuestion(QuestionType.SINGLE_ANSWER, base));
        questionList.add(QuestionFactory.buildQuestion(QuestionType.MULTI_ANSWER, base));

    }

    public Question getQuestion(int number) {
        return questionList.get(number);
    }

    public int getQuizSize() {
        return size;
    }

    public void checkResults(boolean[][] resultsTable) {
        Question question;

        for (int i = 0; i < size; i++) {
            question = questionList.get(i);
            if (question.checkAsnwers(resultsTable[i])) {
                resultPoints[i] = 1;
            } else resultPoints[i] = 0;
        }
    }

    public int getResults() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += resultPoints[i];
        }
        return sum;
    }

    public void regenerateQuiz(KnowledgeBase base) {
        questionList.clear();
        questionList.add(QuestionFactory.buildQuestion(QuestionType.SINGLE_ANSWER, base));
        questionList.add(QuestionFactory.buildQuestion(QuestionType.MULTI_ANSWER, base));
        questionList.add(QuestionFactory.buildQuestion(QuestionType.SINGLE_ANSWER, base));
        questionList.add(QuestionFactory.buildQuestion(QuestionType.MULTI_ANSWER, base));

    }
}
