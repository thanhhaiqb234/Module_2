package ss6.bai_tap.point2d_layer_and_point3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setGetZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
       this.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = {getX(), getY(), getZ()};
        return array;
    }

    @Override
    public String toString() {
        return "Point3d{" + "x=" + getX() + " y=" + getY() +
                " z=" + z +
                '}';
    }
}
