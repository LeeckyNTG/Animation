package com.clover.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ObjectAnimatorActivity extends AppCompatActivity {

    private ImageView image;

    private ViewObjectAnimator view;

    private ObjectAnimator animatorAlpha;

    private ObjectAnimator animatorRotation;

    private ObjectAnimator animatorTranslationX;

    private ObjectAnimator animatorTranslationY;

    private ObjectAnimator animatorScaleX;

    private ObjectAnimator animatorScaleY;

    private ObjectAnimator animColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);
        initView();
    }

    private void initView() {
        image = findViewById(R.id.image);

        view = findViewById(R.id.view);


        animatorAlpha = ObjectAnimator.ofFloat(image, "alpha", 1f, 0f, 1f);
        animatorAlpha.setDuration(5000);
        animatorAlpha.start();

        animatorRotation = ObjectAnimator.ofFloat(image, "rotation", 0f, 360f);
        animatorRotation.setDuration(5000);
        animatorRotation.start();

        float curTranslationX = image.getTranslationX();
        animatorTranslationX = ObjectAnimator.ofFloat(image, "translationX", curTranslationX, curTranslationX + 300, curTranslationX);
        animatorTranslationX.setDuration(5000);
        animatorTranslationX.start();

        float curTranslationY = image.getTranslationY();
        animatorTranslationY = ObjectAnimator.ofFloat(image, "translationY", curTranslationY, curTranslationY + 300, curTranslationY);
        animatorTranslationY.setDuration(5000);
        animatorTranslationY.start();

        animatorScaleX = ObjectAnimator.ofFloat(image, "scaleX", 1f, 3f, 1f);
        animatorScaleX.setDuration(5000);
        animatorScaleX.start();

        animatorScaleY = ObjectAnimator.ofFloat(image, "scaleY", 1f, 3f, 1f);
        animatorScaleY.setDuration(5000);
        animatorScaleY.start();


        animColor = ObjectAnimator.ofObject(view,"color",new ColorEvaluator(),"#0000FF","#FF0000");
        animColor.setDuration(5000);
        animColor.start();

    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_start: {
                animatorAlpha.start();
                animatorRotation.start();
                animatorTranslationX.start();
                animatorScaleX.start();
            }
            break;
            case R.id.btn_auto_view: {
                animColor.start();
            }
            break;
        }
    }

}
