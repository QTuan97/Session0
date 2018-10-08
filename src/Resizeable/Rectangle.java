package src.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 2.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + " and length = "
                + getLength() + " with the area is " + getArea() +
                " and the perimeter is " + getPerimeter();
    }

    @Override
    public void resize(){
        this.width = (this.width + this.width*(Math.random() * 99 + 1)/100);
        this.length = (this.length + this.length*(Math.random() * 99 + 1)/100);
        System.out.println("A square has the length of width is " + this.width + ", the length of height is "
                + this.length + ", the area is " + getArea() +
                ", the perimeter is " + getPerimeter());
    }
}