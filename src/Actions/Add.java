package Actions;

import Common.Element;
import Ingredients.Ingredient;

public class Add extends Action {
    public Add(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String getDescription() {
        return ingredient.getDescription() + " " + "Добавлено";
    }
}
