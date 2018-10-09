package src.Colorable;

public class testRun {
    public static void main(String[] args) {
        Shape[] shapeList = new Shape[3];
        shapeList[0] = new Square();
        shapeList[1] = new Rectangle();
        shapeList[2] = new Square(2);
        for(Shape shapes : shapeList){
            System.out.println(shapes.toString());
            if(shapes instanceof Colorable){
                ((Colorable) shapes).howtoColor();
            }
        }
    }
}
