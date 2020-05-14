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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Singleplayer extends AppCompatActivity {
    int n=1;
    int score1=0;
    int score2=0;
    Button Round;
   RelativeLayout layout;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer);
        final EditText name,rounds;
        final Button enter,play,newgame;
        final ImageButton rock,paper,scissor;

        final TextView pscore,cscore;
         name =findViewById(R.id.ename);
        rounds=findViewById(R.id.eround);
        rock =findViewById(R.id.rock);
        paper=findViewById(R.id.paper);
        scissor=findViewById(R.id.scissor);
        enter=findViewById(R.id.enter1);
        play=findViewById(R.id.play);
        newgame=findViewById(R.id.newgame);
        pscore=findViewById(R.id.pscore);
        cscore=findViewById(R.id.cscore);
        Round=findViewById(R.id.next);
        rock.setEnabled(false);
        paper.setEnabled(false);
        scissor.setEnabled(false);
        enter.setEnabled(false);
        play.setEnabled(false);
        newgame.setEnabled(false);
        Round.setEnabled(false);
        rounds.setEnabled(false);
        layout=findViewById(R.id.layout);

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
              String string =name.getText().toString();
              enter.setEnabled(!string.isEmpty());
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
                String string =rounds.getText().toString();
                play.setEnabled(!string.isEmpty());


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rounds.setEnabled(true);
                TextView player = findViewById(R.id.player);
                EditText Name =findViewById(R.id.ename);
                String string =Name.getText().toString();
                player.setText(string);
                Name.setEnabled(false);
                enter.setEnabled(false);
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rock.setEnabled(true);
                paper.setEnabled(true);
                scissor.setEnabled(true);
                rounds.setEnabled(false);
                play.setEnabled(false);
            }
        });
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String message =fun("rock");
                Toast.makeText(Singleplayer.this, message, Toast.LENGTH_SHORT).show();

                rock.setEnabled(false);
                paper.setEnabled(false);
                scissor.setEnabled(false);
            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message=fun("paper");
                Toast.makeText(Singleplayer.this,message, Toast.LENGTH_SHORT).show();

                rock.setEnabled(false);
                paper.setEnabled(false);
                scissor.setEnabled(false);
            }
        });
        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message= fun("scissor");
                Toast.makeText(Singleplayer.this, message, Toast.LENGTH_SHORT).show();

                rock.setEnabled(false);
                paper.setEnabled(false);
                scissor.setEnabled(false);
            }
        });
        Round.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Round.setEnabled(false);
                rock.setEnabled(true);
                paper.setEnabled(true);
                scissor.setEnabled(true);
                layout.setBackgroundColor(Color.parseColor("#02e8fb"));
                TextView cChoice = findViewById(R.id.Computerchoice);
                cChoice.setText("Computerchoice:");
            }
        });
        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Round.setEnabled(false);
                rock.setEnabled(false);
                paper.setEnabled(false);
                scissor.setEnabled(false);
                pscore.setText("playerscore:0");
                cscore.setText("computerscore:0");
                name.setText("");
                rounds.setText("");
                name.setEnabled(true);
                n=1;
                score1=0;
                score2=0;
                layout.setBackgroundColor(Color.parseColor("#02e8fb"));
                TextView cChoice = findViewById(R.id.Computerchoice);
                cChoice.setText("Computerchoice:");


            }
        });
    }
    public String fun(String pchoice){
        TextView Hscore,Cscore;
        Hscore = findViewById(R.id.pscore);
        Cscore = findViewById(R.id.cscore);
        EditText name = findViewById(R.id.ename);
        String Name = name.getText().toString();
        Button newgame =findViewById(R.id.newgame);
       EditText round = findViewById(R.id.eround);
        Button Nextround = findViewById(R.id.next);
       int m =Integer.parseInt(round.getText().toString());

        String s="";
        String cchoice = "";
        Random r = new Random();
        int i = r.nextInt(3)+1;
        if (i==1){
            cchoice = "rock";
        }else if(i==2){
            cchoice = "paper";
        }else if(i==3){
            cchoice="scissor";
        }
        if(n<m) {
            Round.setEnabled(true);
            if (pchoice == "rock" && cchoice == "rock") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "draw";
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.parseColor("#02e8fb"));
            } else if (pchoice == "paper" && cchoice == "paper") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "draw";
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.parseColor("#02e8fb"));
            } else if (pchoice == "scissor" && cchoice == "scissor") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "draw";
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.parseColor("#02e8fb"));
            } else if (pchoice == "rock" && cchoice == "paper") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Paper wraps rock";
                score2++;
                layout.setBackgroundColor(Color.RED);
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
            } else if (pchoice == "rock" && cchoice == "scissor") {

                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Rock beats scissor";
                score1++;
                layout.setBackgroundColor(Color.GREEN);
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
            } else if (pchoice == "paper" && cchoice == "rock") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Paper wraps rock";
                score1++;
                layout.setBackgroundColor(Color.GREEN);
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
            } else if (pchoice == "paper" && cchoice == "scissor") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Scissor cuts paper";
                score2++;
                layout.setBackgroundColor(Color.RED);
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
            } else if (pchoice == "scissor" && cchoice == "rock") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Rock beats scissor";
                score2++;
                layout.setBackgroundColor(Color.RED);
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
            } else if (pchoice == "scissor" && cchoice == "paper") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Scissor cuts paper";
                score1++;
                layout.setBackgroundColor(Color.GREEN);
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);

            }
            n++;
        }else if(n==m){

            if (pchoice == "rock" && cchoice == "rock") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "draw";
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.parseColor("#02e8fb"));



            } else if (pchoice == "paper" && cchoice == "paper") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "draw";
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.parseColor("#02e8fb"));

            } else if (pchoice == "scissor" && cchoice == "scissor") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "draw";
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.parseColor("#02e8fb"));

            } else if (pchoice == "rock" && cchoice == "paper") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Paper wraps rock";
                score2++;
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.RED);

            } else if (pchoice == "rock" && cchoice == "scissor") {

                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Rock beats scissor";
                score1++;
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.GREEN);

            } else if (pchoice == "paper" && cchoice == "rock") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Paper wraps rock";
                score1++;
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.GREEN);

            } else if (pchoice == "paper" && cchoice == "scissor") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Scissor cuts paper";
                score2++;
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.RED);

            } else if (pchoice == "scissor" && cchoice == "rock") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Rock beats scissor";
                score2++;
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.RED);

            } else if (pchoice == "scissor" && cchoice == "paper") {
                TextView Cchoice = findViewById(R.id.Computerchoice);
                Cchoice.setText("Computer choice: " + cchoice);
                s = "Scissor cuts paper";
                score1++;
                Hscore.setText(Name+"score:"+score1);
                Cscore.setText("Computerscore: "+score2);
                layout.setBackgroundColor(Color.GREEN);

            }
            if(score1>score2){
                s = "The winner is "+Name;
                newgame.setEnabled(true);
                Round.setEnabled(false);
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
                layout.setBackgroundColor(Color.GREEN);
            }else  if(score1<score2){
                s="The winner is Computer";
                newgame.setEnabled(true);
                Round.setEnabled(false);
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
                layout.setBackgroundColor(Color.RED);
            }else if(score1==score2){
                s= "The game is draw";
                newgame.setEnabled(true);
                Round.setEnabled(false);
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
                layout.setBackgroundColor(Color.parseColor("#02e8fb"));
            }


        }
        return s;
    }
}
