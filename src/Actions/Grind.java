package Actions;

import Common.Element;
import Ingredients.Ingredient;

public class Grind extends Action {
    public Grind(Element ingredient) {
        super(ingredient);
    }

    @Override
    public String getDescription() {
        if(ingredient.getDescription().equals("Кофейное зерно")){
            return "Перемолотые кофейные зерна";
        }
        return ingredient.getDescription() + " " + "Перемололи";
    }

}
