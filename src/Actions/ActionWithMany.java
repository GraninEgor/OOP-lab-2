package Actions;

import Common.Element;

public class ActionWithMany extends Action {
    public Element secondIngredient;

    public ActionWithMany(Element ingredient) {
        super(ingredient);
    }

    @Override
    public String getDescription() {
        return "";
    }
}
