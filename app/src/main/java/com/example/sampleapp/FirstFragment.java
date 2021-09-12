package com.example.sampleapp;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private EditText nameEditText;
    private EditText emailAddressEditText;
    private EditText mobileNumberEditText;
    private Spinner ageSpinner;
    private RadioButton maleGenderRadioButton;
    private RadioButton englishRadioButton;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpUI(view);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOnline()) {
                    final String userName = nameEditText.getText().toString();
                    final String emailAddress = emailAddressEditText.getText().toString();
                    final String mobileNumber = mobileNumberEditText.getText().toString();
                    final String age = ageSpinner.getSelectedItem().toString();

                    final String gender = maleGenderRadioButton.isChecked() ? Constants.GENDER_MALE : Constants.GENDER_FEMALE;
                    final String language = englishRadioButton.isChecked() ? Constants.LANGUAGE_ENGLISH : Constants.LANGUAGE_TAMIL;

                    final boolean isValid = validateInputData();
                    if (isValid) {
                        final Intent intent = new Intent(getContext(), QuestionsActivity.class);
                        intent.putExtra(Constants.NAME, userName);
                        intent.putExtra(Constants.EMAIL, emailAddress);
                        intent.putExtra(Constants.MOBILE_NUMBER, mobileNumber);
                        intent.putExtra(Constants.GENDER, gender);
                        intent.putExtra(Constants.AGE, age);
                        intent.putExtra(Constants.LANGUAGE, language);
                        startActivity(intent);

                    }
                } else {
                    Toast.makeText(getContext(), "Please make sure your phone has a stable internet connection. Your phone must be connected to Wi-FI or mobile data in order to use the app.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return (netInfo != null && netInfo.isConnected());
    }

    private void setUpUI(final View view) {
        nameEditText = view.findViewById(R.id.name);
        emailAddressEditText = view.findViewById(R.id.email);
        mobileNumberEditText = view.findViewById(R.id.number);
        maleGenderRadioButton = view.findViewById(R.id.maleRadioButton);
        englishRadioButton = view.findViewById(R.id.englishRadioButton);

        final List age = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            age.add(Integer.toString(i));
        }
        final ArrayAdapter<Integer> spinnerArrayAdapter = new ArrayAdapter<Integer>(
                getContext(), android.R.layout.simple_spinner_item, age);
        spinnerArrayAdapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        ageSpinner = (Spinner)view.findViewById(R.id.spinner);
        ageSpinner.setAdapter(spinnerArrayAdapter);
    }

    private boolean validateInputData() {
        boolean isValid = true;
        if (isEmpty(nameEditText)) {
            nameEditText.setError("Name cannot to be empty.");
            isValid = false;
        }
        if (!isEmail(emailAddressEditText)) {
            emailAddressEditText.setError("Enter a valid Email address.");
            isValid = false;
        }
        if (!isMobileNumber(mobileNumberEditText)) {
            mobileNumberEditText.setError("Enter a valid Mobile Number.");
            isValid = false;
        }
        if (isEmpty(ageSpinner)) {
            isValid = false;
        }


        return isValid;
    }


    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isMobileNumber(final EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.PHONE.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    boolean isEmpty(final Spinner spinner) {
        final CharSequence str = spinner.getSelectedItem().toString();
        return TextUtils.isEmpty(str);
    }
}