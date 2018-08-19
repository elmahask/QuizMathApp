package com.example.elmahask.quizmathapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //question1's Answers
    final private int answer1 = R.id.Button1_2;
    //question2's Answers
    final private int answer2 = R.id.Button2_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private boolean question1() {
        RadioGroup result = findViewById(R.id.RadioGroup1);
        return result.getCheckedRadioButtonId() == answer1;
    }

    private boolean question2() {
        RadioGroup result = findViewById(R.id.RadioGroup2);
        return result.getCheckedRadioButtonId() == answer2;
    }

    //question3's Answers
    private boolean question3() {
        CheckBox result1 = findViewById(R.id.checkbox_3_1);
        CheckBox result2 = findViewById(R.id.checkbox_3_2);
        CheckBox result3 = findViewById(R.id.checkbox_3_3);
        CheckBox result4 = findViewById(R.id.checkbox_3_4);

        return result1.isChecked() && !result2.isChecked() && !result3.isChecked() && result4.isChecked();
    }

    //question4's Answers
    private boolean question4() {
        CheckBox result1 = findViewById(R.id.checkbox_4_1);
        CheckBox result2 = findViewById(R.id.checkbox_4_2);
        CheckBox result3 = findViewById(R.id.checkbox_4_3);
        CheckBox result4 = findViewById(R.id.checkbox_4_4);

        return result1.isChecked() && result2.isChecked() && !result3.isChecked() && !result4.isChecked();
    }

    //question5's Answers
    private boolean question5() {
        EditText editText = findViewById(R.id.editText);
        String Ans = editText.getText().toString();
        if (Ans.toLowerCase().equals("120")) {
        }
        return editText.getText().toString().equalsIgnoreCase("120");

    }

    //question5's Answers
    private boolean question6() {
        EditText editText = findViewById(R.id.editText2);
        String Ans = editText.getText().toString();
        if (Ans.toLowerCase().equals("0")) {
        }
        return editText.getText().toString().equalsIgnoreCase("0");

    }

    public void clickSubmit(View view) {

        ArrayList<String> Wrong = new ArrayList<>();

        int Score = 0;

        if (question1()) {

            Score += 20;

        } else {

            Wrong.add(" Question.1 is a wrong answer ");
        }

        if (question2()) {

            Score += 20;

        } else {

            Wrong.add(" Question.2 is a wrong answer ");
        }

        if (question3()) {

            Score += 20;

        } else {

            Wrong.add(" Question.3 is a wrong answer");
        }

        if (question4()) {

            Score += 20;

        } else {

            Wrong.add(" Question.4 is a wrong answer ");
        }

        if (question5()) {

            Score += 20;

        } else {

            Wrong.add(" Question.5 is a wrong answer ");

        }
        if (question6()) {

            Score += 20;

        } else {

            Wrong.add(" Question.6 is a wrong answer");
        }

        CharSequence message = "Congratulations  !! \n Your Score Is :" + Score + "\n Please Check The \n" + Wrong.toString();

        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }
}
