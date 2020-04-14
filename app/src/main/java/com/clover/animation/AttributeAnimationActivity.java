package com.clover.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AttributeAnimationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attribute_animation);
        initView();
    }

    private void initView() {
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_value_animator: {
                startActivity(new Intent(AttributeAnimationActivity.this, ValueAnimatorActivity.class));
            }
            break;
            case R.id.btn_object_animator: {
                startActivity(new Intent(AttributeAnimationActivity.this, ValueAnimatorActivity.class));
            }
            break;
        }
    }
}
