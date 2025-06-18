package Actions;

import Common.Element;

import java.util.ArrayList;

public class Add extends Action {
    public ArrayList<Element> ingredients;
    public Add(Element ingredient,ArrayList<Element> ingredients) {
        super(ingredient);
        this.ingredients = ingredients;
    }
    @Override
    public boolean haveMany(){
        return true;
    }

    @Override
    public String getDescription() {
        if((ingredients.get(0).getDescription().equals("Эспрессо") && ingredients.get(1).getDescription().equals("Пенка")) || (ingredients.get(0).getDescription().equals("Пенка") && ingredients.get(1).getDescription().equals("Эспрессо"))){
            return "Латте";
        }
        String newDescription = ingredient.getDescription();
        for(Element ingredient:ingredients){
            newDescription += " + " + ingredient.getDescription();
        }
        return newDescription;
    }

    @Override
    public int getNetto(){
        int netto = ingredient.getNetto();
        for(Element ingredient:ingredients){
            netto+= ingredient.getNetto();
        }
        return netto;
    }
}
