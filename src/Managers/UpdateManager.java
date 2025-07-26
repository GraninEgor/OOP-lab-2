package Managers;

import Actions.Add;
import Common.Element;
import Ingredients.Ingredient;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class UpdateManager extends Manager {

    public UpdateManager(ArrayList<Element> elements) {
        super(elements);
    }

    @Override
    public void execute() {
        System.out.println("===== Update Element =====");
        if (elements.isEmpty()) {
            System.out.println("Element list is empty. Nothing to update.");
            return;
        }

        System.out.println("Select an element to update (or -1 to cancel):");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(i + " - " + elements.get(i).getDescription());
        }
        System.out.print("Your choice: ");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == -1) {
                System.out.println("Update cancelled.");
                return;
            }

            if (choice < 0 || choice >= elements.size()) {
                System.out.println("Invalid choice. Element with this number does not exist.");
                return;
            }

            Element elementToUpdate = elements.get(choice);
            System.out.println("Selected: " + elementToUpdate.getDescription());

            if (elementToUpdate instanceof Ingredient) {
                System.out.print("Enter new netto weight for " + elementToUpdate.getDescription() + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer for netto weight:");
                    scanner.next();
                }
                int newNetto = scanner.nextInt();
                scanner.nextLine();

                ((Ingredient) elementToUpdate).setNetto(newNetto);
                System.out.println(elementToUpdate.getDescription() + " netto weight updated to " + newNetto + ".");
            } else if (elementToUpdate instanceof Add) {
                System.out.println("This is an 'Add' action. You can modify its added ingredients.");
                Add addAction = (Add) elementToUpdate;

                while (true) {
                    System.out.println("\nCurrent added ingredients for '" + addAction.getDescription() + "':");
                    for (int i = 0; i < addAction.ingredients.size(); i++) {
                        System.out.println(i + " - " + addAction.ingredients.get(i).getDescription() + " (Net weight: " + addAction.ingredients.get(i).getNetto() + ")");
                    }
                    System.out.println("\nChoose an option:");
                    System.out.println("1. Add another ingredient");
                    System.out.println("2. Remove an ingredient");
                    System.out.println("0. Finish modifying ingredients");
                    System.out.print("Your choice: ");

                    int addChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (addChoice == 0) {
                        break;
                    }

                    switch (addChoice) {
                        case 1:
                            System.out.println("Select an ingredient to add:");
                            for (int i = 0; i < elements.size(); i++) {
                                System.out.println(i + " - " + elements.get(i).getDescription() );
                            }
                            System.out.print("Enter ingredient number to add: ");
                            int ingredientToAddIndex = scanner.nextInt();
                            scanner.nextLine();

                            if (ingredientToAddIndex >= 0 && ingredientToAddIndex < elements.size()) {
                                Element elementToAdd = elements.get(ingredientToAddIndex);

                                 if (elementToAdd instanceof Ingredient && elementToAdd.getNetto() == 0) {
                                    System.out.print("Enter netto weight for " + elementToAdd.getDescription() + " (for addition): ");
                                    while (!scanner.hasNextInt()) {
                                        System.out.println("Invalid input. Please enter an integer:");
                                        scanner.next();
                                    }
                                    int newNettoForAddedIngredient = scanner.nextInt();
                                    scanner.nextLine();
                                    ((Ingredient) elementToAdd).setNetto(newNettoForAddedIngredient);
                                    System.out.println(elementToAdd.getDescription() + " netto set to " + newNettoForAddedIngredient + ".");
                                }

                                addAction.ingredients.add(elementToAdd);
                                System.out.println(elementToAdd.getDescription() + " added to " + addAction.getDescription() + ".");
                            } else {
                                System.out.println("Invalid ingredient number.");
                            }
                            break;
                        case 2:
                            if (addAction.ingredients.isEmpty()) {
                                System.out.println("No ingredients to remove.");
                                break;
                            }
                            System.out.print("Enter the number of the ingredient to remove: ");
                            int ingredientToRemoveIndex = scanner.nextInt();
                            scanner.nextLine();

                            if (ingredientToRemoveIndex >= 0 && ingredientToRemoveIndex < addAction.ingredients.size()) {
                                Element removed = addAction.ingredients.remove(ingredientToRemoveIndex);
                                System.out.println(removed.getDescription() + " removed.");
                            } else {
                                System.out.println("Invalid ingredient number to remove.");
                            }
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                }
            } else {
                System.out.println("This type of element (" + elementToUpdate.getClass().getSimpleName() + ") currently does not have specific update options.");
                System.out.println("Only Ingredient netto or Add action's constituent ingredients can be updated.");
            }

            System.out.println("Update complete for " + elementToUpdate.getDescription() + ".");

        } catch (InputMismatchException e) {
            System.out.println("Input error. Please enter a number.");
            scanner.nextLine();
        }
    }
}