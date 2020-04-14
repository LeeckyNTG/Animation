package com.clover.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

/**
 * Description:     渐变动画
 * File Name:       AlphaAnimationActivity.java
 * Crete By:        2020/4/9 15:29
 * Author:          Clover
 * Modify Date:     
 * Modifier Author: 
 */
public class AlphaAnimationActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_animation);
        initView();
    }

    private void initView() {
        image = findViewById(R.id.image);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_value_animator: {
                AlphaAnimation animation = new AlphaAnimation(1, 0);
                image.startAnimation(animation);
                animation.setFillAfter(true);   //动画结束后保持状态
                animation.setDuration(2000);
            }
            break;
            case R.id.btn_object_animator: {
                AlphaAnimation animation = new AlphaAnimation(0, 1);
                image.startAnimation(animation);
                animation.setFillAfter(true);
                animation.setDuration(2000);
            }
            break;
        }
    }
}
