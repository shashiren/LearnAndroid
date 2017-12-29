package com.jiekexueyuan.simpleimagebrowser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ImageView1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view1);


//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        String filePath = "/Users/stan/Desktop/ShaShiRenGithub/LearnAndroid/SimpleImageBrowser/app/src/main/res/drawable-xxxhdpi/xueba.jpg";
//        Uri uri;
//        if (Build.VERSION.SDK_INT >= 24) {
//            File file = new File(filePath);
//            Log.i("mine",file.length()+"");
//            uri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", new File(filePath));
//            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);//注意加上这句话
//
//        } else {
//            uri = Uri.fromFile(new File(filePath));
//        }
//        intent.setDataAndType(uri, "image/*");
//        startActivity(intent);
    }
}
