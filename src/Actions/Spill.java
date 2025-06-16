package Actions;

import Common.Element;
import Ingredients.Ingredient;

public class Spill extends ActionWithMany {
    public Spill(Element ingredient, Element secondIngredient) {
        super(ingredient);
        this.secondIngredient = secondIngredient;
    }
    @Override
    public boolean haveMany(){
        return true;
    }
    @Override
    public String getDescription() {
        if(ingredient.getDescription().equals("Вскипяченная вода") && secondIngredient.getDescription().equals("Перемолотые кофейные зерна")){
            return "Эспрессо";
        }
        return ingredient.getDescription() + " " + "Пролили";
    }
}
