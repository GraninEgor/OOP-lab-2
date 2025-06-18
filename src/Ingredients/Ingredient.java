package Ingredients;

import Common.Element;

public abstract class Ingredient implements Element {
    private String description;
    private int netto;

    public void setNetto(int netto){
        this.netto = netto;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Ingredient(String description, int netto){
        this.description = description;
        this.netto = netto;
    }

    @Override
    public Element getIngredient() {
        return null;
    }

    @Override
    public int getNetto(){
        return netto;
    }
}
