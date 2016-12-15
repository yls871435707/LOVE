package com.yls.loveing;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.yls.loveing.homepage.activity.HomaPageActivity;

import java.io.IOException;
import java.io.InputStream;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @InjectView(R.id.btn_immediately)
    Button btnImmediately;
    @InjectView(R.id.iv_immediately)
    ImageView ivImmediately;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        getbg();
        setTTF();
    }

    @OnClick(R.id.btn_immediately)
    public void onClick() {
        Intent intent = new Intent(this, HomaPageActivity.class);
        startActivity(intent);
        finish();
    }

    public void getbg() {
        AssetManager assetManager = this.getAssets();
        try {
            InputStream is = assetManager.open("img/guide_page.jpg");
            ivImmediately.setImageBitmap(BitmapFactory.decodeStream(is));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setTTF() {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/huawenxingkai.ttf");
        btnImmediately.setTypeface(typeface);
    }
}
