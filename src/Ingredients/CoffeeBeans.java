package Ingredients;

public class CoffeeBeans  extends Ingredient {

    @Override
    public String getDescription(){
        return "Кофейное зерно";
    }

    @Override
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
}
