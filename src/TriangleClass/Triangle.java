package src.TriangleClass;

public class Triangle extends Shape {
    private String colour;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double x, double y, double z, String colour){
        super(x,y,z);
        this.colour = colour;
    }

    public double getArea(){
        double p = (super.getSide1() + super.getSide2() + super.getSide3())/2;
        return Math.sqrt(p*(p - super.getSide1())*(p - super.getSide2())*(p - super.getSide3()));
    }

    public double getPerimeter(){
        return (super.getSide1() + super.getSide2() + super.getSide3());
    }

    @Override
    public String toString(){
        return "The triangle has the area is " + getArea() + " and the perimeter is " + getPerimeter() + " and its colour is "
                + this.colour;
    }
}
