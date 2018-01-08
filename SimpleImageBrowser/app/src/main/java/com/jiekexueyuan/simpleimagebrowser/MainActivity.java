package com.jiekexueyuan.simpleimagebrowser;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
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


//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        String filePath = "drawable-xxxhdpi/xueba.jpg";
//        Uri uri;
//        if (Build.VERSION.SDK_INT >= 24) {
//            File file = new File(filePath);
//            Log.i("mine",file.length()+"");
//            uri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".fileprovider", new File(filePath));
//            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);//注意加上这句话
//
//        } else {
//            uri = Uri.fromFile(new File(filePath));
//        }
//        intent.setDataAndType(uri, "image/*");
//        startActivity(intent);


//        startActivity(new Intent(ImageView.ACTION));

        Intent intent = new Intent(Intent.ACTION_VIEW);
//        File imagePath = new File(Context.getFilesDir(),"images");
        File file = new File("my_images");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            Uri contentUri = FileProvider.getUriForFile(this, "com.jiekexueyuan.simpleimagebrowser.fileprovider",file);
            intent.setDataAndType(contentUri, "application/vnd.android.package-archive");
        } else {
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        }
        startActivity(intent);
    }

}
