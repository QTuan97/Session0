package src.Rectangle;

public class Shapes {
    public static void main(String[] args) {
        aRectangle rectangle = new aRectangle(4.0, 40.0);
        System.out.println("Your frist Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
        aRectangle rectangle2 = new aRectangle(3.5,35.9);
        System.out.println("Your second Rectangle \n"+ rectangle2.display());
        System.out.println("Perimeter of the second Rectangle: "+ rectangle2.getPerimeter());
        System.out.println("Area of the second Rectangle: "+ rectangle2.getArea());

    }
}
