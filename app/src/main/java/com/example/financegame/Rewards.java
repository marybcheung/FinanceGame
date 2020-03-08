package com.example.financegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Rewards extends MainActivity {
    private Button redeemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_rewards);

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

            redeemButton = (Button) findViewById(R.id.redeemmcd);
            redeemButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    redeemCoupon();
                }
            });
    }

    public void redeemCoupon() {
        Intent intent = new Intent(this, RedeemedCoupon.class);
        startActivity(intent);
    }
}
