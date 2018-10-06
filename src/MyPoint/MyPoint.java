package src.MyPoint;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void getDistance(double x, double y){
        double distance = Math.sqrt(Math.pow((x - this.x),2)) + Math.pow((y - this.y),2);
        System.out.println("Your distance is " + distance);
    }
}
