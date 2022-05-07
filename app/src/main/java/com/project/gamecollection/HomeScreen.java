package com.project.gamecollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    private Button snakeButton;
    private Button pongButton;
    private Button hangmanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        snakeButton = (Button) findViewById(R.id.snake);
        snakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGame();
            }
        });



        pongButton = (Button) findViewById(R.id.pong);
        pongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGame();
            }
        });

        hangmanButton = (Button) findViewById(R.id.hangman);
        hangmanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGame();
            }
        });
    }

/*
    public void selectGame(String gameid) {

        Intent temp;

        switch (gameid) {
            case "Snake":
                temp = new Intent(this, Snake.class);
                break;
            case "Pong":
                temp = new Intent(this, Snake.class);
                break;
            case "Hangman":
                temp = new Intent(this, Snake.class);
                break;
            default:
                temp = new Intent(this, Snake.class);
                break;
        }
        startActivity(temp);
        }
*/

    private void openGame() {
        Intent intent = new Intent(this, com.project.gamecollection.Snake.class);
        startActivity(intent);
    }
}