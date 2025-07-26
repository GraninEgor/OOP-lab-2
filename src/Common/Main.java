package Common;

import Ingredients.*;
import Managers.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Element> elements  = new ArrayList<>();
        elements.add(new CoffeeBeans());
        elements.add(new Ice());
        elements.add(new Milk());
        elements.add(new Syrup());
        elements.add(new Water());
        Manager createManager = new CreateManager(elements);
        Manager readManager = new ReadManager(elements);
        Manager updateManager = new UpdateManager(elements);
        Manager deleteManager = new DeleteManager(elements);
        Controller controller = new Controller(createManager,deleteManager,updateManager,readManager);
        controller.start();
    }
}
