package com.example.financegame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Game3play extends MainActivity {
    private Button rightAnsButton, wrongAnsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3play);

        rightAnsButton = (Button) findViewById(R.id.rightbee);
        rightAnsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                success();
            }
        });

        wrongAnsButton = (Button) findViewById(R.id.wrongbee);
        wrongAnsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oops();
            }
        });
    }


    public void success() {
        Intent intent = new Intent(this, Game3Correct.class);
        startActivity(intent);
    }

    public void oops() {
        Intent intent = new Intent(this, Game3Error.class);
        startActivity(intent);
    }
}
