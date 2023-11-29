package com.example.pract28;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView sunImageView = findViewById(R.id.sun);

        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);

        sunImageView.startAnimation(sunRiseAnimation);

        ImageView samolet = findViewById(R.id.samolet);
        Animation polets = AnimationUtils.loadAnimation(this,R.anim.polet);
        samolet.startAnimation(polets);
    }
}