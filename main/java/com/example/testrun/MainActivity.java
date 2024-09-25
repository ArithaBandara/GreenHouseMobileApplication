package com.example.testrun;

import android.graphics.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.background);
        Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.home);
        Home home=new Home(originalBitmap, this);
        Bitmap finalMap=home.combineBoth();
        imageView.setImageBitmap(finalMap);
        home.centerFlower(finalMap.getHeight(),this);
    }
}