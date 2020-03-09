package com.example.financegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GamesMenu extends MainActivity {
    private Button game4Button, game3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_menu);

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

        rewardsButton = (ImageButton) findViewById(R.id.rewardsButton);
        rewardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRewards();
            }
        });

        game4Button = (Button) findViewById(R.id.game4button);
        game4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame4();
            }
        });

        game3Button = (Button) findViewById(R.id.game3button);
        game3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame3();
            }
        });

//        textView = (TextView) findViewById(R.id.textView);
//        textView.setText(Integer.toString(this.gameState.getPoints()));
    }

    public void openGame4() {
        Intent intent = new Intent(this, Game4.class);
        startActivity(intent);
    }

    public void openGame3() {
        Intent intent = new Intent(this, Game3.class);
        startActivity(intent);
    }
}