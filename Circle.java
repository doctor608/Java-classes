package com.company;

/**
 * Created by student1 on 28.10.20.
 */
public class Circle extends Figure {
    float radius;

    Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }


}
