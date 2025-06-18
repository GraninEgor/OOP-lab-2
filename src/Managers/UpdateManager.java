package Managers;

import Common.Element;
import Ingredients.Ingredient;

import java.util.ArrayList;

public class UpdateManager extends Manager {

    CreateManager createManager;

    public UpdateManager(ArrayList<Element> ingredients, Manager createManager) {
        super(ingredients);
        this.createManager = (CreateManager) createManager;
    }

    @Override
    public void execute() {
        createManager.execute();
    }
}
