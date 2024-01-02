package com.example.imageview_1;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView img;
    Random rd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        img = findViewById(R.id.img1);

    }

    public void pressed(View view) {
        int num = rd.nextInt(3)+1;
        btn.setText(""+num);
        if (num == 1)
            img.setImageResource(R.drawable.cat);
        if (num == 2)
            img.setImageResource(R.drawable.dog);
        if (num == 3)
            img.setImageResource(R.drawable.parrot);
    }
}