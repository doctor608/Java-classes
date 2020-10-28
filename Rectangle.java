package com.company;

/**
 * Created by student1 on 28.10.20.
 */
public class Rectangle extends Figure {
    float height;
    float width;

    Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }


    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }




}
