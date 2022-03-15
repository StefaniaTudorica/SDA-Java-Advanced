package ro.sda.stefania.abstractclass.ex2;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (height * width) / 2;
    }

    @Override
    public double getPerimeter() {
        return 3 * width;
    }
}
