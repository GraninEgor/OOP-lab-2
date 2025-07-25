package Actions;
import Common.Element;

public abstract class Action implements Element {
    protected Element ingredient;

    public Action(Element ingredient){
        this.ingredient = ingredient;
    }

    public Element getIngredient() {
        return ingredient;
    }

    @Override
    public int getNetto(){
        return ingredient.getNetto();
    }

}
