package sda.abstractexample;

public abstract class Shape {
    private double length;
    private double width;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
