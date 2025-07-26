package Actions;

import Common.Element;

import java.util.Collections;
import java.util.List;

public abstract class Action implements Element {
    protected Element ingredient;

    public Action(Element ingredient) {
        this.ingredient = ingredient;
    }

    public Element getIngredient() {
        return ingredient;
    }

    @Override
    public int getNetto() {
        return ingredient.getNetto();
    }

    @Override
    public void setNetto(int netto) {
        ingredient.setNetto(netto);
    }

    @Override
    public List<Element> getConstituentElements() {
        if (ingredient != null) {
            return List.of(ingredient);
        }
        return Collections.emptyList();
    }

}
