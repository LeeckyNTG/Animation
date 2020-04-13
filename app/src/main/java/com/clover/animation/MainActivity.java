package com.clover.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {

        switch (view.getId()) {
            case R.id.btn_alpha_animation:
                startActivity(new Intent(this, AlphaAnimationActivity.class));
                break;
            case R.id.btn_rotate_animation:
                startActivity(new Intent(this, RotateAnimationActivity.class));
                break;
            case R.id.btn_translate_animation:
                startActivity(new Intent(this, TranslateAnimationActivity.class));
                break;
            case R.id.btn_scale_animation:
                startActivity(new Intent(this, ScaleAnimationActivity.class));
                break;
            case R.id.btn_blend_animation:
                startActivity(new Intent(this, BlendActivity.class));
                break;
            case R.id.btn_attribute_animation:
                startActivity(new Intent(this, AttributeAnimationActivity.class));
                break;
        }
    }
}
