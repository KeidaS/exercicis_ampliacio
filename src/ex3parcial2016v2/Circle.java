package ex3parcial2016v2;

public class Circle extends Figure {

    protected final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return Integer.toString(x) + Integer.toString(y) + Integer.toString(radius);
    }

}
