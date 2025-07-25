package Common;

import Ingredients.*;
import Managers.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Element> elements  = new ArrayList<>();
        elements.add(new CoffeeBeans("Кофейное зерно",50));
        elements.add(new Ice("Лёд",30));
        elements.add(new Milk("Молоко",110));
        elements.add(new Syrup("Сироп",10));
        elements.add(new Water("Вода",3));
        Manager createManager = new CreateManager(elements);
        Manager readManager = new ReadManager(elements);
        Manager updateManager = new UpdateManager(elements, createManager);
        Manager deleteManager = new DeleteManager(elements);
        Controller controller = new Controller(createManager,deleteManager,updateManager,readManager);
        controller.start();
    }
}
