package com.buniumasta.quizapp;

/**
 * Created by barto on 22.10.2017.
 */

public class QuestionFactory {
    public static Question buildQuestion(QuestionType type, KnowledgeBase base) {
        Question question = null;
        switch (type) {
            case SINGLE_ANSWER:
                question = new SingleAnswerQuestion(type, base);
                break;

            case MULTI_ANSWER:
                question = new MultiAnswerQuestion(type, base);
                break;

            default:
                // throw some exception
                break;
        }
        return question;
    }
}

