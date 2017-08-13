package com.example.androidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "joke_key";

    String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_avtivity);
        joke = getIntent().getExtras().getString(JOKE_KEY);
        ((TextView) findViewById(R.id.joke_txt)).setText(joke);

    }
}
