package com.example.sampleapp.questions;


import com.example.sampleapp.Constants;
import com.example.sampleapp.R;

public class QuestionLibrary {

    private String mEnglishQuestionsUnderSix[] = {
            "1) Does your child use Fluoride toothpaste or mouthwashes , deep bore well water on a daily basis?",
            "2) How frequently does your child consume Sugary Drinks? ",
            "3) Does your family members have any experience of caries ? (parents, caregivers or siblings)",
            "4) Has your child ever been to the dentist for check-up?",
            "5) Does your child brush his/her teeth twice a day?",
            "6) Does your child need special care?",
            "7) Has your child experienced any deep cavities and filled his/her teeth ?",
            "8) Does your child have any white spots on the teeth ? ",
            "9) Has your child lost teeth because of cavities?",
            "10) Are there any dirty deposits on the child's tooth?",
            "11) Does your child wear any appliance for teeth alignment?",
            "12) Does your child have dry mouth?"
    };

    private String mEnglishChoicesUnderSix[][] = {
            {"Yes", "No"},
            {"Primarily at mealtimes", "Frequent or prolonged between meal exposures/day", "Bottle or sippy cup with anything other than water at bed time"},
            {"No tooth decay in last 24 months", "Tooth decay in last 7-23 months", "Tooth decay in last 6 months"},
            {"Yes", "No"},
            {"Yes", "No"},
            {"No", "", "Yes"},
            {"No deep cavities or fillings in the last 24 months", "", "Yes – deep cavities or fillings in the last 24 months"},
            {"No white spots in the last 24 months ","", "Yes –cavities in the last 24 months"},
            {"No", "", "Yes"},
            {"No", "Yes"},
            {"No", "Yes"},
            {"No", "", "Yes"}
    };

    private String mEnglishDescriptionsUnderSix[] = {
            "Fluoride is a mineral in your bones and teeth. It’s also found naturally in the following: water , soil , plants , rocks , air. Fluoride is commonly used in dentistry to strengthen enamel, which is the outer layer of your teeth. Fluoride is mainly used to prevent dental caries and it also reverses the progression of dental caries thereby improving oral hygiene. Fluoride can be found in local water supply and they are available in various forms such as toothpaste , mouth rinses and supplements.",
            null,
            null,
            null,
            null,
            "A special needs child is the one who has been determined to require special attention and specific necessities that other children do not due to physical , medical and developmental condition.",
            null,
            null,
            null,
            null,
            null,
            null
    };

    private String mEnglishQuestionsAboveSix[] = {
                "1) Are you using Fluoride toothpaste or mouthwashes, deep bore well water on a daily basis?",
                "2) How frequently are you consuming Sugary Drinks?",
                "3) Does your family members have any experience of caries ? (parents, caregivers or siblings)",
                "4) Do you brush your teeth twice a day ?",
                "5) Are you a special care child ?",
                "6) Are you under Chemo/Radiation Therapy for the treatment of cancer ?",
                "7) Is your height and weight adequate ?",
                "8) Are you taking any medications?",
                "9) Do you smoke cigarettes or use any other form of tobacco and/ or consume alcohol? ",
                "10) Have you experienced any tooth decay and have filled any teeth?",
                "11) Have you removed any teeth due to cavities for the past 3 years ?",
                "12) Whether any dirty deposits are clearly visible on the tooth ?",
                "13) Do you think deposits are accumulated due to any turned or twisted  teeth?",
                "14) Do you have any fillings that are situated between two adjacent teeth?",
                "15) Are the roots of your teeth are visible to your eyes ?",
                "16) Whether food particles are deposited in between the gaps of your teeth ?",
                "17) Do you wear braces (clip) for the alignment of your teeth ?",
                "18) Whether you feel dryness in mouth always ?"
    };

    private String mEnglishChoicesAboveSix[][] = {
            {"Yes", "No"},
            {"Primarily at mealtimes", "", "Frequent or prolonged between meal exposures/day"},
            {"No tooth decay in last 24 months", "Tooth decay in last 7-23 months", "Tooth decay in last 6 months"},
            {"Yes", "No"},
            {"No", "Yes(over age 14)", "Yes(ages 6-14)"},
            {"No", "", "Yes"},
            {"Yes", "No"},
            {"No", "Yes"},
            {"No", "Yes"},
            {"\tNo cavities or fillings in the last 36 months", "Yes - 1 or 2 cavities or fillings in the last 36 months", "Yes - 3 or more cavities or fillings in the last 36 months"},
            {"No", "", "Yes"},
            {"No", "Yes"},
            {"No", "Yes"},
            {"No", "Yes"},
            {"No", "Yes"},
            {"No", "Yes"},
            {"No", "Yes"},
            {"No","", "Yes"}
    };

    private String mEnglishDescriptionsAboveSix[] = {
            "Fluoride is a mineral in your bones and teeth. It’s also found naturally in the following: water, soil, plants, rocks, air. Fluoride is commonly used in dentistry to strengthen enamel, which is the outer layer of your teeth. Fluoride is mainly used to prevent dental caries and it also reverses the progression of dental caries thereby improving oral hygiene. Fluoride can be found in local water supply and they are available in various forms such as toothpaste, mouth rinses and supplements.",
            null,
            null,
            null,
            "A special needs child is the one who has been determined to require special attention and specific necessities that other children do not due to physical, medical and developmental condition.",
            null,
            "Source : https://sites.google.com/site/ladyzspecial/Home/ideal-height-weight-chart",
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
    };

    private String mTamilQuestionsUnderSix[] = {
            "1) உங்கள் குழந்தை தினமும் பற்பசை , மௌத்வாஷ் அல்லது கிணற்று குடிநீர் மூலம்  ஃப்ளோரைடை பயன்படுத்துகிறாரா?",
            "2) உங்கள் குழந்தை தினமும் சர்க்கரை பானங்களை எத்தனை முறை அருந்துவார்?",
            "3) உங்கள் வீட்டில் யாருக்காவது பற்சொத்தை உள்ளதா ?  ",
            "4) உங்கள் குழந்தையை நீங்கள் பல்மருத்துவரிடம் எடுத்து சென்று பரிசோதனை செய்து உள்ளீர்களா ? ",
            "5) உங்கள் குழந்தை தினமும் இரண்டு முறை பற்களை சுத்தம் செய்வாரா?",
            "6) உங்கள் குழந்தை சிறப்பு கவனத் தேவைக்கு உட்பட்டவரா?",
            "7) உங்கள் குழந்தைக்கு ஆழமான பற்சொத்தை உள்ளதா அல்லது ஏதேனும் பற்களை அடைத்தது உண்டா ? ",
            "8) உங்கள் குழந்தையின் பற்களில் ஏதேனும் வெள்ளை புள்ளிகள் உள்ளதா ?",
            "9) உங்கள் குழந்தைக்கு பற்சொத்தை ஏற்பட்டு பற்கள் விழுந்ததா ?",
            "10) உங்கள் குழந்தையின் பற்களில் உள்ள அழுக்கு கண்களுக்குத் தெரிகிறதா  ?",
            "11) பல்வரிசையை சீர்படுத்த ஏதேனும் பற்களில் அணிந்து உள்ளார்களா?",
            "12) உங்கள் குழந்தைக்கு வாய் வறண்டு உள்ளதா ?"
    };

    private String mTamilChoicesUnderSix[][] = {
            {"ஆம்", "இல்லை"},
            {"உணவு வேளையில் மட்டும்", "அடிக்கடி அருந்துவது", "படுக்கை நேரத்தில் தண்ணீர் தவிர வேறு எதையும் பாட்டிலில் குடிப்பது"},
            {"கடந்த 24 மாதங்களாக பற்சொத்தை எதுவும் இல்லை", "கடந்த ஏழு முதல் இருபத்திமூன்று மாதங்களாக பற்சொத்தை இருக்கிறது", "கடந்த ஆறு  மாதங்களாக பற்சொத்தை இருக்கிறது"},
            {"ஆம்", "இல்லை"},
            {"ஆம்", "இல்லை"},
            {"இல்லை", "", "ஆம்"},
            {"கடந்த 24 மாதங்களாக பற்சொத்தை எதுவும் இல்லை பற்களை அடைத்ததும் இல்லை","", "ஆம் (கடந்த 24 மாதங்களாக)"},
            {"கடந்த 24 மாதங்களாக வெள்ளை புள்ளிகள் எதுவும் இல்லை", "ஆம் (கடந்த 24 மாதங்களாக வெள்ளை புள்ளிகள் உள்ளது ) "},
            {"இல்லை","", "ஆம்"},
            {"இல்லை", "ஆம்"},
            {"இல்லை", "ஆம்"},
            {"இல்லை","", "ஆம்"},
    };

    private String mTamilDescriptionsUnderSix[] = {
            "ஃப்ளோரைடு என்பது உங்கள் எலும்புகள் மற்றும் பற்களில் உள்ள ஒரு கனிமமாகும். நீர், மண், தாவரங்கள், பாறைகள், காற்று போன்றவற்றில் இயற்கையாக காணப்படுகிறது. ஃப்ளோரைடு பொதுவாக பற்களின் வெளிப்புறத்தில் உள்ள  எனாமலை  வலுப்படுத்த பயன்படுத்தப்படுகிறது. பல் சொத்தையைத் தடுக்க ஃப்ளோரைடு முக்கியமாகப் பயன்படுத்தப்படுகிறது, மேலும் இது பல் சொத்தைகளின் வளர்ச்சியைத் தடுக்கின்றது . இதனால் வாயின் ஆரோக்கியம் பாதுகாக்கப்படுகிறது . ஃப்ளோரைடு நாம் பருகும் குடிநீர் , பற்பசை , வாயை சுத்தம் செய்யும் நீர் மற்றும் மாத்திரை போன்ற பல்வேறு வடிவங்களில் கிடைக்கின்றன.",
            null,
            null,
            null,
            null,
            "மாற்றுத் திறனாளிக் குழந்தைகள் சிறப்பு கவனத்திற்கு உட்படுத்தப்படுபவர் . அவர்களின் உடல் , மருத்துவம் மற்றும் வளர்ச்சிநிலை காரணமாக மருத்துவரின் முழுமையான சிகிச்சைப் பிரிவில் அடங்குவர்.",
            null,
            null,
            null,
            null,
            null,
            null
    };

    private String mTamilQuestionsAboveSix[] = {
            "1) நீங்கள் தினமும் பற்பசை, மௌத்வாஷ் அல்லது கிணற்று குடிநீர் போன்ற எந்த முறையிலாவது  ஃப்ளோரைடை பயன்படுத்துகிறீர்களா ?",
            "2) நீங்கள் தினமும் சர்க்கரை பானங்களை எத்தனை முறை அருந்துவீர்கள் ?",
            "3) உங்கள் பெற்றோர், உடன்பிறப்பு அல்லது பராமரிப்பாளர் யாருக்காவது பற்சொத்தை உள்ளதா ?  ",
            "4) நீங்கள் தினமும் இரண்டு முறை பற்களை சுத்தம் செய்கிறீர்களா ?",
            "5) நீங்கள்  சிறப்பு கவனத் தேவைக்கு உட்பட்டவரா? ",
            "6) நீங்கள் புற்றுநோய்கான கீமோ அல்லது கதிர்வீச்சு சிகிச்சையில் உள்ளீர்களா?",
            "7) உங்கள் உயரத்திற்கேற்ற இடையில் உள்ளீர்களா ?",
            "8) மருந்துகள் ஏதேனும் உட்கொள்கிறீர்களா ?",
            "9) உங்களுக்கு தினமும் புகை பிடிக்கும் அல்லது மது அருந்தும் பழக்கம் உண்டா ? ",
            "10) உங்களுக்கு  பற்சொத்தை உள்ளதா அல்லது ஏதேனும் பற்களை அடைத்தது உண்டா ?",
            "11) கடந்த மூன்று ஆண்டுகளில் பற்சொத்தை ஏற்பட்டு பற்களை எடுத்தது உண்டா?",
            "12) உங்கள் பற்களில் உள்ள அழுக்கு கண்களுக்கு தென்படுகிறதா ?",
            "13) கோணலாக பற்கள் இருப்பதால் அழுக்கு படிகிறதா?",
            "14) நீங்கள் இரண்டு பற்களுக்கு நடுவில் பல் அடைத்தது உண்டா ? ",
            "15) பற்களின் வேர் தெரியும் அளவிற்கு பற்சிதைவு உண்டா?",
            "16) பற்களின் இடையில் உணவு ஏதேனும் சிக்கிக் கொள்ளூகிறதா?",
            "17) பல்வரிசையை சீர்படுத்த ஏதேனும் கிளிப் அணிந்து உள்ளீர்களா?",
            "18) எப்பொழுதும் வாய் வறண்டு உள்ளதா ?"
    };

    private String mTamilChoicesAboveSix[][] = {
            {"ஆம்", "இல்லை"},
            {"உணவு வேளையில் மட்டும்", "", "அடிக்கடி அருந்துவது"},
            {"கடந்த 24 மாதங்களாக பற்சொத்தை எதுவும் இல்லை", "கடந்த ஏழு முதல் இருபத்திமூன்று மாதங்களாக பற்சொத்தை இருக்கிறது", "கடந்த ஆறு  மாதங்களாக பற்சொத்தை இருக்கிறது"},
            {"ஆம்", "இல்லை"},
            {"இல்லை", "ஆம் ( வயது 14 + ) ", "ஆம் ( வயது 6- 14 )"},
            {"இல்லை","", "ஆம்"},
            {"ஆம்","இல்லை"},
            {"இல்லை", "ஆம்"},
            {"இல்லை", "ஆம்"},
            {"கடந்த 36 மாதங்களாக பற்சொத்தை எதுவும் இல்லை பற்களை அடைத்ததும் இல்லை", "ஆம் ( ஒன்று அல்லது இரண்டு பற்கள் - கடந்த 36 மாதங்களாக)", "ஆம் ( மூன்று அல்லது அதற்கு மேற்பட்ட பற்கள் - கடந்த 36 மாதங்களாக ) "},
            {"இல்லை","", "ஆம்"},
            {"இல்லை", "ஆம்"},
            {"இல்லை", "ஆம்"},
            {"இல்லை", "ஆம்"},
            {"இல்லை", "ஆம்"},
            {"இல்லை", "ஆம்"},
            {"இல்லை", "ஆம்"},
            {"இல்லை","", "ஆம்"},
    };

    private String mTamilDescriptionsAboveSix[] = {
            "ஃப்ளோரைடு என்பது உங்கள் எலும்புகள் மற்றும் பற்களில் உள்ள ஒரு கனிமமாகும். நீர், மண், தாவரங்கள், பாறைகள், காற்று போன்றவற்றில் இயற்கையாக காணப்படுகிறது. ஃப்ளோரைடு பொதுவாக பற்களின் வெளிப்புறத்தில் உள்ள  எனாமலை  வலுப்படுத்த பயன்படுத்தப்படுகிறது. பல் சொத்தையைத் தடுக்க ஃப்ளோரைடு முக்கியமாகப் பயன்படுத்தப்படுகிறது, மேலும் இது பல் சொத்தைகளின் வளர்ச்சியைத் தடுக்கின்றது . இதனால் வாயின் ஆரோக்கியம் பாதுகாக்கப்படுகிறது . ஃப்ளோரைடு நாம் பருகும் குடிநீர் , பற்பசை , வாயை சுத்தம் செய்யும் நீர் மற்றும் மாத்திரை போன்ற பல்வேறு வடிவங்களில் கிடைக்கின்றன.",
            null,
            null,
            null,
            "மாற்றுத் திறனாளிக் குழந்தைகள் சிறப்பு கவனத்திற்கு உட்படுத்தப்படுபவர் . அவர்களின் உடல் , மருத்துவம் மற்றும் வளர்ச்சிநிலை காரணமாக மருத்துவரின் முழுமையான சிகிச்சைப் பிரிவில் அடங்குவர்.",
            null,
            "Source : https://sites.google.com/site/ladyzspecial/Home/ideal-height-weight-chart",
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
    };

    private String mCorrectAnswers[] = {"Roots", "Leaves", "Flower", "Stem"};

    private final int DEFAULT_PICTURE = 0;

    public String getQuestion(int a, final String googleSheetId) {
        switch (googleSheetId) {
            case Constants.ABOVE_SIX_ENGLISH:
                return mEnglishQuestionsAboveSix[a];
            case Constants.UNDER_SIX_ENGLISH:
                return mEnglishQuestionsUnderSix[a];
            case Constants.ABOVE_SIX_TAMIL:
                return mTamilQuestionsAboveSix[a];
            case Constants.UNDER_SIX_TAMIL:
                return mTamilQuestionsUnderSix[a];
        }
        return null;
    }

    public String getDescriptions(final int a, final String googleSheetId) {
        switch (googleSheetId) {
            case Constants.ABOVE_SIX_ENGLISH:
                return mEnglishDescriptionsAboveSix[a];
            case Constants.UNDER_SIX_ENGLISH:
                return mEnglishDescriptionsUnderSix[a];
            case Constants.ABOVE_SIX_TAMIL:
                return mTamilDescriptionsAboveSix[a];
            case Constants.UNDER_SIX_TAMIL:
                return mTamilDescriptionsUnderSix[a];
        }
        return null;
    }


    public boolean isQuestionsAvailable(final int questionNumber, final String googleSheetId) {
        switch (googleSheetId) {
            case Constants.ABOVE_SIX_ENGLISH:
                if (mEnglishQuestionsAboveSix.length <= questionNumber) {
                    System.out.println("NK NK ONE ONE ONE");
                    return false;
                }
                break;
            case Constants.UNDER_SIX_ENGLISH:
                if (mEnglishQuestionsUnderSix.length <= questionNumber) {
                    System.out.println("NK NK TWO");
                    return false;
                }
                break;
            case Constants.ABOVE_SIX_TAMIL:
                if (mTamilQuestionsAboveSix.length <= questionNumber) {
                    System.out.println("NK NK THREE");
                    return false;
                }
                break;
            case Constants.UNDER_SIX_TAMIL:
                if (mTamilQuestionsUnderSix.length <= questionNumber) {
                    System.out.println("NK NK FOUR");
                    return false;
                }
                break;
        }
        return true;
    }

    public String getChoice1(int a, final String googleSheetId) {

        switch (googleSheetId) {
            case Constants.ABOVE_SIX_ENGLISH:
                return mEnglishChoicesAboveSix[a][0];
            case Constants.UNDER_SIX_ENGLISH:
                return mEnglishChoicesUnderSix[a][0];
            case Constants.ABOVE_SIX_TAMIL:
                return mTamilChoicesAboveSix[a][0];
            case Constants.UNDER_SIX_TAMIL:
                return mTamilChoicesUnderSix[a][0];
        }
        return null;
    }

    public String getChoice2(int a, final String googleSheetId) {
        switch (googleSheetId) {
            case Constants.ABOVE_SIX_ENGLISH:
                return mEnglishChoicesAboveSix[a][1];
            case Constants.UNDER_SIX_ENGLISH:
                return mEnglishChoicesUnderSix[a][1];
            case Constants.ABOVE_SIX_TAMIL:
                return mTamilChoicesAboveSix[a][1];
            case Constants.UNDER_SIX_TAMIL:
                return mTamilChoicesUnderSix[a][1];
        }
        return null;
    }

    public String getChoice3(int a, final String googleSheetId) {
        try {
            switch (googleSheetId) {
                case Constants.ABOVE_SIX_ENGLISH:
                    return mEnglishChoicesAboveSix[a][2];
                case Constants.UNDER_SIX_ENGLISH:
                    return mEnglishChoicesUnderSix[a][2];
                case Constants.ABOVE_SIX_TAMIL:
                    return mTamilChoicesAboveSix[a][2];
                case Constants.UNDER_SIX_TAMIL:
                    return mTamilChoicesUnderSix[a][2];
            }
        } catch (final ArrayIndexOutOfBoundsException e) {
            return null;
        }
        return null;
    }

    public String getCorrectAnswer(int a) {
        return mCorrectAnswers[0];
    }
    public int getPicture(int a, final String googleSheetId) {

        switch (googleSheetId) {
            case Constants.ABOVE_SIX_ENGLISH:
            case Constants.ABOVE_SIX_TAMIL:
                return getPictureAboveSix(a);
            case Constants.UNDER_SIX_ENGLISH:
            case Constants.UNDER_SIX_TAMIL:
                return getPictureUnderSix(a);
        }
        return 0;
    }

    private int getPictureAboveSix(int a) {
        a = a +1;
        switch (a) {
            case 3:
            case 10:
                return R.drawable.age_six_plus_picture_3;
            case 5:
                return R.drawable.age_six_plus_picture_5;
            case 7:
                return R.drawable.mal;
            case 12:
                return R.drawable.age_six_plus_picture_12;
            case 14:
                return R.drawable.age_six_plus_picture_14;
            case 15:
                return R.drawable.age_six_plus_picture_15;
            default:
                return DEFAULT_PICTURE;

        }
    }

    private int getPictureUnderSix(int a) {
        a = a +1;
        switch (a) {
            case 3:
                return R.drawable.age_six_plus_picture_3;
            case 6:
                return R.drawable.age_six_plus_picture_5;
            case 8:
                return R.drawable.age_under_six_picture_8;
            case 10:
                return R.drawable.age_under_six_picture_10;
            default:
                return DEFAULT_PICTURE;
        }
    }

    public String[][] getChoices(final String googleSheetId) {
        switch (googleSheetId) {
            case Constants.ABOVE_SIX_ENGLISH:
                return mEnglishChoicesAboveSix;
            case Constants.UNDER_SIX_ENGLISH:
                return mEnglishChoicesUnderSix;
            case Constants.ABOVE_SIX_TAMIL:
                return mTamilChoicesAboveSix;
            case Constants.UNDER_SIX_TAMIL:
                return mTamilChoicesUnderSix;
        }
        return null;
    }

    public String getGoogleSheetsId(final int age, final String language) {
        switch(language) {
            case Constants.LANGUAGE_ENGLISH:
                if (age>6) {
                    return Constants.ABOVE_SIX_ENGLISH;
                } else {
                    return Constants.UNDER_SIX_ENGLISH;
                }
            case Constants.LANGUAGE_TAMIL:
                if (age>6) {
                    return Constants.ABOVE_SIX_TAMIL;
                } else {
                    return Constants.UNDER_SIX_TAMIL;
                }
        }
        return Constants.ABOVE_SIX_ENGLISH;
    }
}
