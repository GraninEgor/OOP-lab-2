package Managers;

import Common.Element;
import Ingredients.Ingredient;

import java.util.ArrayList;

public class DeleteManager extends Manager {
    public DeleteManager(ArrayList<Element> ingredients) {
        super(ingredients);
    }

    @Override
    public void execute() {
        int choice;
        System.out.println("Выыберите что удалить");
        for(int i =0;i<ingredients.size();i++){
            System.out.println(i + " - " + ingredients.get(i).getDescription());
        }
        choice = scanner.nextInt();
        ingredients.remove(choice);
    }
}
