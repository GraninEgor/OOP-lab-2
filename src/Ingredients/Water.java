package Ingredients;

public class Water extends Ingredient {
    public Water(String description, int netto) {
        super(description, netto);
    }

    @Override
    protected void print(){
        System.out.println("===== Меню действий =====");
        System.out.println("1. Добавить");
        System.out.println("2. Вскипятить");
        System.out.print("Выберите действие: ");
    }
}

