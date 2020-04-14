package com.clover.animation;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ValueAnimatorActivity extends AppCompatActivity {

    private ImageView image;
    private ViewObjectAnimator view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);
        initView();
    }

    private void initView() {
        image = findViewById(R.id.image);
        view = findViewById(R.id.view);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_of_int_start: {
                ofInt(100, 0);
            }
            break;
            case R.id.btn_of_float: {
                ofFloat(0, 100);
            }
            break;
            case R.id.btn_of_object: {
                ofObject();
            }
            break;
        }
    }

    private void ofObject() {
        view.restart();
    }

    private void ofInt(int start, int end) {

        // 步骤1：设置动画属性的初始值 & 结束值
        // ofInt（）作用有两个
        // 1. 创建动画实例
        // 2. 将传入的多个Int参数进行平滑过渡:此处传入0和1,表示将值从0平滑过渡到1
        // 如果传入了3个Int参数 a,b,c ,则是先从a平滑过渡到b,再从b平滑过渡到C，以此类推
        // ValueAnimator.ofInt()内置了整型估值器,直接采用默认的.不需要设置，即默认设置了如何从初始值 过渡到 结束值
        // 关于自定义插值器我将在下节进行讲解
        // 下面看看ofInt()的源码分析 ->>关注1
        ValueAnimator anim = ValueAnimator.ofInt(start, end);
        //步骤2：设置动画的播放各种属性
        anim.setDuration(2000);//设置动画延迟播放时间
        anim.setRepeatCount(1);//设置动画重复播放次数 = 重放次数+1，当设置播放次数为ValueAnimator.INFINITE时,动画无限重复
        // 设置重复播放动画模式
        // ValueAnimator.RESTART(默认):正序重放
        // ValueAnimator.REVERSE:倒序回放
        anim.setRepeatMode(ValueAnimator.RESTART);
        // 步骤3：将改变的值手动赋值给对象的属性值：通过动画的更新监听器
        // 设置 值的更新监听器
        // 即：值每次改变、变化一次,该方法就会被调用一次
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Integer currentValue = (Integer) animation.getAnimatedValue();
                // 获得改变后的值
                System.out.println(currentValue);
                // 输出改变后的值
                // 步骤4：将改变后的值赋给对象的属性值，下面会详细说明
                image.setAlpha((float)currentValue / 100f);
                // 步骤5：刷新视图，即重新绘制，从而实现动画效果
                image.setRotation((float)currentValue * 3.6f);
                image.requestLayout();
            }
        });
        anim.start();
        // 启动动画
    }

    private void ofFloat(float start, float end) {

        // 步骤1：设置动画属性的初始值 & 结束值
        // ofInt（）作用有两个
        // 1. 创建动画实例
        // 2. 将传入的多个Int参数进行平滑过渡:此处传入0和1,表示将值从0平滑过渡到1
        // 如果传入了3个Int参数 a,b,c ,则是先从a平滑过渡到b,再从b平滑过渡到C，以此类推
        // ValueAnimator.ofInt()内置了整型估值器,直接采用默认的.不需要设置，即默认设置了如何从初始值 过渡到 结束值
        // 关于自定义插值器我将在下节进行讲解
        // 下面看看ofInt()的源码分析 ->>关注1
        ValueAnimator anim = ValueAnimator.ofFloat(start, end);
        //步骤2：设置动画的播放各种属性
        anim.setDuration(2000);//设置动画延迟播放时间
        anim.setRepeatCount(1);//设置动画重复播放次数 = 重放次数+1，当设置播放次数为ValueAnimator.INFINITE时,动画无限重复
        // 设置重复播放动画模式
        // ValueAnimator.RESTART(默认):正序重放
        // ValueAnimator.REVERSE:倒序回放
        anim.setRepeatMode(ValueAnimator.RESTART);
        // 步骤3：将改变的值手动赋值给对象的属性值：通过动画的更新监听器
        // 设置 值的更新监听器
        // 即：值每次改变、变化一次,该方法就会被调用一次
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Float currentValue = (Float) animation.getAnimatedValue();
                // 获得改变后的值
                System.out.println(currentValue);
                // 输出改变后的值
                // 步骤4：将改变后的值赋给对象的属性值，下面会详细说明
                image.setAlpha((float) currentValue / 100f);
                // 步骤5：刷新视图，即重新绘制，从而实现动画效果
                image.setRotation((float) currentValue * 3.6f);
                image.requestLayout();
            }
        });
        anim.start();
        // 启动动画
    }

}
