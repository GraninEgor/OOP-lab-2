package Actions;

import Common.Element;
import Ingredients.Ingredient;

public class Spill extends ActionWithMany {
    public Spill(Element ingredient, Element secondIngredient) {
        super(ingredient);
        this.secondIngredient = secondIngredient;
    }


    @Override
    public int getNetto(){
        return ingredient.getNetto() + secondIngredient.getNetto();
    }
}
