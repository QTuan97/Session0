package src.QuadraticEquation;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("The quadratic equation is a * x ^ 2 + b * x + c = 0");
        createEquation equation1 = new createEquation();
        equation1.setA(1.0);
        equation1.setB(2.0);
        equation1.setC(-1.0);
        System.out.println("Your quadratic equation is: " + equation1.getA() + " * x ^ 2 + " + equation1.getB() +" * x " +
                 equation1.getC() + " = 0");
        equation1.getRoot();
    }
}
