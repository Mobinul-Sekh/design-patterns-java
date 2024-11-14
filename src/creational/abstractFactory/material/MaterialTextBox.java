package creational.abstractFactory.material;

import creational.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("creating a material text box..");
    }
}
