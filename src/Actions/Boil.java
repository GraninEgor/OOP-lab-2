package Actions;

import Common.Element;
import Ingredients.Ingredient;

public class Boil extends Action {
    public Boil(Element ingredient) {
        super(ingredient);
    }

    @Override
    public String getDescription() {
        return ingredient.getDescription() + " " + "Boiled";
    }
}
