package src.Point2Dand3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){
    };

    public Point3D(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ(){
        float[] listXYZ = new float[3];
        listXYZ[0] = this.x;
        listXYZ[1] = this.y;
        listXYZ[2] = this.z;
        return listXYZ;
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }
}
