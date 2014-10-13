package com.example.olafsoundboard.app;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import junit.framework.Test;


public class StartScreen extends ActionBarActivity {


    private MediaPlayer myPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_layout);
        getActionBar().hide();
    }

    public void playSound(View view) {

        try {
            if (myPlayer != null && myPlayer.isPlaying()) {
                myPlayer.stop();
                myPlayer.release();
            }

            switch(view.getId()){
                case R.id.Lukeybaby:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.lukey_baby);
                    break;
                case R.id.Yellow:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.yellow_and_snow);
                    break;
                case R.id.Amiright:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.am_i_right);
                    break;
                case R.id.Whatimlooking:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.what_am_i_looking_at);
                    break;
                case R.id.Lifeupsidedown:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.life_was_turned_upside_down);
                    break;
                case R.id.Unicorn:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.unicorn);
                    break;
                case R.id.Andyouare:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.and_you_are);
                    break;
                case R.id.Ilikeyoutoo:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.i_like_you_too);
                    break;
                case R.id.Yeahwhy:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.yeah_why);
                    break;
                case R.id.Stopitsven:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.stop_it_sven);
                    break;
                case R.id.Ideaofsummer:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.idea_of_summer);
                    break;
                case R.id.Bringbacksummer:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.bring_back_summer);
                    break;
                case R.id.Impaled:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.impaled);
                    break;
                case R.id.Knock:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.knock);
                    break;
                case R.id.Headsup:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.heads_up);
                    break;
                case R.id.Watchout:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.watch_out);
                    break;
                case R.id.Marshmallow:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.marshmellow);
                    break;
                case R.id.Hanginthere:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.hang_in_there_guys);
                    break;
                case R.id.Legs:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.cant_feel_legs);
                    break;
                case R.id.Grabmybutt:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.grab_my_butt);
                    break;
                case R.id.Feelbetter:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.that_feels_better);
                    break;
                case R.id.Skullorbones:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.skull_or_bones);
                    break;
                case R.id.Hescrazy:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.hes_crazy);
                    break;
                case R.id.Youhesitated:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.you_hesitated);
                    break;
                case R.id.Melting:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.worth_melting_for);
                    break;
                case R.id.Bestday:
                    myPlayer = MediaPlayer.create(getBaseContext(), R.raw.best_day);
                    break;
            }

            myPlayer.start();



        } catch (Exception ex) {

        }
    }
}
