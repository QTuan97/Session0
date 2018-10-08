package src.CircleAndCylinder;

public class Cynlinder extends Circle{
    private double height;

    public Cynlinder(){
    }

    public Cynlinder(double height){
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString(){
        return "Cynlinder[" + super.toString() + ", volume = " + getVolume() + "]";
    }
}

