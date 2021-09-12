package com.example.sampleapp.questions.util;

import android.content.Intent;

public class EmailUtil {

    public static Intent getEmailIntent() {
        final Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/email");
        emailIntent.putExtra(Intent.EXTRA_EMAIL,
                new String[]{"cariesriskanalyser@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,
                "Queries/Feedback regarding CARIESK");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Please input your Queries/Feedback regarding CARIESK here :" + "");
        return emailIntent;
    }
}
