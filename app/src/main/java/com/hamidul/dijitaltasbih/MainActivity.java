package com.hamidul.dijitaltasbih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    ImageButton bAdd,bReset;
    int count = 0;

    TextView git,git2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.black));
        }


        tvDisplay = findViewById(R.id.tvDisplay);
        bAdd = findViewById(R.id.bAdd);
        bReset = findViewById(R.id.bReset);


        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                tvDisplay.setText(""+count);

            }
        });

        bReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count = 0;
                tvDisplay.setText(""+count);

            }
        });




    }
}