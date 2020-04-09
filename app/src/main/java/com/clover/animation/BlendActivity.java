package com.clover.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/**
 * Description:     混合动画
 * File Name:       BlendActivity.java
 * Crete By:        2020/4/9 15:29
 * Author:          Clover
 * Modify Date:
 * Modifier Author:
 */
public class BlendActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blend);
        initView();
    }

    private void initView() {
        image = findViewById(R.id.image);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_start: {

                AnimationSet animationSet = new AnimationSet(true);////共用动画补间
                animationSet.setDuration(1000);

                AlphaAnimation alphaAnimationFrom = new AlphaAnimation(1, 0);
                alphaAnimationFrom.setFillAfter(true);   //动画结束后保持状态
                alphaAnimationFrom.setDuration(1000);

                //参数解释分别为：旋转起始角度，旋转结束角度，相对与自身，x轴方向的一半，相对于自身，y轴方向的一半
                RotateAnimation animation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                image.startAnimation(animation);
                animation.setFillAfter(true);   //动画结束后保持状态
                animation.setDuration(1000);

                animationSet.addAnimation(alphaAnimationFrom);
                animationSet.addAnimation(animation);
                image.startAnimation(animationSet);


            }
            break;
        }
    }
}
