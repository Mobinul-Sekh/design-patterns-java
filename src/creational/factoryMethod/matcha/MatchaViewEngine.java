package creational.factoryMethod.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Hello from Matcha View Engine!";
    }
}
