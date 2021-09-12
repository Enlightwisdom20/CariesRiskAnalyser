package com.example.sampleapp.questions;

import com.example.sampleapp.Constants;

import java.util.ArrayList;

public class ScoreCalculator {
    private static final QuestionLibrary questionLibrary = new QuestionLibrary();

    public static String getScore(final ArrayList<String> selectedAnswers, final String googleSheetId) {
        final String choices[][] = questionLibrary.getChoices(googleSheetId);

        int index = 0;
        for (index = 0; index < selectedAnswers.size(); index++) {
            if(selectedAnswers.get(index).equals(getChoice(choices, index, 2))) {
                return Constants.HIGH_RISK;
            }
        }

        index = 0;
        for (index = 0; index < selectedAnswers.size(); index++) {
            if(selectedAnswers.get(index).equals(getChoice(choices, index, 1))) {
                return Constants.MODERATE_RISK;
            }
        }

        return Constants.LOW_RISK;
    }

    private static String getChoice(final String choices[][], final int index, final int choiceIndex) {
        try {
            return choices [index][choiceIndex];
        } catch (final ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }
}
