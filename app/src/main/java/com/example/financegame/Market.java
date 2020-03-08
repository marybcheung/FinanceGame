package com.example.financegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Market extends MainActivity {
    private Button openMarketButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

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

        openMarketButton = (Button) findViewById(R.id.openStock);
        openMarketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewStock();
            }
        });

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(Integer.toString(this.gameState.getPoints()));
    }

    public void openNewStock() {
        Intent intent = new Intent(this, BuyStock.class);
        startActivity(intent);
    }
}
