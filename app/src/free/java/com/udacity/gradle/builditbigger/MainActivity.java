package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.androidlib.JokeActivity;
import com.example.androidlib.JokeActivityLauncher;
import com.udacity.gradle.jokes.Joker;

public class MainActivity extends AppCompatActivity implements JokeActivityLauncher {
    Button btn;
    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        spinner = (ProgressBar)findViewById(R.id.progressBar1);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        new  EndpointsAsyncTask(this).execute();
        btn.setEnabled(false);
        spinner.setVisibility(View.VISIBLE);
    }

    @Override
    public void launchJokerActivity(String joke) {
        Intent i = new Intent(getApplicationContext(), JokeActivity.class);
        i.putExtra(JokeActivity.JOKE_KEY ,new Joker().getJoke());
        startActivity(i);
        btn.setEnabled(true);
        spinner.setVisibility(View.GONE);

    }
}
