package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView counterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     counterText = findViewById(R.id.counterText);
     Button buttonIncrement = findViewById(R.id.buttonIncrement);

     buttonIncrement.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             counter ++;
             counterText.setText(String.valueOf(counter));
         }
     });
    }
}
