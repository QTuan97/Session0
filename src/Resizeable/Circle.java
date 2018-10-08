package src.Resizeable;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "A circle with the radius " + getRadius() +
                " with the area is " + getArea() + " and the perimeter is "
                + getPerimeter();
    }

    @Override
    public void resize(){
       this.radius =  (this.radius + this.radius*(Math.random() * 99 + 1));
       System.out.println("A circle has the radius " + this.radius + ", the area is " + getRadius()
       + ", the perimeter is " + getPerimeter());

    }
}