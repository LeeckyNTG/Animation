package com.clover.animation;

import android.animation.TypeEvaluator;


/**
 * Description:     估值器
 * File Name:       PointEvaluator.java
 * Crete By:        2020/4/14 15:10
 * Author:          Clover
 * Modify Date:
 * Modifier Author:
 */
public class PointEvaluator implements TypeEvaluator {


    /**
     * @param fraction   表示动画完成度（根据它来计算当前动画的值）
     * @param startValue 动画的初始值
     * @param endValue   动画的结束值
     * @return
     */
    @Override
    public Object evaluate(float fraction, Object startValue, Object endValue) {

        // 将动画初始值startValue 和 动画结束值endValue 强制类型转换成Point对象
        Point startPoint = (Point) startValue;
        Point endPoint = (Point) endValue;

        // 根据fraction来计算当前动画的x和y的值
        float x = startPoint.getX() + fraction * (endPoint.getX() - startPoint.getX());
        float y = startPoint.getY() + fraction * (endPoint.getY() - startPoint.getY());

        // 将计算后的坐标封装到一个新的Point对象中并返回
        Point point = new Point(x, y);

        return point;
    }
}
