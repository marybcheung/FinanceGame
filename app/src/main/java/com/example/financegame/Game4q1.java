package com.example.financegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Game4q1 extends MainActivity {
    private Button rightAnsButton, wrongAnsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game4q1);

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

        rightAnsButton = (Button) findViewById(R.id.rightans);
        rightAnsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                success();
            }
        });

        wrongAnsButton = (Button) findViewById(R.id.wrongans);
        wrongAnsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oops();
            }
        });

    }

    public void success() {
        Intent intent = new Intent(this, Success.class);
        startActivity(intent);
    }

    public void oops() {
        Intent intent = new Intent(this, Oops.class);
        startActivity(intent);
    }
}
