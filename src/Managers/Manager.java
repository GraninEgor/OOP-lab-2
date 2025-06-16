package Managers;

import Ingredients.Ingredient;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Manager implements ManagerFunctionality {

    Scanner scanner = new Scanner(System.in);
    protected ArrayList<Ingredient> ingredients;
    protected int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Пожалуйста, введите число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public Manager(ArrayList<Ingredient> ingredients){
        this.ingredients = ingredients;
    }
}
