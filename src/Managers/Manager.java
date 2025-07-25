package Managers;

import Common.Element;
import Ingredients.Ingredient;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Manager implements ManagerFunctionality {

    protected Scanner scanner = new Scanner(System.in);
    protected ArrayList<Element> ingredients;
    protected int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Пожалуйста, введите число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public Manager(ArrayList<Element> ingredients){
        this.ingredients = ingredients;
    }
}
