package pack1;

public class Box {
    private double length;
    private double breadth;
    private double height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }
}
