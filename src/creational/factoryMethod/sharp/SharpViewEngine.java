package creational.factoryMethod.sharp;

import creational.factoryMethod.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Hello from Sharp View Engine!";
    }
}
