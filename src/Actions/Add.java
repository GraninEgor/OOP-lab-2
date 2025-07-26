package Actions;

import Common.Element;

import java.util.ArrayList;
import java.util.List;

public class Add extends Action {
    public ArrayList<Element> ingredients;

    public Add(Element ingredient, ArrayList<Element> ingredients) {
        super(ingredient);
        this.ingredients = ingredients;
    }

    @Override
    public String getDescription() {
        String newDescription = ingredient.getDescription();
        for (Element ingredient : ingredients) {
            newDescription += " + " + ingredient.getDescription();
        }
        return newDescription;
    }

    @Override
    public int getNetto() {
        int netto = ingredient.getNetto();
        for (Element ingredient : ingredients) {
            netto += ingredient.getNetto();
        }
        return netto;
    }

    @Override
    public List<Element> getConstituentElements() {
        List<Element> allElements = new ArrayList<>();
        if (ingredient != null) {
            allElements.add(ingredient);
        }
        if (this.ingredients != null) {
            allElements.addAll(this.ingredients);
        }
        return allElements;
    }

    @Override
    public void setNetto(int netto) {
        System.out.println("Cannot directly set netto for an 'Add' action. Update its constituent ingredients instead.");
    }
}
