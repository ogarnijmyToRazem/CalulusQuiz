package com.example.android.calulusquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsForRightAnswer = 10;
    int points = 0;

    String answer2Right = "102.02";
    String answer5Right = "2";

    int answer1 = 0;
    String answer2 = "";
    boolean answer31 = false;
    boolean answer32 = false;
    boolean answer33 = false;
    boolean answer34 = false;
    boolean answer41 = false;
    boolean answer42 = false;
    boolean answer43 = false;
    boolean answer44 = false;
    String answer5 = "";
    boolean answer61 = false;
    boolean answer62 = false;
    boolean answer63 = false;
    boolean answer64 = false;
    boolean answer71 = false;
    boolean answer72 = false;
    boolean answer73 = false;
    boolean answer74 = false;
    int answer8 = 0;
    boolean answer91 = false;
    boolean answer92 = false;
    boolean answer93 = false;
    boolean answer94 = false;
    boolean answer101 = false;
    boolean answer102 = false;
    boolean answer103 = false;
    boolean answer104 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View v) {
        getAnswers();
        checkAnswers();
        setPointText();
        points = 0;
        unCheck();
//        LinearLayout layout=findViewById(R.id.layout1);
//        layout.setDescendantFocusability(ViewGroup.FOCUS_BEFORE_DESCENDANTS);
//        layout.setFocusableInTouchMode(true);
    }

    public void getAnswers() {
        answer1 = getAnswerRadioButton(R.id.answer11, R.id.answer12, R.id.answer13, R.id.answer14);

        answer2 = getAnswerEditText(R.id.answer21);

        answer31 = getAnswerCheckBox(R.id.answer31);
        answer32 = getAnswerCheckBox(R.id.answer32);
        answer33 = getAnswerCheckBox(R.id.answer33);
        answer34 = getAnswerCheckBox(R.id.answer34);

        answer41 = getAnswerCheckBox(R.id.answer41);
        answer42 = getAnswerCheckBox(R.id.answer42);
        answer43 = getAnswerCheckBox(R.id.answer43);
        answer44 = getAnswerCheckBox(R.id.answer44);

        answer5 = getAnswerEditText(R.id.answer51);

        answer61 = getAnswerCheckBox(R.id.answer61);
        answer62 = getAnswerCheckBox(R.id.answer62);
        answer63 = getAnswerCheckBox(R.id.answer63);
        answer64 = getAnswerCheckBox(R.id.answer64);

        answer71 = getAnswerCheckBox(R.id.answer71);
        answer72 = getAnswerCheckBox(R.id.answer72);
        answer73 = getAnswerCheckBox(R.id.answer73);
        answer74 = getAnswerCheckBox(R.id.answer74);

        answer8 = getAnswerRadioButton(R.id.answer81, R.id.answer82, R.id.answer83, R.id.answer84);

        answer91 = getAnswerCheckBox(R.id.answer91);
        answer92 = getAnswerCheckBox(R.id.answer92);
        answer93 = getAnswerCheckBox(R.id.answer93);
        answer94 = getAnswerCheckBox(R.id.answer94);

        answer101 = getAnswerCheckBox(R.id.answer101);
        answer102 = getAnswerCheckBox(R.id.answer102);
        answer103 = getAnswerCheckBox(R.id.answer103);
        answer104 = getAnswerCheckBox(R.id.answer104);
    }

    public void checkAnswers() {
        if (answer1 == R.id.answer13) {
            points += pointsForRightAnswer;
        }
        if (answer2.equals(answer2Right)) {
            points += pointsForRightAnswer;
        }
        if (answer31 && !answer32 && answer33 && !answer34) {
            points += pointsForRightAnswer;
        }
        if (!answer41 && answer42 && !answer43 && answer44) {
            points += pointsForRightAnswer;
        }
        if (answer5.equals(answer5Right)) {
            points += pointsForRightAnswer;
        }
        if (!answer61 && !answer62 && answer63 && answer64) {
            points += pointsForRightAnswer;
        }
        if (!answer71 && answer72 && answer73 && !answer74) {
            points += pointsForRightAnswer;
        }
        if (answer8 == R.id.answer84) {
            points += pointsForRightAnswer;
        }
        if (answer91 && !answer92 && answer93 && answer94) {
            points += pointsForRightAnswer;
        }
        if (!answer101 && !answer102 && answer103 && answer104) {
            points += pointsForRightAnswer;
        }
    }

    public void unCheck() {
        unCheckRadioGroup(R.id.answer1);

        unCheckEditText(R.id.answer21);

        unCheckCheckBox(R.id.answer31);
        unCheckCheckBox(R.id.answer32);
        unCheckCheckBox(R.id.answer33);
        unCheckCheckBox(R.id.answer34);

        unCheckCheckBox(R.id.answer41);
        unCheckCheckBox(R.id.answer42);
        unCheckCheckBox(R.id.answer43);
        unCheckCheckBox(R.id.answer44);

        unCheckEditText(R.id.answer51);

        unCheckCheckBox(R.id.answer61);
        unCheckCheckBox(R.id.answer62);
        unCheckCheckBox(R.id.answer63);
        unCheckCheckBox(R.id.answer64);

        unCheckCheckBox(R.id.answer71);
        unCheckCheckBox(R.id.answer72);
        unCheckCheckBox(R.id.answer73);
        unCheckCheckBox(R.id.answer74);

        unCheckRadioGroup(R.id.answer8);

        unCheckCheckBox(R.id.answer91);
        unCheckCheckBox(R.id.answer92);
        unCheckCheckBox(R.id.answer93);
        unCheckCheckBox(R.id.answer94);

        unCheckCheckBox(R.id.answer101);
        unCheckCheckBox(R.id.answer102);
        unCheckCheckBox(R.id.answer103);
        unCheckCheckBox(R.id.answer104);
    }

    public void setPointText() {
        TextView pointTextView = findViewById(R.id.points);
        String pointText = getString(R.string.point_text, points);
        pointTextView.setText(pointText);
        pointTextView.setVisibility(View.VISIBLE);
    }

    public void unCheckCheckBox(int id) {
        CheckBox answer = findViewById(id);
        if (answer.isChecked()) {
            answer.setChecked(false);
        }
    }

    public void unCheckRadioGroup(int id) {
        RadioGroup answer = findViewById(id);
        answer.clearCheck();
    }

    public void unCheckEditText(int id){
        EditText answer=findViewById(id);
        answer.setText("");
    }

    public int getAnswerRadioButton(int id1, int id2, int id3, int id4) {
        RadioButton option1 = findViewById(id1);
        RadioButton option2 = findViewById(id2);
        RadioButton option3 = findViewById(id3);
        RadioButton option4 = findViewById(id4);
        if (option1.isChecked()) {
            return option1.getId();
        } else if (option2.isChecked()) {
            return option2.getId();
        } else if (option3.isChecked()) {
            return option3.getId();
        } else if (option4.isChecked()) {
            return option4.getId();
        } else return 0;
    }

    public String getAnswerEditText(int id) {
        EditText question = findViewById(id);
        return question.getText().toString();
    }

    public boolean getAnswerCheckBox(int id) {
        CheckBox option = findViewById(id);
        return option.isChecked();
    }
}
