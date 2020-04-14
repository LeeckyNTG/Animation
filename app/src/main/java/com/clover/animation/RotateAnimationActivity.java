package com.clover.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;


/**
 * Description:     旋转动画
 * File Name:       RotateAnimationActivity.java
 * Crete By:        2020/4/9 15:30
 * Author:          Clover
 * Modify Date:     
 * Modifier Author: 
 */
public class RotateAnimationActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_animation);
        initView();
    }

    private void initView() {
        image = findViewById(R.id.image);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_value_animator: {
                //参数解释分别为：旋转起始角度，旋转结束角度，相对与自身，x轴方向的一半，相对于自身，y轴方向的一半
                RotateAnimation animation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                image.startAnimation(animation);
                animation.setFillAfter(true);   //动画结束后保持状态
                animation.setDuration(2000);
            }
            break;
        }
    }
}
