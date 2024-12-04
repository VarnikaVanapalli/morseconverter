package com.example.morseconverter;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etInput, etOutput;
    private Button btnEncode, btnDecode, btnExamples;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        etInput = findViewById(R.id.etInput);
        etOutput = findViewById(R.id.etOutput);
        btnEncode = findViewById(R.id.btnEncode);
        btnDecode = findViewById(R.id.btnDecode);
        btnExamples = findViewById(R.id.btnExamples);

        // Button click listeners
        btnEncode.setOnClickListener(v -> {
            String input = etInput.getText().toString().trim();
            if (TextUtils.isEmpty(input)) {
                Toast.makeText(MainActivity.this, "Input cannot be empty", Toast.LENGTH_SHORT).show();
                return;
            }
            new Thread(() -> {
                String result = MorseConverter.encode(input);
                runOnUiThread(() -> etOutput.setText(result));
            }).start();
        });

        btnDecode.setOnClickListener(v -> {
            String input = etInput.getText().toString().trim();
            if (TextUtils.isEmpty(input)) {
                Toast.makeText(MainActivity.this, "Input cannot be empty", Toast.LENGTH_SHORT).show();
                return;
            }
            new Thread(() -> {
                String result = MorseConverter.decode(input);
                runOnUiThread(() -> etOutput.setText(result));
            }).start();
        });

        btnExamples.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MorseExamplesActivity.class);
            startActivity(intent);
        });
    }
}
