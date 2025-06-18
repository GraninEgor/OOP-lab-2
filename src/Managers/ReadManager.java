package Managers;

import Actions.ActionWithMany;
import Actions.Add;
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
        int level = 1;
        print(current, level);
    }

    private void print(Element current, int level){
        while(current != null){
            if(level == 0) {
                System.out.println(current.getDescription());
            }
            if (current instanceof ActionWithMany) {
                if(current instanceof Add){
                    System.out.println("-".repeat(level) + " " + ((Add) current).ingredient.getDescription());
                    for(Element ingredient : ((Add) current).ingredients){
                        System.out.println("-".repeat(level) + " " + ingredient.getDescription());
                    }
                    for(Element Iningredient : ((Add) current).ingredients){
                        print(Iningredient,level+1);
                    }
                    print(current.getIngredient(),level+1);
                }
                else{
                    ActionWithMany actionCurrent = (ActionWithMany) current;
                    System.out.println("-".repeat(level) + " " + actionCurrent.ingredient.getDescription());
                    System.out.println("-".repeat(level) + " " +actionCurrent.secondIngredient.getDescription());
                    print(actionCurrent.secondIngredient, level + 1);
                }
            } else {
                System.out.println("-".repeat(level) + " " +current.getDescription());
            }
            current = current.getIngredient();
        }
    }
}
