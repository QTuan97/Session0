package src.PointAndMovePoint;

public class MovablePoint extends Point {
    private float XSpeed = 0.0f;
    private float YSpeed = 0.0f;

    public MovablePoint(float x, float y, float XSpeed, float YSpeed){
        this.x = x;
        this.y = y;
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public MovablePoint(float XSpeed, float YSpeed){
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public MovablePoint(){
    };

    public void setXSpeed(float XSpeed) {
        this.XSpeed = XSpeed;
    }

    public float getXSpeed() {
        return XSpeed;
    }

    public void setYSpeed(float YSpeed) {
        this.YSpeed = YSpeed;
    }

    public float getYSpeed() {
        return YSpeed;
    }

    public void setSpeed(float XSpeed, float YSpeed){
        this.YSpeed = YSpeed;
        this.XSpeed = XSpeed;
    }

    public float[] getSpeed(){
        float[] speed = new float[2];
        speed[0] = this.XSpeed;
        speed[1] = this.YSpeed;
        return speed;
    }

    public String move(){
        return "New position is: " + (super.getX() + this.XSpeed) + "," + (super.getY() + this.YSpeed);
    }

    @Override
    public String toString(){
        return "(" + super.getX() + "," + super.getY() +"), speed =(" + this.XSpeed + "," + this.YSpeed + ")";
    }
}
