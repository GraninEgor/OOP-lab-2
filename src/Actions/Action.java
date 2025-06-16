package Actions;
import Common.Element;
import Ingredients.Ingredient;

public abstract class Action implements Element {

    Ingredient ingredient;

    protected void execute(){

    }


    public Action(Ingredient ingredient){
        this.ingredient = ingredient;

    }
}
