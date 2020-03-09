package com.example.financegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected Button gamesMenuButton, homeButton, marketButton, myStocksButton;
    protected TextView textView;
    protected ImageButton rewardsButton;
    protected static GameState gameState = new GameState();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

//        textView = (TextView) findViewById(R.id.textView);
//        textView.setText(Integer.toString(this.gameState.getPoints()));
    }

    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openMyStocks() {
        Intent intent = new Intent(this, Stocks.class);
        startActivity(intent);
    }

    public void openMarket() {
        Intent intent = new Intent(this, Market.class);
        startActivity(intent);
    }

    public void openGamesMenu() {
        Intent intent = new Intent(this, GamesMenu.class);
        startActivity(intent);
    }

    public void openRewards() {
        Intent intent = new Intent(this, Rewards.class);
        startActivity(intent);
    }
}


