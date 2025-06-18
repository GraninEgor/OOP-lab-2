package Actions;

import Common.Element;
import Ingredients.Ingredient;

public class Beat extends Action {
    public Beat(Element ingredient) {
        super(ingredient);
    }

    @Override
    public String getDescription() {
        if(ingredient.getDescription().equals("Вскипяченное молоко")){
            return "Пенка";
        }
        return ingredient.getDescription() + " " + "Взбито";
    }
}
