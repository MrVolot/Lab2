package com.example.lab2;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Counter {


    public static int getWordsCount(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = str.length() - 1;
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

    private static Context getApplicationContext() {
        return getApplicationContext();
    }

    public static int getCharsCount(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        str = str.replaceAll(",", "");
        str = str.replaceAll("\\.", "");
        str = str.replaceAll("\\s+", "");
        return str.length();
    }

}
