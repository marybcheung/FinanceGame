package com.example.financegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SellStock extends MainActivity {
    private Button sellButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_stock);

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

        sellButton = (Button) findViewById(R.id.sell);
        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sell();
            }
        });
    }
//
    public void sell() {
        Intent intent = new Intent(this, Stocks.class);
        startActivity(intent);
    }
}
