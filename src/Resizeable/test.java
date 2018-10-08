package src.Resizeable;
import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        Shape[] myShapeList = new Shape[3];
        Circle circle1 = new Circle();
        Square square1 = new Square();
        Rectangle rectangle1 = new Rectangle();
        myShapeList[0] = circle1;
        myShapeList[1] = square1;
        myShapeList[2] = rectangle1;
        System.out.println("Before resize");
        for(Shape shapes : myShapeList){
            System.out.println(shapes.toString());
        };
        System.out.println("After resize");
        circle1.resize();;
        square1.resize();
        rectangle1.resize();
    }
}
