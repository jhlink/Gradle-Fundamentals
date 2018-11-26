package com.example.oliverh.jokedisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NewJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity_main);

        String joke = getIntent().getStringExtra("JOKE_TEXT");
        TextView textView = findViewById(R.id.jke_special);
        textView.setText(joke);

    }

}
