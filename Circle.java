package com.company;

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

    public void move(float dx, float dy) {
        x = x + dx;
        y = y + dy;
    }

    public void resize(float koeff) {
        radius = radius * koeff;
    }

    public String toString() {
        return ("Circle" + "\n" + "Center: " + "(" + x + ", " + y + ")" + "\n" + "Radius: " + radius);
    }

}