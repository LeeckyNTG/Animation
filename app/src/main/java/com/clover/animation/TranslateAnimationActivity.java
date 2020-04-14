package com.clover.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/**
 * Description:     移动动画
 * File Name:       TranslateAnimationActivity.java
 * Crete By:        2020/4/9 15:30
 * Author:          Clover
 * Modify Date:
 * Modifier Author:
 */
public class TranslateAnimationActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_animation);
        initView();
    }

    private void initView() {
        image = findViewById(R.id.image);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_value_animator: {
                //起始x轴，最终x轴，起始y轴，最终y轴
                TranslateAnimation animation = new TranslateAnimation(0, 80, 0, 80);
                image.startAnimation(animation);
                animation.setFillAfter(true);   //动画结束后保持状态
                animation.setDuration(2000);
            }
            break;
            case R.id.btn_object_animator: {
                TranslateAnimation animation = new TranslateAnimation(80, 0, 80, 0);
                image.startAnimation(animation);
                animation.setFillAfter(true);   //动画结束后保持状态
                animation.setDuration(2000);
            }
            break;
        }
    }
}
