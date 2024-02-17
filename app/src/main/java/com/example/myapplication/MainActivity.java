package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mediaPlayer=MediaPlayer.create(this,R.raw.music);
        mediaPlayer.start();
      /*  try {
            mediaPlayer.wait(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }  */

        //ImageView v=
        //EditText e= (EditText) findViewById(R.id.e);
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setImageResource(R.drawable.im);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Pagal Pagal", Toast.LENGTH_SHORT).show();

               // String str =e.getText().toString();
                //int a=Integer.parseInt(str);

                Random random=new Random();

                int b=random.nextInt(5);
                
                switch (b) {

                    case 0:
                        Toast.makeText(MainActivity.this, "Pagal", Toast.LENGTH_SHORT).show();
                        i.setImageResource(R.drawable.monkey);
                        mediaPlayer.stop();
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.monkey);
                        mediaPlayer.start();
                       // mediaPlayer.u;
                        //mediaPlayer.setDataSource(getApplicationContext(),R.raw.monkey);

                    break;

                    case 1:
                        Toast.makeText(MainActivity.this, "mahapagal", Toast.LENGTH_SHORT).show();
                        i.setImageResource(R.drawable.monkey2);
                        mediaPlayer.stop();
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.monkey);
                        mediaPlayer.start();
                        break;

                    case 2:
                        Toast.makeText(MainActivity.this, "ullu", Toast.LENGTH_SHORT).show();
                        i.setImageResource(R.drawable.cat);
                        mediaPlayer.stop();
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.cat);
                        mediaPlayer.start();
                        break;

                    case 3:
                        Toast.makeText(MainActivity.this, "murkh", Toast.LENGTH_SHORT).show();
                        i.setImageResource(R.drawable.tiger);
                        mediaPlayer.stop();
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.tiger);
                        mediaPlayer.start();
                        break;


                    case 4:
                        Toast.makeText(MainActivity.this, "vella", Toast.LENGTH_SHORT).show();
                        i.setImageResource(R.drawable.dog);
                        mediaPlayer.stop();
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.dog);
                        mediaPlayer.start();

                        break;

                    default:
                        mediaPlayer.stop();
                        break;
                        //i.setImageResource(R.drawable.im);
                }
            }
        });
        //Toast.makeText(this, "Sonu is back in android studio with a new Laptop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "I restarted it.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "I stopped it.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "I finished it.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}