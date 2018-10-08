package src.Resizeable;

public class Square extends Shape implements Resizeable{
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
    public void resize(){
        this.side = (this.side + this.side *(Math.random() * 99 + 1));
        System.out.println("A square has the length of side is " + this.side + ", the area is " + getArea() +
                ", the perimeter is " + getPerimeter());
    }
}