package structural.composite;

public class Square implements Component {
    @Override
    public void render() {
        System.out.println("rendering square!");
    }

    @Override
    public void move() {
        System.out.println("moving square!");
    }
}
