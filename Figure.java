package com.company;

/**
 * Created by student1 on 28.10.20.
 */
abstract class Figure {
    public float x;
    public float y;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    abstract double getArea();


    abstract double getPerimeter();


}
