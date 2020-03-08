package com.example.financegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Game3Error extends MainActivity {
    private Button tryAgain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3_error);

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

        tryAgain = (Button) findViewById(R.id.tryagain3);
        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryAgain();
            }
        });
    }

    public void tryAgain() {
        Intent intent = new Intent(this, Game3play.class);
        startActivity(intent);
    }
}
