package com.rsatyavolu.nanodegree.applicationportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.widget.Toast;


public class HomeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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

    /* called when clicked on Spotify Streamer */
    public void launchSpotifyStreamer(View view) {
        buildToast("This launches Spotify Streamer").show();
    }

    /* called when clicked on Scores App */
    public void launchScoresApp(View view) {
        buildToast("This launches Scores App").show();
    }

    /* called when clicked on Library App */
    public void launchLibraryApp(View view) {
        buildToast("This launches Library App").show();
    }

    /* called when clicked on Build It Bigger */
    public void launchBuildItBigger(View view) {
        buildToast("This launches Build It Bigger").show();
    }

    /* called when clicked on XYZ Reader */
    public void launchXYZReader(View view) {
        buildToast("This launches XYZ Reader").show();
    }

    /* called when clicked on Capstone */
    public void launchCapstone(View view) {
        buildToast("This launches My Own App - Capstone").show();
    }

    private Toast buildToast(String message) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);

        return toast;
    }
}
