package src.CircleAndCylinder;

public class Circle {
    private double radius;
    private String colour;

    public Circle(){
    };

    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public String toString(){
        return "Cirlce[radius = " + this.radius + ", colour = " + this.colour + ", area = " + getArea() + "]";
    }
}
