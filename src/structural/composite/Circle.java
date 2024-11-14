package structural.composite;

public class Circle implements Component {

    @Override
    public void render() {
        System.out.println("rendering circle!");
    }

    @Override
    public void move() {
        System.out.println("moving circle!");
    }
}
