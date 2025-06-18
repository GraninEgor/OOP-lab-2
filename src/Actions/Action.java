package Actions;
import Common.Element;
import Ingredients.Ingredient;

public abstract class Action implements Element {
    public boolean haveMany(){
        return false;
    }
    public Element ingredient;

    private Element execute(){
        return ingredient;
    }


    public Action(Element ingredient){
        this.ingredient = ingredient;

    }

    @Override
    public Element getIngredient() {
        return execute();
    }

    @Override
    public int getNetto(){
        return ingredient.getNetto();
    }
}
