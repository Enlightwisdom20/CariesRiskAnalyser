package com.example.sampleapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.TextView;

import static com.example.sampleapp.R.*;

public class ResultsActivity extends AppCompatActivity {

    private ImageView riskImage;
    private TextView resultText;
    private TextView descriptionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.results);

        setUpUIComponents();

    }

    private void setUpUIComponents() {
        riskImage = (ImageView) findViewById(id.riskImage);
        resultText = (TextView) findViewById(id.result);
        descriptionText = (TextView) findViewById(id.description);

        final String score = getIntent().getStringExtra(Constants.SCORE);
        final String language = getIntent().getStringExtra(Constants.LANGUAGE);

        riskImage.setImageResource(getResultImage(score));
        resultText.setText(getResultText(score, language));
        descriptionText.setText(getDescriptionText(score, language));
        descriptionText.setTextColor(Color.parseColor(getDescriptionColor(score)));
    }

    private int getResultImage(final String score) {
        switch (score) {
            case Constants.HIGH_RISK:
                return drawable.high_risk_final;
            case Constants.MODERATE_RISK:
                return drawable.medium_risk;
            case Constants.LOW_RISK:
                return drawable.low_risk_final;
        }
        return 0;
    }

    private String getResultText(final String score, final String language) {
        if (language.equals(Constants.LANGUAGE_ENGLISH)) {
            switch (score) {
                case Constants.HIGH_RISK:
                    return Constants.HIGH_RISK_TEXT_ENGLISH;
                case Constants.MODERATE_RISK:
                    return Constants.MODERATE_RISK_TEXT_ENGLISH;
                case Constants.LOW_RISK:
                    return Constants.LOW_RISK_TEXT_ENGLISH;
            }
        } else {
            switch (score) {
                case Constants.HIGH_RISK:
                    return Constants.HIGH_RISK_TEXT_TAMIL;
                case Constants.MODERATE_RISK:
                    return Constants.MODERATE_RISK_TEXT_TAMIL;
                case Constants.LOW_RISK:
                    return Constants.LOW_RISK_TEXT_TAMIL;
            }
        }
        return null;
    }

    private String getDescriptionText(final String score, final String language) {
        if(language.equals(Constants.LANGUAGE_ENGLISH)) {
            switch (score) {
                case Constants.HIGH_RISK:
                    return Constants.HIGH_RISK_DESC_ENGLISH;
                case Constants.MODERATE_RISK:
                    return Constants.MODERATE_RISK_DESC_ENGLISH;
                case Constants.LOW_RISK:
                    return Constants.LOW_RISK_DESC_ENGLISH;
            }
        } else {
            switch (score) {
                case Constants.HIGH_RISK:
                    return Constants.HIGH_RISK_DESC_TAMIL;
                case Constants.MODERATE_RISK:
                    return Constants.MODERATE_RISK_DESC_TAMIL;
                case Constants.LOW_RISK:
                    return Constants.LOW_RISK_DESC_TAMIL;
            }
        }
        return null;
    }

    private String getDescriptionColor(final String score) {
        switch (score) {
            case Constants.HIGH_RISK:
                return Constants.HIGH_RISK_COLOR;
            case Constants.MODERATE_RISK:
                return Constants.MODERATE_RISK_COLOR;
            case Constants.LOW_RISK:
                return Constants.LOW_RISK_COLOR;
        }
        return null;
    }
}
