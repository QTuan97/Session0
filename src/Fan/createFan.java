package src.Fan;

public class createFan {
    private static final int LOW = 1;
    private static final int MEDIUM = 2;
    private static final int HIGH = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String colour;

    public createFan(){
        this.speed = LOW;
        this.on = false;
        this.radius = 5.0;
        this.colour = "blue";

    }
    public void setSpeed(int speed){
        if(speed != 0){
            this.on = true;
        }
        if(speed == 1){
            this.speed = LOW;
        }
        else if (speed == 2){
            this.speed = MEDIUM;
        }
        else if(speed == 3){
            this.speed = HIGH;
        }
    }
    public int getSpeed() {
        return speed;
    }
    public void isOn(boolean status){
        this.on = status;
    }
    public boolean getStatus(){
        return on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }
    public String toInfo(){
        if(this.on){
            return "Your fan's speed is " + this.speed + " ,its colour is " + this.colour +
                    " ,its radius is " + this.radius + " and fan is on";
        }else{
            return "Your fan's colour is " + this.colour + " its radius is " + this.radius +
                    " and fan is off";
        }
    }
}
