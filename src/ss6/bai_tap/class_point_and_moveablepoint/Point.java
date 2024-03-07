package ss6.bai_tap.class_point_and_moveablepoint;

public class Point {
    private float x;
    private float y;
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point(){

    }

    public float getX(){
        return x;
    }
    public float getY(){
       return y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float [] array = {x,y};
        return array;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
