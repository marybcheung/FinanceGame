package com.example.financegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Game3 extends MainActivity {
    private Button playButton, exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);

        homeButton = (Button) findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

        myStocksButton = (Button) findViewById(R.id.myStocksButton);
        myStocksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyStocks();
            }
        });

        marketButton = (Button) findViewById(R.id.marketButton);
        marketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMarket();
            }
        });

        gamesMenuButton = (Button) findViewById(R.id.gamesButton);
        gamesMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGamesMenu();
            }
        });

        exitButton = (Button) findViewById(R.id.exit);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToGames();
            }
        });

        playButton = (Button) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame4();
            }
        });
    }

    public void returnToGames() {
        Intent intent = new Intent(this, GamesMenu.class);
        startActivity(intent);
    }

    public void playGame4() {
        Intent intent = new Intent(this, Game3play.class);
        startActivity(intent);
    }

}
