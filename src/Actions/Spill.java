package Actions;

import Common.Element;
import Ingredients.Ingredient;

public class Spill extends Action {
    public Spill(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String getDescription() {
        return "";
    }
}
