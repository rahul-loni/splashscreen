package com.example.s_screen;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageView=findViewById(R.id.image1);
        textView=findViewById(R.id.txt);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        imageView.startAnimation(animation);
        textView.startAnimation(animation);


       Thread thread=new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   sleep(9000);
                   Intent intent =new Intent(getApplicationContext(),MainActivity.class);
                   startActivity(intent);

               }catch (InterruptedException e){
                   e.printStackTrace();

               }

           }
       });
       thread.start();
    }
}