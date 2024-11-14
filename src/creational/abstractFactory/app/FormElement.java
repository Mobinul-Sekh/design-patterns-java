package creational.abstractFactory.app;

import creational.abstractFactory.WidgetFactory;

public class FormElement {
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
