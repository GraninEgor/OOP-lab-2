package Actions;

import Common.Element;
import Ingredients.Ingredient;

public class Boil extends Action {
    public Boil(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String getDescription() {
        if(ingredient.getDescription().equals("Вода")){
            return "Вскипяченная вода";
        }
        return ingredient.getDescription() + " " + "Вкипитили";
    }
}
