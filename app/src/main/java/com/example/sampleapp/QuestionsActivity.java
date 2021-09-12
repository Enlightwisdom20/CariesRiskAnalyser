package com.example.sampleapp;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import com.example.sampleapp.googlesheets.GoogleSheetsData;
import com.example.sampleapp.googlesheets.GoogleSheetsUtil;
import com.example.sampleapp.questions.QuestionLibrary;
import com.example.sampleapp.questions.ScoreCalculator;
import com.example.sampleapp.questions.util.EmailUtil;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

import static com.example.sampleapp.R.*;

public class QuestionsActivity extends AppCompatActivity {



    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mQuestionView;
    private TextView mDescriptionView;

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private ImageView mImageView;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    private ArrayList<String> selectedAnswers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_questions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(Constants.APP_NAME);

        mQuestionView = (TextView)findViewById(id.question);
        mDescriptionView = (TextView)findViewById(id.description);
        mButtonChoice1 = (Button)findViewById(id.choice1);
        mButtonChoice2 = (Button)findViewById(id.choice2);
        mButtonChoice3 = (Button)findViewById(id.choice3);
        mImageView = (ImageView)findViewById(id.riskImage);

        FloatingActionButton fab = findViewById(id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent emailIntent = EmailUtil.getEmailIntent();
                startActivity(Intent.createChooser(emailIntent, "Send Feedback:"));
            }
        });

        final GoogleSheetsData googleSheetsData = getGoogleSheetsData();
        final String googleSheetId = getGoogleSheetsId();
        updateQuestion(googleSheetId, googleSheetsData);

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateAnswer(mButtonChoice1.getText().toString());
                    updateScore(mScore);
                    updateQuestion(googleSheetId, googleSheetsData);
                    //This line of code is optional
                    //Toast.makeText(QuestionsActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    //Toast.makeText(QuestionsActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateAnswer(mButtonChoice1.getText().toString());
                    updateQuestion(googleSheetId, googleSheetsData);
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateAnswer(mButtonChoice2.getText().toString());
                    updateScore(mScore);
                    updateQuestion(googleSheetId, googleSheetsData);
                } else {
                    updateAnswer(mButtonChoice2.getText().toString());
                    updateQuestion(googleSheetId, googleSheetsData);
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateAnswer(mButtonChoice3.getText().toString());
                    updateScore(mScore);
                    updateQuestion(googleSheetId, googleSheetsData);
                    //This line of code is optional
                    //Toast.makeText(QuestionsActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    //Toast.makeText(QuestionsActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateAnswer(mButtonChoice3.getText().toString());
                    updateQuestion(googleSheetId, googleSheetsData);
                }
            }
        });

        //End of Button Listener for Button3





    }

    private void updateQuestion(final String googleSheetId, final GoogleSheetsData googleSheetsData){
        if (!mQuestionLibrary.isQuestionsAvailable(mQuestionNumber, googleSheetId)) {
            if (isOnline()) {
                final String score = ScoreCalculator.getScore(selectedAnswers, googleSheetId);
                googleSheetsData.setAnswers(selectedAnswers);
                googleSheetsData.setScore(score);
                GoogleSheetsUtil.addItem(this, googleSheetsData);
                final Intent intent = new Intent(getBaseContext(), ResultsActivity.class);
                intent.putExtra(Constants.SCORE, score);
                intent.putExtra(Constants.LANGUAGE, getIntent().getStringExtra(Constants.LANGUAGE));
                startActivity(intent);
                return;
            } else {
                //Toast.makeText(this, "Please make sure your phone has a stable internet connection. Your phone must be connected to Wi-FI or mobile data in order to use the app.", Toast.LENGTH_SHORT).show();
                Toast toast =  Toast.makeText(this, "Please make sure your phone has a stable internet connection. Your phone must be connected to Wi-FI or mobile data in order to use the app.", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                return;
            }
        }

        // Set choices
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber, googleSheetId));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber, googleSheetId));

        if (!mQuestionLibrary.getChoice2(mQuestionNumber, googleSheetId).equals("")) {
            mButtonChoice2.setVisibility(View.VISIBLE);
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber, googleSheetId));
        } else {
            mButtonChoice2.setVisibility(View.GONE);
        }


        if (mQuestionLibrary.getChoice3(mQuestionNumber, googleSheetId) != null) {
            mButtonChoice3.setVisibility(View.VISIBLE);
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber, googleSheetId));
        } else {
            mButtonChoice3.setVisibility(View.GONE);
        }


        // Set images

        final int picture = mQuestionLibrary.getPicture(mQuestionNumber, googleSheetId);
        if (picture != 0) {
            if (picture == drawable.mal) {
                ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) mImageView.getLayoutParams();
                params.height = 800;
                mImageView.setLayoutParams(params);
            } else {
                ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) mImageView.getLayoutParams();
                params.height = 550;
                mImageView.setLayoutParams(params);
            }
            mImageView.setVisibility(View.VISIBLE);
            mImageView.setImageResource(mQuestionLibrary.getPicture(mQuestionNumber, googleSheetId));
        } else {
            mImageView.setVisibility(View.GONE);
        }

        // Set descriptions

        if (mQuestionLibrary.getDescriptions(mQuestionNumber, googleSheetId)!=null) {
            mDescriptionView.setText(mQuestionLibrary.getDescriptions(mQuestionNumber, googleSheetId));
        } else {
            mDescriptionView.setText("");
        }

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }


    private void updateScore(int point) {
        // mScoreView.setText("" + mScore);
        // Todo Do something based on points score.
        // Move to new activity to display maps
    }

    private void updateAnswer(final String selectedAnswer) {
        selectedAnswers.add(selectedAnswer);
    }


    private GoogleSheetsData getGoogleSheetsData() {
        final GoogleSheetsData googleSheetsData = new GoogleSheetsData();
        googleSheetsData.setAge(getIntent().getStringExtra(Constants.AGE));
        googleSheetsData.setEmail(getIntent().getStringExtra(Constants.EMAIL));
        googleSheetsData.setGender(getIntent().getStringExtra(Constants.GENDER));
        googleSheetsData.setName(getIntent().getStringExtra(Constants.NAME));
        googleSheetsData.setPhoneNumber(getIntent().getStringExtra(Constants.MOBILE_NUMBER));
        googleSheetsData.setSheetId(getGoogleSheetsId());
        return googleSheetsData;
    }

    private String getGoogleSheetsId() {
        final int age = Integer.parseInt(getIntent().getStringExtra(Constants.AGE));
        final String language = getIntent().getStringExtra(Constants.LANGUAGE);
        return mQuestionLibrary.getGoogleSheetsId(age, language);
    }

    private boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return (netInfo != null && netInfo.isConnected());
    }
}