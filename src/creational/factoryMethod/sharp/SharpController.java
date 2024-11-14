package creational.factoryMethod.sharp;

import creational.factoryMethod.matcha.Controller;
import creational.factoryMethod.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
