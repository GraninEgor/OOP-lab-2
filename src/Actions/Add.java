package Actions;

import Common.Element;

public class Add extends ActionWithMany {
    public Add(Element ingredient,Element secondIngredient) {
        super(ingredient);
        this.secondIngredient = secondIngredient;
    }
    @Override
    public boolean haveMany(){
        return true;
    }

    @Override
    public String getDescription() {
        if((ingredient.getDescription().equals("Эспрессо") && secondIngredient.getDescription().equals("Пенка")) || (ingredient.getDescription().equals("Пенка") && secondIngredient.getDescription().equals("Эспрессо"))){
            return "Латте";
        }
        return ingredient.getDescription() + " " + "Добавлено к " + secondIngredient.getDescription();
    }

}
