package Managers;

import Actions.ActionWithMany;
import Common.Element;
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
        print(current);
    }

    private void print(Element current){
        while(current != null){
            if (current instanceof ActionWithMany) {
                ActionWithMany actionCurrent = (ActionWithMany) current;
                System.out.println(actionCurrent.ingredient.getDescription());
                System.out.println(actionCurrent.secondIngredient.getDescription());
                print(actionCurrent.secondIngredient);
            } else {
                System.out.println(current.getDescription());
            }
            current = current.getIngredient();
        }
    }
}
