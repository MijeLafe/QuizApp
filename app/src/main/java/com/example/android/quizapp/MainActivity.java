package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Global variables declaration as defined in the string file
    int score = 0;
    EditText name;
    EditText email;
    RadioGroup optionOne;
    RadioGroup optionTwo;
    RadioGroup optionThree;
    EditText questionFourAns;
    EditText questionFiveAns;
    CheckBox optionSixA;
    CheckBox optionSixB;
    CheckBox optionSixC;
    CheckBox optionSixD;
    CheckBox optionSixE;
    CheckBox optionSevenA;
    CheckBox optionSevenB;
    CheckBox optionSevenC;
    CheckBox optionSevenD;
    CheckBox optionSevenE;
    CheckBox optionEightA;
    CheckBox optionEightB;
    CheckBox optionEightC;
    CheckBox optionEightD;
    CheckBox optionEightE;
    CheckBox optionNineA;
    CheckBox optionNineB;
    CheckBox optionNineC;
    CheckBox optionNineD;
    CheckBox optionNineE;
    CheckBox optionTenA;
    CheckBox optionTenB;
    CheckBox optionTenC;
    CheckBox optionTenD;
    CheckBox optionTenE;
    Switch mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // A method that resets all the objects to their initial state when the reset button is clicked
    public void reset (View view) {
        score = 0;
        name = findViewById(R.id.name_editText);
        name.getText().clear();
        email = findViewById(R.id.email_editText);
        email.getText().clear();
        optionOne = findViewById(R.id.option_one);
        optionOne.clearCheck();
        optionTwo = findViewById(R.id.option_two);
        optionTwo.clearCheck();
        optionThree = findViewById(R.id.option_three);
        optionThree.clearCheck();
        questionFourAns = findViewById(R.id.question_four_ans);
        questionFourAns.setText("");
        questionFiveAns = findViewById(R.id.question_five_ans);
        questionFiveAns.setText("");
        optionSixA = findViewById(R.id.option_six_a);
        optionSixA.setChecked(false);
        optionSixB = findViewById(R.id.option_six_b);
        optionSixB.setChecked(false);
        optionSixC = findViewById(R.id.option_six_c);
        optionSixC.setChecked(false);
        optionSixD = findViewById(R.id.option_six_d);
        optionSixD.setChecked(false);
        optionSixE = findViewById(R.id.option_six_e);
        optionSixE.setChecked(false);
        optionSevenA = findViewById(R.id.option_seven_a);
        optionSevenA.setChecked(false);
        optionSevenB = findViewById(R.id.option_seven_b);
        optionSevenB.setChecked(false);
        optionSevenC = findViewById(R.id.option_seven_c);
        optionSevenC.setChecked(false);
        optionSevenD = findViewById(R.id.option_seven_d);
        optionSevenD.setChecked(false);
        optionSevenE = findViewById(R.id.option_seven_e);
        optionSevenE.setChecked(false);
        optionEightA = findViewById(R.id.option_eight_a);
        optionEightA.setChecked(false);
        optionEightB = findViewById(R.id.option_eight_b);
        optionEightB.setChecked(false);
        optionEightC = findViewById(R.id.option_eight_c);
        optionEightC.setChecked(false);
        optionEightD = findViewById(R.id.option_eight_d);
        optionEightD.setChecked(false);
        optionEightE = findViewById(R.id.option_eight_e);
        optionEightE.setChecked(false);
        optionNineA = findViewById(R.id.option_nine_a);
        optionNineA.setChecked(false);
        optionNineB = findViewById(R.id.option_nine_b);
        optionNineB.setChecked(false);
        optionNineC = findViewById(R.id.option_nine_c);
        optionNineC.setChecked(false);
        optionNineD = findViewById(R.id.option_nine_d);
        optionNineD.setChecked(false);
        optionNineE = findViewById(R.id.option_nine_e);
        optionNineE.setChecked(false);
        optionTenA = findViewById(R.id.option_ten_a);
        optionTenA.setChecked(false);
        optionTenB = findViewById(R.id.option_ten_b);
        optionTenB.setChecked(false);
        optionTenC = findViewById(R.id.option_ten_c);
        optionTenC.setChecked(false);
        optionTenD = findViewById(R.id.option_ten_d);
        optionTenD.setChecked(false);
        optionTenE = findViewById(R.id.option_ten_e);
        optionTenE.setChecked(false);
        mySwitch = findViewById(R.id.switch1);
        mySwitch.setChecked(false);
        mySwitch.setVisibility(View.GONE);
        TextView targetView = name;
        targetView.getParent().requestChildFocus(targetView, targetView);
    }

    /** A method that is executed when the submit button is clicked
     *  It checks if the view was clicked or the editText field was filled and then
     *  gets the value and compare with a correct answer so as to update the score.
     *  Else, it gives a prompt for the question to be answered.
     *  It also gives the user an option of receiving the result through mail
     *
      * @param view
     */

    public void submit (View view) {
        score = 0;
        optionOne = findViewById(R.id.option_one);
        int idOne = optionOne.getCheckedRadioButtonId();
        //to check if the radio group was not checked so as to alert the user
        if (idOne == -1) {
            TextView targetView = findViewById(R.id.question_one);
            targetView.getParent().requestChildFocus(targetView, targetView);
            Toast.makeText(this, R.string.quest_one_err, Toast.LENGTH_SHORT).show();
            return;
        }
        // And if it is checked, score is updated
        if (idOne == R.id.option_one_d) {
            score += 1;
        }

        optionTwo = findViewById(R.id.option_two);
        int idTwo = optionTwo.getCheckedRadioButtonId();
        if (idTwo == -1) {
            TextView targetView = findViewById(R.id.question_two);
            targetView.getParent().requestChildFocus(targetView, targetView);
            Toast.makeText(this, R.string.quest_two_err, Toast.LENGTH_SHORT).show();
            return;
        }
        if (idTwo == R.id.option_two_b) {
            score += 1;
        }

        optionThree = findViewById(R.id.option_three);
        int idThree = optionThree.getCheckedRadioButtonId();
        if (idThree == -1) {
            TextView targetView = findViewById(R.id.question_three);
            targetView.getParent().requestChildFocus(targetView, targetView);
            Toast.makeText(this, R.string.quest_three_err, Toast.LENGTH_SHORT).show();
            return;
        }
        if (idThree == R.id.option_three_c) {
            score += 1;
        }

        questionFourAns = findViewById(R.id.question_four_ans);
        //To check if the edit text field is empty so as to alert the user
        if (TextUtils.isEmpty(questionFourAns.getText().toString().trim())) {
            TextView targetView = findViewById(R.id.question_four);
            targetView.getParent().requestChildFocus(targetView, targetView);
            Toast.makeText(this, R.string.quest_four_err, Toast.LENGTH_SHORT).show();
            return;
        }
        //Else, score is updated
        if (questionFourAns.getText().toString().equalsIgnoreCase(getString(R.string.question_four_correct_ans))) {
            score += 1;
        }

        questionFiveAns = findViewById(R.id.question_five_ans);
        if (TextUtils.isEmpty(questionFiveAns.getText().toString().trim())) {
            TextView targetView = findViewById(R.id.question_five);
            targetView.getParent().requestChildFocus(targetView, targetView);
            Toast.makeText(this, R.string.quest_five_err, Toast.LENGTH_SHORT).show();
            return;
        }
        if (questionFiveAns.getText().toString().equalsIgnoreCase(getString(R.string.question_five_correct_ans))) {
            score += 1;
        }

        optionSixA = findViewById(R.id.option_six_a);
        optionSixB = findViewById(R.id.option_six_b);
        optionSixC = findViewById(R.id.option_six_c);
        optionSixD = findViewById(R.id.option_six_d);
        optionSixE = findViewById(R.id.option_six_e);
        boolean sixA = optionSixA.isChecked();
        boolean sixB = optionSixB.isChecked();
        boolean sixC = optionSixC.isChecked();
        boolean sixD = optionSixD.isChecked();
        boolean sixE = optionSixE.isChecked();
        //To check if none of the checkboxes is checked so as to alert the user
        if (!sixA && !sixB && !sixC && !sixD && !sixE) {
            TextView targetView = findViewById(R.id.question_six);
            targetView.getParent().requestChildFocus(targetView, targetView);
            Toast.makeText(this, R.string.quest_six_err, Toast.LENGTH_SHORT).show();
            return;
        }
        // Else update score
        if (!sixA && sixB && !sixC && sixD && !sixE) {
            score += 1;
        }

        optionSevenA = findViewById(R.id.option_seven_a);
        optionSevenB = findViewById(R.id.option_seven_b);
        optionSevenC = findViewById(R.id.option_seven_c);
        optionSevenD = findViewById(R.id.option_seven_d);
        optionSevenE = findViewById(R.id.option_seven_e);
        boolean sevenA = optionSevenA.isChecked();
        boolean sevenB = optionSevenB.isChecked();
        boolean sevenC = optionSevenC.isChecked();
        boolean sevenD = optionSevenD.isChecked();
        boolean sevenE = optionSevenE.isChecked();
        if (!sevenA && !sevenB && !sevenC && !sevenD && !sevenE) {
            TextView targetView = findViewById(R.id.question_seven);
            targetView.getParent().requestChildFocus(targetView, targetView);
            Toast.makeText(this, R.string.quest_seven_err, Toast.LENGTH_SHORT).show();
            return;
        }
        if (!sevenA && sevenB && !sevenC && !sevenD && sevenE) {
            score += 1;
        }

        optionEightA = findViewById(R.id.option_eight_a);
        optionEightB = findViewById(R.id.option_eight_b);
        optionEightC = findViewById(R.id.option_eight_c);
        optionEightD = findViewById(R.id.option_eight_d);
        optionEightE = findViewById(R.id.option_eight_e);
        boolean eightA = optionEightA.isChecked();
        boolean eightB = optionEightB.isChecked();
        boolean eightC = optionEightC.isChecked();
        boolean eightD = optionEightD.isChecked();
        boolean eightE = optionEightE.isChecked();
        if (!eightA && !eightB && !eightC && !eightD && !eightE) {
            TextView targetView = findViewById(R.id.question_eight);
            targetView.getParent().requestChildFocus(targetView, targetView);
            Toast.makeText(this, R.string.quest_eight_err, Toast.LENGTH_SHORT).show();
            return;
        }
        if (!eightA && !eightB && !eightC && eightD && !eightE) {
            score += 1;
        }

        optionNineA = findViewById(R.id.option_nine_a);
        optionNineB = findViewById(R.id.option_nine_b);
        optionNineC = findViewById(R.id.option_nine_c);
        optionNineD = findViewById(R.id.option_nine_d);
        optionNineE = findViewById(R.id.option_nine_e);
        boolean nineA = optionNineA.isChecked();
        boolean nineB = optionNineB.isChecked();
        boolean nineC = optionNineC.isChecked();
        boolean nineD = optionNineD.isChecked();
        boolean nineE = optionNineE.isChecked();
        if (!nineA && !nineB && !nineE && !nineC && !nineD) {
            TextView targetView = findViewById(R.id.question_nine);
            targetView.getParent().requestChildFocus(targetView, targetView);
            Toast.makeText(this, R.string.quest_nine_err, Toast.LENGTH_SHORT).show();
            return;
        }
        if (nineA && nineB && nineE && !nineC && !nineD) {
            score += 1;
        }

        optionTenA = findViewById(R.id.option_ten_a);
        optionTenB = findViewById(R.id.option_ten_b);
        optionTenC = findViewById(R.id.option_ten_c);
        optionTenD = findViewById(R.id.option_ten_d);
        optionTenE = findViewById(R.id.option_ten_e);
        boolean tenA = optionTenA.isChecked();
        boolean tenB = optionTenB.isChecked();
        boolean tenC = optionTenC.isChecked();
        boolean tenD = optionTenD.isChecked();
        boolean tenE = optionTenE.isChecked();
        if (!tenA && !tenB && !tenC && !tenD && !tenE) {
            TextView targetView = findViewById(R.id.question_ten);
            targetView.getParent().requestChildFocus(targetView, targetView);
            Toast.makeText(this, R.string.quest_ten_err, Toast.LENGTH_SHORT).show();
            return;
        }
        if (tenA && !tenB && !tenC && !tenD && !tenE) {
            score += 1;
        }

        // Displays a toast for the score
        Toast.makeText(MainActivity.this, getString(R.string.result, score), Toast.LENGTH_LONG).show();
        // Displays a toast message based on the user's performance
        if (score > 7) {
            Toast.makeText(MainActivity.this, getString(R.string.fabulous), Toast.LENGTH_SHORT).show();
        } else if (score >= 5 && score <= 7) {
            Toast.makeText(MainActivity.this, getString(R.string.good_job), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, getString(R.string.try_again), Toast.LENGTH_SHORT).show();
        }

        // Sets the switch view visible and ensures it's off
        mySwitch = findViewById(R.id.switch1);
        mySwitch.setChecked(false);
        mySwitch.setVisibility(View.VISIBLE);
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

        /** This method allows the user to receive a mail of the result if the switch is on
         * It also ensures that the name and email fields are filled and then sends an intent
         * to a mail app with a summary of the result
         */
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                // When the switch is on
                if (isChecked) {
                    name = findViewById(R.id.name_editText);
                    String nameOfUser = name.getText().toString();
                    email = findViewById(R.id.email_editText);
                    String[] address = {email.getText().toString()};
                    String msg = returnMessage();
                    //To check if the name edit text field is empty so as to alert the user
                    if (TextUtils.isEmpty(name.getText().toString().trim())) {
                        TextView targetView = name;
                        targetView.getParent().requestChildFocus(targetView, targetView);
                        Toast.makeText(MainActivity.this, R.string.name_err, Toast.LENGTH_SHORT).show();
                        mySwitch.setChecked(false);
                        return;
                    }
                    //To check if the email edit text field is empty so as to alert the user
                    if (TextUtils.isEmpty(email.getText().toString().trim())) {
                        TextView targetView = name;
                        targetView.getParent().requestChildFocus(targetView, targetView);
                        Toast.makeText(MainActivity.this, R.string.email_err, Toast.LENGTH_SHORT).show();
                        mySwitch.setChecked(false);
                        return;
                    }
                    // Sends an intent to a mail app with the necessary details
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.result_email_subject, nameOfUser));
                    intent.putExtra(Intent.EXTRA_EMAIL, address);
                    intent.putExtra(Intent.EXTRA_TEXT, msg);
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }
                }
            }
        });
    }

    // A method that returns the score and a compliment that serves as the body of the mail
    public String returnMessage () {
        String msg = getString(R.string.result, score);
        if (score > 7) {
            msg += "\n" + getString(R.string.fabulous);
        }
        else if (score >= 5 && score <= 7) {
            msg += "\n" + getString(R.string.good_job);
        }
        else {
            msg += "\n" + getString(R.string.try_again);
        }
           return msg;
    }

}
