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
        int level = 0;
        System.out.println("-".repeat(level) + " " + current.getDescription());
        print(current, level);

    }

    private void print(Element current, int level){
        if(current == null){
            return;
        }
        if(current instanceof Add){
            System.out.println("-".repeat(level) + " " + current.getIngredient().getDescription());
            print(current.getIngredient(),level+1);
            for(Element addIngredient : ((Add) current).ingredients){
                System.out.println("-".repeat(level) + " " + addIngredient.getDescription());
                print(addIngredient,level+1);
            }
        }
        else if(current instanceof ActionWithMany){
            System.out.println("-".repeat(level) + " " + ((ActionWithMany) current).secondIngredient.getDescription());
            print(((ActionWithMany) current).ingredient,level+1);
            print(((ActionWithMany) current).secondIngredient,level+1);
        }
        else{
            System.out.println("-".repeat(level) + " " + current.getDescription());
            print(current.getIngredient(),level+1);
        }
    }
}
