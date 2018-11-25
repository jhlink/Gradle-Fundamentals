package com.udacity.gradle.flavorspecificactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke);

        TextView tvJoke = (TextView) findViewById(R.id.tv_jokeText);
        tvJoke.setText("This is a great joke!");
    }

}
