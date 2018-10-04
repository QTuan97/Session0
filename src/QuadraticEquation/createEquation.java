package src.QuadraticEquation;

public class createEquation {
    private double a;
    private double b;
    private double c;

    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        double delta = Math.pow(this.b,2) - (4 * this.a * this.c);
        return delta;
    }
    public void getRoot(){
        if(getDiscriminant() > 0.0){
            double r1 = -this.b + Math.sqrt(getDiscriminant())/ 2* this.a;
            double r2 = -this.b - Math.sqrt(getDiscriminant())/ 2* this.a;
            System.out.println("Has 2 roots: " + r1 + " and " + r2 );
        }
        else if(getDiscriminant() == 0.0){
            double r = -this.b/2 * this.a;
            System.out.println("Has 1 root: " + r);
        }
        else{
            System.out.println("Can't solve this equation");
        }
    }
}
