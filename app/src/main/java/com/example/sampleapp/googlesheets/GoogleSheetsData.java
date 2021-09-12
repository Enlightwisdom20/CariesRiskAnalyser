package com.example.sampleapp.googlesheets;
import java.util.ArrayList;

import lombok.Data;

@Data
public class GoogleSheetsData {
    private String name;
    private String email;
    private String phoneNumber;
    private String age;
    private String gender;
    private String sheetId;
    private String score;
    private ArrayList<String> answers;
}
