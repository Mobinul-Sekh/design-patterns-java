package creational.prototype;

public class Circle implements Shape {
    private int radius;

    @Override
    public void render() {
        System.out.println("rendering a circle..");
    }

    @Override
    public Shape clone() {
        Circle newCircle = new Circle();
        newCircle.setRadius(radius);
        return newCircle;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
