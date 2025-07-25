package Ingredients;

import Common.Element;

import java.util.Objects;
import java.util.Scanner;

public abstract class Ingredient implements Element {
    protected Scanner scanner;

    private String description;
    private int netto = 0;

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setNetto() {
        System.out.println("Введите нетто: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число: ");
            scanner.next();
        }
        this.netto = scanner.nextInt();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getNetto() {
        return netto;
    }

    public Ingredient(String description) {
        setDescription(description);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return netto == that.netto && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, netto);
    }
}
