package com.buniumasta.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.buniumasta.quizapp.R.id.button1_group1;
import static com.buniumasta.quizapp.R.id.button1_group2;
import static com.buniumasta.quizapp.R.id.button2_group1;
import static com.buniumasta.quizapp.R.id.button2_group2;
import static com.buniumasta.quizapp.R.id.button3_group1;
import static com.buniumasta.quizapp.R.id.button3_group2;
import static com.buniumasta.quizapp.R.id.check_box1_group1;
import static com.buniumasta.quizapp.R.id.check_box1_group2;
import static com.buniumasta.quizapp.R.id.check_box2_group1;
import static com.buniumasta.quizapp.R.id.check_box2_group2;
import static com.buniumasta.quizapp.R.id.check_box3_group1;
import static com.buniumasta.quizapp.R.id.check_box3_group2;
import static com.buniumasta.quizapp.R.id.check_question_1;
import static com.buniumasta.quizapp.R.id.check_question_2;
import static com.buniumasta.quizapp.R.id.radio_question_1;
import static com.buniumasta.quizapp.R.id.radio_question_2;

public class MainActivity extends AppCompatActivity {
    KnowledgeBase base;
    Quiz quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        base = new KnowledgeBase();
        quiz = new Quiz(base);
        generateQuestions(findViewById(android.R.id.content));


    }

    public void generateQuestions(View view) {
        Question question;
        question = quiz.getQuestion(0);

        TextView text_view;
        //text_view.setText(question.getmAnswer());

        ImageView image_view = (ImageView) findViewById(radio_question_1);
        image_view.setImageResource(R.drawable.owl);

        RadioButton button_group = (RadioButton) findViewById(button1_group1);
        button_group.setText(question.getmHint1());
        button_group = (RadioButton) findViewById(button2_group1);
        button_group.setText(question.getmHint2());
        button_group = (RadioButton) findViewById(button3_group1);
        button_group.setText(question.getmHint3());

        question = quiz.getQuestion(1);
        image_view = (ImageView) findViewById(check_question_1);
        image_view.setImageResource(R.drawable.ant);

        CheckBox check_box = (CheckBox) findViewById(check_box1_group1);
        check_box.setText(question.getmHint1());
        check_box = (CheckBox) findViewById(check_box2_group1);
        check_box.setText(question.getmHint2());
        check_box = (CheckBox) findViewById(check_box3_group1);
        check_box.setText(question.getmHint3());

        question = quiz.getQuestion(2);
        text_view = (TextView) findViewById(radio_question_2);
        text_view.setText(question.getmAnswer());

        button_group = (RadioButton) findViewById(button1_group2);
        button_group.setText(question.getmHint1());
        button_group = (RadioButton) findViewById(button2_group2);
        button_group.setText(question.getmHint2());
        button_group = (RadioButton) findViewById(button3_group2);
        button_group.setText(question.getmHint3());

        question = quiz.getQuestion(3);
        text_view = (TextView) findViewById(check_question_2);
        text_view.setText(question.getmAnswer());
        check_box = (CheckBox) findViewById(check_box1_group2);
        check_box.setText(question.getmHint1());
        check_box = (CheckBox) findViewById(check_box2_group2);
        check_box.setText(question.getmHint2());
        check_box = (CheckBox) findViewById(check_box3_group2);
        check_box.setText(question.getmHint3());

    }

    public void checkQuiz(View view) {
        boolean[][] results = new boolean[4][3];
        RadioButton button;
        CheckBox box;

        button = (RadioButton) findViewById(button1_group1);
        results[0][0] = button.isChecked();
        button = (RadioButton) findViewById(button2_group1);
        results[0][1] = button.isChecked();
        button = (RadioButton) findViewById(button3_group1);
        results[0][2] = button.isChecked();

        box = (CheckBox) findViewById(check_box1_group1);
        results[1][0] = box.isChecked();
        box = (CheckBox) findViewById(check_box2_group1);
        results[1][1] = box.isChecked();
        box = (CheckBox) findViewById(check_box3_group1);
        results[1][2] = box.isChecked();

        button = (RadioButton) findViewById(button1_group2);
        results[2][0] = button.isChecked();
        button = (RadioButton) findViewById(button2_group2);
        results[2][1] = button.isChecked();
        button = (RadioButton) findViewById(button3_group2);
        results[2][2] = button.isChecked();

        box = (CheckBox) findViewById(check_box1_group2);
        results[3][0] = box.isChecked();
        box = (CheckBox) findViewById(check_box2_group2);
        results[3][1] = box.isChecked();
        box = (CheckBox) findViewById(check_box3_group2);
        results[3][2] = box.isChecked();

        quiz.checkResults(results);
        int total = quiz.getQuizSize();
        int result = quiz.getResults();
        String wynik;
        wynik = "Twoj wynik to " + result + "/" + total;
        Toast.makeText(this, wynik, Toast.LENGTH_LONG).show();
    }

    public void generateQuiz(View view) {
        quiz.regenerateQuiz(base);
        generateQuestions(view);
        clearButtons(view);
    }

    public void clearButtons(View view) {
        boolean[][] results = new boolean[4][3];
        RadioButton button;
        CheckBox box;

        button = (RadioButton) findViewById(button1_group1);
        button.setChecked(false);
        button = (RadioButton) findViewById(button2_group1);
        button.setChecked(false);
        button = (RadioButton) findViewById(button3_group1);
        button.setChecked(false);

        box = (CheckBox) findViewById(check_box1_group1);
        box.setChecked(false);
        box = (CheckBox) findViewById(check_box2_group1);
        box.setChecked(false);
        box = (CheckBox) findViewById(check_box3_group1);
        box.setChecked(false);

        button = (RadioButton) findViewById(button1_group2);
        button.setChecked(false);
        button = (RadioButton) findViewById(button2_group2);
        button.setChecked(false);
        button = (RadioButton) findViewById(button3_group2);
        button.setChecked(false);

        box = (CheckBox) findViewById(check_box1_group2);
        box.setChecked(false);
        box = (CheckBox) findViewById(check_box2_group2);
        box.setChecked(false);
        box = (CheckBox) findViewById(check_box3_group2);
        box.setChecked(false);

        Toast.makeText(this, "Odswieżam", Toast.LENGTH_SHORT).show();
    }

}


