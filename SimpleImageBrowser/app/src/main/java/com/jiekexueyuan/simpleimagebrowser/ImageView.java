package com.jiekexueyuan.simpleimagebrowser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ImageView extends AppCompatActivity {

    public static final String ACTION = "com.jiekexueyuan.simpleimagebrowser.intent.action.ImageView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);


    }

}
