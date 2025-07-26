package Actions;

import Common.Element;

public class Mix extends Action {
    public Mix(Element ingredient) {
        super(ingredient);
    }

    @Override
    public String getDescription() {
        return ingredient.getDescription() + " " + "Mixed";
    }
}
