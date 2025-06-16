package Actions;
import Common.Element;
import Ingredients.Ingredient;

public abstract class Action implements Element {

    public Element ingredient;

    protected void execute(){

    }


    public Action(Element ingredient){
        this.ingredient = ingredient;

    }

    @Override
    public Element getIngredient() {
        return ingredient;
    }
}
