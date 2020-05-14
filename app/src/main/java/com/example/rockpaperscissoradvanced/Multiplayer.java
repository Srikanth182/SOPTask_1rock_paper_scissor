package com.example.rockpaperscissoradvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Multiplayer extends AppCompatActivity {
    Button enter_1, enter_2, play, round, newgame;
    ImageButton rock_1, rock_2, paper_1, paper_2, scissor_1, scissor_2;
    EditText name_1, name_2, rounds;
    TextView player_1, player_2, score_1, score_2;
    String Name_1, Name_2, num, s1, s2,s,s3,s4;
    int score1 = 0;
    int score2 = 0;
    int n = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);
        enter_1 = findViewById(R.id.enter_1);
        enter_2 = findViewById(R.id.enter_2);
        play = findViewById(R.id.play);
        rock_1 = findViewById(R.id.rock_1);
        rock_2 = findViewById(R.id.rock_2);
        paper_1 = findViewById(R.id.paper_1);
        paper_2 = findViewById(R.id.paper_2);
        scissor_1 = findViewById(R.id.scissor_1);
        scissor_2 = findViewById(R.id.scissor_2);
        round = findViewById(R.id.round);
        name_1 = findViewById(R.id.ename_1);
        name_2 = findViewById(R.id.ename_2);
        rounds = findViewById(R.id.erounds);
        player_1 = findViewById(R.id.player_1);
        player_2 = findViewById(R.id.player_2);
        newgame = findViewById(R.id.newgame);
        score_1 = findViewById(R.id.score_1);
        score_2 = findViewById(R.id.score_2);
        name_1.setText(" ");
        name_2.setText(" ");
        enter_1.setEnabled(false);
        enter_2.setEnabled(false);
        play.setEnabled(false);
        paper_1.setEnabled(false);
        play.setEnabled(false);
        rock_1.setEnabled(false);
        rock_2.setEnabled(false);
        paper_2.setEnabled(false);
        scissor_1.setEnabled(false);
        scissor_2.setEnabled(false);
        round.setEnabled(false);
        newgame.setEnabled(false);
        name_2.setEnabled(false);
        rounds.setEnabled(false);
        name_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Name_1 = name_1.getText().toString();
                enter_1.setEnabled(!Name_1.isEmpty());
                s3 = name_1.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        name_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Name_2 = name_2.getText().toString();
                enter_2.setEnabled(!Name_2.isEmpty());
                s4 = name_2.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        rounds.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                num = rounds.getText().toString();

                play.setEnabled(!num.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        enter_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                {
                    enter_1.setEnabled(false);
                    enter_2.setEnabled(false);
                    paper_1.setEnabled(false);
                    play.setEnabled(false);
                    rock_1.setEnabled(false);
                    rock_2.setEnabled(false);
                    paper_2.setEnabled(false);
                    scissor_1.setEnabled(false);
                    scissor_2.setEnabled(false);
                    round.setEnabled(false);
                    player_1.setText(Name_1);
                    name_1.setEnabled(false);
                    name_2.setEnabled(true);
                    rounds.setEnabled(false);
                }

            }
        });
        enter_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                {
                    enter_1.setEnabled(false);
                    enter_2.setEnabled(false);
                    paper_1.setEnabled(false);
                    play.setEnabled(false);
                    rock_1.setEnabled(false);
                    rock_2.setEnabled(false);
                    paper_2.setEnabled(false);
                    scissor_1.setEnabled(false);
                    scissor_2.setEnabled(false);
                    round.setEnabled(false);
                    player_2.setText(Name_2);
                    name_2.setEnabled(false);
                    rounds.setEnabled(true);
                }


            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int m = Integer.parseInt(rounds.getText().toString());
                if(m!=0) {
                    enter_1.setEnabled(false);
                    enter_2.setEnabled(false);
                    paper_1.setEnabled(true);
                    play.setEnabled(false);
                    rock_1.setEnabled(true);
                    rock_2.setEnabled(false);
                    paper_2.setEnabled(false);
                    scissor_1.setEnabled(true);
                    scissor_2.setEnabled(false);
                    round.setEnabled(false);
                    rounds.setEnabled(false);
                }else{
                    Toast.makeText(Multiplayer.this, "please enter rounds greater than zero", Toast.LENGTH_SHORT).show();
                }


            }
        });
        rock_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                enter_1.setEnabled(false);
                enter_2.setEnabled(false);
                paper_1.setEnabled(false);
                play.setEnabled(false);
                rock_1.setEnabled(false);
                rock_2.setEnabled(true);
                paper_2.setEnabled(true);
                scissor_1.setEnabled(false);
                scissor_2.setEnabled(true);
                round.setEnabled(false);
                rounds.setEnabled(false);
                s1 = "rock";


            }
        });
        paper_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                enter_1.setEnabled(false);
                enter_2.setEnabled(false);
                paper_1.setEnabled(false);
                play.setEnabled(false);
                rock_1.setEnabled(false);
                rock_2.setEnabled(true);
                paper_2.setEnabled(true);
                scissor_1.setEnabled(false);
                scissor_2.setEnabled(true);
                round.setEnabled(false);
                rounds.setEnabled(false);
                s1 = "paper";


            }
        });
        scissor_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                enter_1.setEnabled(false);
                enter_2.setEnabled(false);
                paper_1.setEnabled(false);
                play.setEnabled(false);
                rock_1.setEnabled(false);
                rock_2.setEnabled(true);
                paper_2.setEnabled(true);
                scissor_1.setEnabled(false);
                scissor_2.setEnabled(true);
                round.setEnabled(false);
                rounds.setEnabled(false);
                s1 = "scissor";


            }
        });
        rock_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                enter_1.setEnabled(false);
                enter_2.setEnabled(false);
                paper_1.setEnabled(false);
                play.setEnabled(false);
                rock_1.setEnabled(false);
                rock_2.setEnabled(false);
                paper_2.setEnabled(false);
                scissor_1.setEnabled(false);
                scissor_2.setEnabled(false);


                rounds.setEnabled(false);
                round.setText("Next round");
                s2 = "rock";
                fun();
                Toast.makeText(Multiplayer.this, s, Toast.LENGTH_SHORT).show();



            }
        });
        paper_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                enter_1.setEnabled(false);
                enter_2.setEnabled(false);
                paper_1.setEnabled(false);
                play.setEnabled(false);
                rock_1.setEnabled(false);
                rock_2.setEnabled(false);
                paper_2.setEnabled(false);
                scissor_1.setEnabled(false);
                scissor_2.setEnabled(false);


                rounds.setEnabled(false);
                round.setText("Next round");
                s2 = "paper";
                fun();
                Toast.makeText(Multiplayer.this, s, Toast.LENGTH_SHORT).show();


            }
        });
        scissor_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                enter_1.setEnabled(false);
                enter_2.setEnabled(false);
                paper_1.setEnabled(false);
                play.setEnabled(false);
                rock_1.setEnabled(false);
                rock_2.setEnabled(false);
                paper_2.setEnabled(false);
                scissor_1.setEnabled(false);
                scissor_2.setEnabled(false);


                rounds.setEnabled(false);
                round.setText("Next round");
                s2 = "scissor";
                fun();
                Toast.makeText(Multiplayer.this, s, Toast.LENGTH_SHORT).show();



            }
        });
        round.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                enter_1.setEnabled(false);
                enter_2.setEnabled(false);
                paper_1.setEnabled(true);
                play.setEnabled(false);
                rock_1.setEnabled(true);
                rock_2.setEnabled(false);
                paper_2.setEnabled(false);
                scissor_1.setEnabled(true);
                scissor_2.setEnabled(false);


                rounds.setEnabled(false);
                round.setText("Next round");






            }
        });
        newgame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                enter_1.setEnabled(false);
                enter_2.setEnabled(false);
                paper_1.setEnabled(false);
                play.setEnabled(false);
                rock_1.setEnabled(false);
                rock_2.setEnabled(false);
                paper_2.setEnabled(false);
                scissor_1.setEnabled(false);
                scissor_2.setEnabled(false);
                round.setEnabled(false);
                name_1.setEnabled(true);
                name_2.setEnabled(true);
                rounds.setEnabled(true);
                player_1.setText(" ");
                player_2.setText(" ");
                score_1.setText("score:"+0);
                score_2.setText("score:"+0);
                name_1.setText("");
                name_2.setText("");
                rounds.setText("");
                score1=0;
                score2=0;
                n=1;


            }
        });



    }

    public String fun() {
        int m = Integer.parseInt(rounds.getText().toString());

        if(n<m) {
            round.setEnabled(true);
            if (s1 == s2) {
                s = "draw";
            } else if (s1 == "rock" && s2 == "scissor") {
                s = "Rock beats scissor";
                score1++;
                score_1.setText("Score:" + score1);
            } else if (s1 == "rock" && s2 == "paper") {
                s = "Paper wraps rock";
                score2++;
                score_2.setText("Score:" + score2);
            } else if (s1 == "paper" && s2 == "scissor") {
                s = "Scissor cuts paper";
                score2++;
                score_2.setText("Score:" + score2);
            } else if (s1 == "paper" && s2 == "rock") {
                s = "Paper wraps rock";
                score1++;
                score_1.setText("Score:" + score1);
            } else if (s1 == "scissor" && s2 == "rock") {
                s = "Rock beats scissor";
                score2++;
                score_2.setText("Score:" + score2);
            } else if (s1 == "scissor" && s2 == "paper") {
                s = "Scissor cuts paper";
                score1++;
                score_1.setText("Score:" + score1);
            }
            n++;



        }
        else if(n==m){
            if (s1 == s2) {

            } else if (s1 == "rock" && s2 == "scissor") {

                score1++;
                score_1.setText("Score:" + score1);
            } else if (s1 == "rock" && s2 == "paper") {

                score2++;
                score_2.setText("Score:" + score2);
            } else if (s1 == "paper" && s2 == "scissor") {
                score2++;
                score_2.setText("Score:" + score2);
            } else if (s1 == "paper" && s2 == "rock") {

                score1++;
                score_1.setText("Score:" + score1);
            } else if (s1 == "scissor" && s2 == "rock") {

                score2++;
                score_2.setText("Score:" + score2);
            } else if (s1 == "scissor" && s2 == "paper") {

                score1++;
                score_1.setText("Score:" + score1);
            }
            if(score1>score2){
                s = "The winner is  "+s3;
                newgame.setEnabled(true);
                round.setEnabled(false);
            }else if(score1<score2){
                s = "The winner is "+s4;
                newgame.setEnabled(true);
                round.setEnabled(false);
            }else if(score1==score2){
                s="draw";
                newgame.setEnabled(true);
                round.setEnabled(false);
            }

        }

        return s;



    }
}
