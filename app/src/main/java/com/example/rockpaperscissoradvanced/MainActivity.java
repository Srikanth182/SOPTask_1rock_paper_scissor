package com.example.rockpaperscissoradvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button single,multi;
        single = findViewById(R.id.single);
        multi = findViewById(R.id.multi);
        single.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                singlePlayer();

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                multiPlayer();

            }
        });
    }
    public void singlePlayer()
    {
        Intent int1 = new Intent(this,Singleplayer.class);
        startActivity(int1);
    }
    public void multiPlayer()
    {
        Intent int2 = new Intent(this,Multiplayer.class);
        startActivity(int2);
    }
}
