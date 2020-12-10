package generics;

// Generic Class
// (x, y)
class Point3<T> {
    private T x;
    private T y;


    public Point3(T x, T y){
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

}

class Main4 {
    public static void main(String[] args) {
        Point3<Integer> point = new Point3(2,3);
        Point3<Float> point2 = new Point3<Float>(1.1f,2.3f);
    }
}
