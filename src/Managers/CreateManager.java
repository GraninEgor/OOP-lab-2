package Managers;


import Actions.*;
import Common.Element;
import Ingredients.*;

import java.util.ArrayList;

public class CreateManager extends Manager{

    public CreateManager(ArrayList<Ingredient> ingredients) {
        super(ingredients);
        ingredients.add(new CoffeeBeans());
        ingredients.add(new Ice());
        ingredients.add(new Milk());
        ingredients.add(new Syrup());
        ingredients.add(new Water());
    }

    @Override
    public void execute() {
        while (true) {
            Ingredient temp;
            int choice;
            for(int i = 0;i<ingredients.size();i++){
                System.out.println(i + " - " + ingredients.get(i).getDescription());
            }
            choice = scanner.nextInt();
            temp = ingredients.get(choice);
            System.out.println(temp.getDescription());
            showCreateMenu();
            choice = scanner.nextInt();
            Element newElement;
            switch (choice){
                case 1:
                    newElement = new Add(temp);
                    break;
                case 2: newElement = new Boil(temp);
                    break;
                case 3: newElement = new Grind(temp);
                    break;
                case 4: newElement = new Mix(temp);
                    break;
                case 5: newElement = new Spill(temp);
                    break;
                case 6: newElement = new Beat(temp);
                    break;
            }
        }
    }

    private void showCreateMenu() {
        System.out.println("===== Меню Создания =====");
        System.out.println("1. Добавить");
        System.out.println("2. Вскипятить");
        System.out.println("3. Перемолоть");
        System.out.println("4. Перемешать");
        System.out.println("5. Пролить");
        System.out.println("6. Взбить");
        System.out.print("Выберите действие: ");
    }


}
