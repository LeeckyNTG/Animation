package com.clover.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

/**
 * Description:     缩放动画
 * File Name:       ScaleAnimationActivity.java
 * Crete By:        2020/4/9 15:30
 * Author:          Clover
 * Modify Date:     
 * Modifier Author: 
 */
public class ScaleAnimationActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_animation);
        initView();
    }

    private void initView() {
        image = findViewById(R.id.image);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_value_animator: {
                ScaleAnimation animation = new ScaleAnimation(1, 0.5f, 1, 0.5f);
                image.startAnimation(animation);
                animation.setFillAfter(true);   //动画结束后保持状态
                animation.setDuration(2000);
            }
            break;
            case R.id.btn_object_animator: {
                ScaleAnimation animation = new ScaleAnimation(0.5f, 1, 0.5f, 1);
                image.startAnimation(animation);
                animation.setFillAfter(true);   //动画结束后保持状态
                animation.setDuration(2000);
            }
            break;
        }
    }
}
