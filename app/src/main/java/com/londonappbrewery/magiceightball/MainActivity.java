package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button askButton = findViewById(R.id.askButton);

        final ImageView eight_ball = (ImageView) findViewById(R.id.eightBall);

        final int[] choicearray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magic-8-ball","Ask is pressedd");
                Random ranNumGen = new Random();
                int ranNum = ranNumGen.nextInt(5);
                eight_ball.setImageResource(choicearray[ranNum]);


            }
        });




    }
}
