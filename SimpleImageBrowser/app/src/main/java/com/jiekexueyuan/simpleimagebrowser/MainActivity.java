package com.jiekexueyuan.simpleimagebrowser;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//
//        File file = new File("drawable-xxxhdpi/xueba.jpg");
//        Intent i = new Intent(Intent.ACTION_VIEW);
//        Uri mUri = Uri.parse("file://"+file.getPath());
//        i.setDataAndType(mUri, "image/*");
//        startActivity(i);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String filePath = "drawable-xxxhdpi/xueba.jpg";
        Uri uri;
        if (Build.VERSION.SDK_INT >= 24) {
            File file = new File(filePath);
            Log.i("mine",file.length()+"");
            uri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", new File(filePath));
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);//注意加上这句话

        } else {
            uri = Uri.fromFile(new File(filePath));
        }
        intent.setDataAndType(uri, "image/*");
        startActivity(intent);

//        startActivity(new Intent(ImageView.ACTION));


    }
}
