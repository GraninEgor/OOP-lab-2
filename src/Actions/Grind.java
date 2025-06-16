package Actions;

import Common.Element;
import Ingredients.Ingredient;

public class Grind extends Action {
    public Grind(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String getDescription() {
        return "";
    }
}
