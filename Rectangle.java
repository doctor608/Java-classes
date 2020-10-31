package com.company;

public class Rectangle extends Figure implements Moveable {
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

    public void move(float dx, float dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public void resize(float koeff) {
        this.height = this.height * koeff;
        this.width = this.width * koeff;
    }

    public String toString() {
        return ("Rectangle" + "\n" + "Center: " + "(" + (x + height / 2) + ", " + (y + width / 2) + ")" + "\n" + "Height: " + height + "\n" + "Width: " + width);
    }


}