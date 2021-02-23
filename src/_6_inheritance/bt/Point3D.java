package _6_inheritance.bt;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){
    }
    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float [] getXYZ(){
        float[]Point3D ={getX(),getY(),z};
        return Point3D;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z =z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z
                +super.toString();

    }
}
class TestPoint{
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D=new Point2D(10f,20f);
        Point3D point3D = new Point3D();
        point3D=new Point3D(15f,20f,30f);
        System.out.println(point3D);
        System.out.println(point2D);
    }
}


