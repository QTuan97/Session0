package src.Colorable;

public class Square extends Shape implements Colorable {
    private double side = 1.0;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea(){
        return this.side * 4;
    }

    public double getPerimeter(){
        return this.side * this.side;
    }


    @Override
    public String toString() {
        return "A Square with side = "
                + getSide() + " with the area is " + getArea()
                + " and the perimeter is " + getPerimeter();
    }

    @Override
    public void howtoColor(){
        System.out.println("Color all four sides");
    }
}
