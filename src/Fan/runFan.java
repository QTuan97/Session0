package src.Fan;
public class runFan {
    static final int LOW = 1;
    static final int MEDIUM = 2;
    static final int HIGH = 3;
    public static void main(String[] args) {
    createFan Fan1 = new createFan();
    Fan1.setSpeed(HIGH);
    Fan1.setRadius(10.0);
    Fan1.setColour("yellow");
    System.out.println(Fan1.toInfo());
    createFan Fan2 = new createFan();
    Fan2.setSpeed(MEDIUM);
    Fan2.setRadius(5);
    Fan2.setColour("blue");
    System.out.println(Fan2.toInfo());
    }
}
