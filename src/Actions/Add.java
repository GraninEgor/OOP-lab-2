package Actions;

import Common.Element;

public class Add extends Action {
    public Add(Element ingredient) {
        super(ingredient);
    }
    @Override
    public boolean haveMany(){
        return true;
    }

    @Override
    public String getDescription() {
        return ingredient.getDescription() + " " + "Добавлено";
    }

}
