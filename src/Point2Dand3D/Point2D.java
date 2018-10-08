package src.Point2Dand3D;


public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point2D(){
    };

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y){
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
        return "(" + this.x + "," + this.y + ")";
    }
}
