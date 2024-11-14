package creational.factoryMethod;

import creational.factoryMethod.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends SharpController {
    public void listProducts() {
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }
}
