package ro.sda.stefania.inheritance.ex1;

public class Circle extends Shape {
    private double radius;

    public Circle (double radius){
        super(Math.PI*radius*radius, 2*Math.PI*radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}


