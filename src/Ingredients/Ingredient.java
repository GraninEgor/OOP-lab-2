package Ingredients;

import Common.Element;

public abstract class Ingredient implements Element {
    private String description;
    private int netto;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    protected void print() {
        System.out.println("===== Меню действий =====");
        System.out.println("1. Добавить");
        System.out.println("2. Вскипятить");
        System.out.println("3. Перемолоть");
        System.out.println("4. Перемешать");
        System.out.println("5. Пролить");
        System.out.println("5. Взбить");
        System.out.print("Выберите действие: ");
    }

    public Ingredient(String description, int netto){
        this.description = description;
        this.netto = netto;
    }

    @Override
    public Element getIngredient() {
        return null;
    }
}
