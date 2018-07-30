package com.rohit.imageusingbitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView mImageView = findViewById(R.id.imageView);

        try {
            mImageView.setImageBitmap(BitmapFactory.decodeStream(getAssets().open("back.jpg")));
            } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
