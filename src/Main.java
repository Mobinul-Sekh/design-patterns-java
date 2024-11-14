//import creational.abstractFactory.ant.AntWidgetFactory;
//import creational.abstractFactory.app.FormElement;
//import creational.abstractFactory.material.MaterialWidgetFactory;
//import creational.factoryMethod.ProductController;

import creational.builder.PDFDocumentBuilder;
import creational.builder.Presentation;
import creational.builder.Slide;
import creational.prototype.ContextMenu;
import creational.singleton.ConfigManager;
import structural.adapter.Image;
import structural.adapter.ImageView;
import structural.adapter._3rdPartyCaramelAdapter;
import structural.adapter._3rdPartyFilterLibrary.Caramel;
import structural.bridge.AdvancedRemoteControl;
import structural.bridge.SonyTV;
import structural.composite.Circle;
import structural.composite.Group;
import structural.composite.Shape;
import structural.composite.Square;

public class Main {
    public static void main(String[] args) {
        /*// For Factory Method Pattern, Creational.
        new ProductController();*/


        /*// For Abstract Factory Pattern, Creational.
        // new FormElement().render(new AntWidgetFactory());
        new FormElement().render(new MaterialWidgetFactory());*/


        /*// For Prototype Pattern, Creational.
        var newCircle = new ContextMenu().duplicate(new Circle());
        newCircle.render();*/


        /*// For Builder Pattern, Creational.
        var presentation = new Presentation();
        presentation.addSlide(new Slide("slide 1"));
        presentation.addSlide(new Slide("slide 2"));

        var builder = new PDFDocumentBuilder();
        presentation.export(builder);
        var pdf = builder.getPdf();*/


        /*// For Singleton Pattern, Creational.
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Mobinul");

        ConfigManager manager2 = ConfigManager.getInstance();
        // the configuration will be unchanged.
        System.out.println(manager2.get("name"));*/


        /*// For Adapter Pattern, Structural.
        var imageView = new ImageView(new Image());
        // Below line will not work as it expects a Filter interface compatible object.
        // imageView.apply(new Caramel());

        imageView.apply(new _3rdPartyCaramelAdapter(new Caramel()));*/

        /*// For Bridge Pattern, Structural.
        var remoteController = new AdvancedRemoteControl(new SonyTV());
        remoteController.turnOn();*/

        /*// For Composite Pattern, Structural.
        var group1 = new Group();
        group1.add(new Shape(new Circle()));

        var group2 = new Group();
        group2.add(new Shape(new Square()));

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();*/
    }
}