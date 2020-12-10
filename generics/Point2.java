package generics;

// Generic Class
// (x, y)
class Point4<X, Y> {
    private X x;
    private Y y;

    public Point4(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public void setX(X x) {
        this.x = x;
    }

    public void setY(Y y) {
        this.y = y;
    }
}

class Main3 {
    public static void main(String[] args) {
        Point4<Integer,Float> point = new Point4(4,5.5f);
    }
}
