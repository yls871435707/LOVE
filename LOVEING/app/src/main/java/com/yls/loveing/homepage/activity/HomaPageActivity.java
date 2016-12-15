package com.yls.loveing.homepage.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.yls.loveing.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


/**
 * Created by Administrator on 2016/12/12.
 */
public class HomaPageActivity extends Activity {

    @InjectView(R.id.iv_chat)
    ImageView ivChat;
    @InjectView(R.id.iv_search)
    ImageView ivSearch;
    @InjectView(R.id.viewpager)
    ViewPager viewpager;
    @InjectView(R.id.rb_homepage)
    RadioButton rbHomepage;
    @InjectView(R.id.rb_planning)
    RadioButton rbPlanning;
    @InjectView(R.id.rb_information)
    RadioButton rbInformation;
    @InjectView(R.id.rb_my)
    RadioButton rbMy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        ButterKnife.inject(this);
        rbHomepage.setChecked(true);
    }

    @OnClick({R.id.iv_chat, R.id.iv_search, R.id.rb_homepage, R.id.rb_planning, R.id.rb_information, R.id.rb_my})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_chat:
                break;
            case R.id.iv_search:
                break;
            case R.id.rb_homepage:
                break;
            case R.id.rb_planning:
                break;
            case R.id.rb_information:
                break;
            case R.id.rb_my:
                break;
        }
    }
}
