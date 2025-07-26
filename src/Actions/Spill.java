package Actions;

import Common.Element;

public class Spill extends ActionWithMany {
    public Spill(Element ingredient, Element secondIngredient) {
        super(ingredient);
        this.secondIngredient = secondIngredient;
    }


    @Override
    public int getNetto() {
        return ingredient.getNetto() + secondIngredient.getNetto();
    }

    @Override
    public void setNetto(int netto) {
        System.out.println("Cannot directly set netto for a 'Spill' action. Update its constituent ingredients instead.");
    }
}
