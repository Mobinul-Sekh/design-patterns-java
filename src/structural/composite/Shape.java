package structural.composite;

public class Shape implements Component {
    private final Component shape;

    public Shape(Component shape) {
        this.shape = shape;
    }

    @Override
    public void render() {
        shape.render();
    }

    @Override
    public void move() {
        shape.move();
    }
}
