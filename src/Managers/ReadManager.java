package Managers;

import Common.Element;
import Ingredients.Ingredient;

import java.util.ArrayList;

public class ReadManager extends Manager {
    public ReadManager(ArrayList<Element> ingredients) {
        super(ingredients);
    }

    @Override
    public void execute() {
        System.out.println("Вывести:");
        int choice;
        for(int i = 0;i<ingredients.size();i++){
            System.out.println(i + " - " + ingredients.get(i).getDescription());
        }
        choice = scanner.nextInt();
        Element current = ingredients.get(choice);
        while(current != null){
            System.out.println(current.getDescription());
            current = current.getIngredient();
        }
    }
}
