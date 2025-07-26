package Managers;

import Common.Element;
import Ingredients.Ingredient;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Manager implements ManagerFunctionality {
    protected Scanner scanner = new Scanner(System.in);
    protected ArrayList<Element> elements;

    public Manager(ArrayList<Element> elements){
        this.elements = elements;
    }
}
