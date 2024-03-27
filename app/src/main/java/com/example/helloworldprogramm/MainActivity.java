package com.example.helloworldprogramm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextAnswer = findViewById(R.id.editTextAnswer);
        Button answerButton = findViewById(R.id.answerButton);
        TextView correctText = findViewById(R.id.correctAnswer);
        TextView incorrectText = findViewById(R.id.incorrectAnswer);
        TextView secretAnswer = findViewById(R.id.secretAnswer);


        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editTextAnswer.getText().toString();
                if (text.equals("993")) {
                    incorrectText.setVisibility(View.GONE);
                    correctText.setVisibility(View.VISIBLE);
                } else if (text.equalsIgnoreCase("жигуль")) {
                    secretAnswer.setVisibility(View.VISIBLE);
                } else {
                    incorrectText.setVisibility(View.VISIBLE);
                    correctText.setVisibility(View.GONE);
                }
            }
        });
    }
}