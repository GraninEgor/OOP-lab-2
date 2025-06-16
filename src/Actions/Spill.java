package Actions;

import Common.Element;
import Ingredients.Ingredient;

public class Spill extends Action {
    public Spill(Ingredient ingredient, Ingredient secondIngredient) {
        super(ingredient);
    }

    @Override
    public String getDescription() {
        if(ingredient.getDescription().equals("Вскипяченная вода") && ingredient.getDescription().equals("Перемолотое зерно")){
            return "Эспрессо";
        }
        return ingredient.getDescription() + " " + "Пролили";
    }
}
