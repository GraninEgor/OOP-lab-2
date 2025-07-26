package Managers;


import Actions.*;
import Common.Element;
import Ingredients.Ingredient;

import java.util.ArrayList;

public class CreateManager extends Manager{

    public CreateManager(ArrayList<Element> elements) {
        super(elements);
    }

    @Override
    public void execute() {
        while (true) {
            Element temp;
            int choice;
            for(int i = 0;i<elements.size();i++){
                System.out.println(i + " - " + elements.get(i).getDescription() + " " + ((i>4) ? elements.get(i).getNetto() : ""));
            }
            choice = scanner.nextInt();
            if(choice == -1){
                return;
            }
            temp = elements.get(choice);
            if(temp instanceof Ingredient) {
                ((Ingredient) temp).setNetto();
            }
            System.out.println(temp.getDescription());
            showCreateMenu();
            choice = scanner.nextInt();

            Element newElement = null;
            switch (choice){
                case 1:
                    ArrayList<Element> elementsForAdd = new ArrayList<>();
                    Element tempAdd;
                    while(true){
                        System.out.println("Выыберите что добавить");
                        for(int i =0;i<elements.size();i++){
                            System.out.println(i + " - " + elements.get(i).getDescription()+ " " + ((i>4) ? elements.get(i).getNetto() : ""));
                        }
                        choice = scanner.nextInt();
                        if(choice == -1){
                            break;
                        }
                        tempAdd = elements.get(choice);
                        if(temp instanceof Ingredient) {
                            ((Ingredient) temp).setNetto();
                        }
                        elementsForAdd.add(tempAdd);
                    }
                    newElement = new Add(temp, elementsForAdd);
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
                    System.out.println("Choose what to put through");
                    for(int i =0;i<elements.size();i++){
                        if(elements.get(i).getDescription().contains("Перемолотые кофейные зерна")){
                            System.out.println(i + " - " + elements.get(i).getDescription()+ " " + elements.get(i).getNetto());
                        }
                    }
                    choice = scanner.nextInt();
                    newElement = new Spill(temp, elements.get(choice));
                    break;
                case 6:
                    newElement = new Beat(temp);
                    break;
            }
            elements.add(newElement);
        }
    }

    private void showCreateMenu() {
        System.out.println("===== Меню Создания =====");
        System.out.println("1. Add");
        System.out.println("2. Boid");
        System.out.println("3. Grind");
        System.out.println("4. Mix");
        System.out.println("5. Spill");
        System.out.println("6. Beat");
        System.out.print("Select an action: ");
    }


}
