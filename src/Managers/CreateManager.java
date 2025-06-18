package Managers;


import Actions.*;
import Common.Element;
import Ingredients.*;

import java.util.ArrayList;

public class CreateManager extends Manager{

    public CreateManager(ArrayList<Element> ingredients) {
        super(ingredients);
        ingredients.add(new CoffeeBeans("Кофейное зерно",100));
        ingredients.add(new Ice("Лёд",100));
        ingredients.add(new Milk("Молоко",100));
        ingredients.add(new Syrup("Сироп",100));
        ingredients.add(new Water("Вода",100));
    }

    @Override
    public void execute() {
        while (true) {
            Element temp;
            int choice;
            for(int i = 0;i<ingredients.size();i++){
                System.out.println(i + " - " + ingredients.get(i).getDescription());
            }
            choice = scanner.nextInt();
            if(choice == -1){
                return;
            }
            temp = ingredients.get(choice);
            System.out.println(temp.getDescription());
            showCreateMenu();
            choice = scanner.nextInt();

            Element newElement = null;
            switch (choice){
                case 1:
                    System.out.println("Выыберите что добавить");
                    for(int i =0;i<ingredients.size();i++){
                        System.out.println(i + " - " + ingredients.get(i).getDescription());
                    }
                    choice = scanner.nextInt();
                    newElement = new Add(temp, ingredients.get(choice));
                    break;
                case 2:
                    newElement = new Boil(temp);
                    break;
                case 3:
                    newElement = new Grind(temp);
                    break;
                case 4:
                    newElement = new Mix(temp);
                    break;
                case 5:
                    System.out.println("Выыберите через что пролить");
                    for(int i =0;i<ingredients.size();i++){
                        if(ingredients.get(i).getDescription().contains("Перемолотые кофейные зерна")){
                            System.out.println(i + " - " + ingredients.get(i).getDescription());
                        }
                    }
                    choice = scanner.nextInt();
                    newElement = new Spill(temp, ingredients.get(choice));
                    break;
                case 6:
                    newElement = new Beat(temp);
                    break;
            }
            ingredients.add(newElement);
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
