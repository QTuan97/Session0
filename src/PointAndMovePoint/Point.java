package src.PointAndMovePoint;

public class Point {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(){
    };

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] listXY = new float[2];
        listXY[0] = this.x;
        listXY[1] = this.y;
        return listXY;
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y +")";
    }
}

