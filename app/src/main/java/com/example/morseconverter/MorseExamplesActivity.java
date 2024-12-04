package com.example.morseconverter;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MorseExamplesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse_examples);

        TextView morseExamplesText = findViewById(R.id.morseExamplesText);

        // Full Morse code table
        String morseExamples = "Morse Code Examples:\n\n" +
                "A -> .-\nB -> -...\nC -> -.-.\nD -> -..\nE -> .\n" +
                "F -> ..-.\nG -> --.\nH -> ....\nI -> ..\nJ -> .---\n" +
                "K -> -.-\nL -> .-..\nM -> --\nN -> -.\nO -> ---\n" +
                "P -> .--.\nQ -> --.-\nR -> .-.\nS -> ...\nT -> -\n" +
                "U -> ..-\nV -> ...-\nW -> .--\nX -> -..-\nY -> -.--\n" +
                "Z -> --..\n\n" +
                "0 -> -----\n1 -> .----\n2 -> ..---\n3 -> ...--\n4 -> ....-\n" +
                "5 -> .....\n6 -> -....\n7 -> --...\n8 -> ---..\n9 -> ----.\n";

        // Set the examples text to the TextView
        morseExamplesText.setText(morseExamples);
    }
}
