package Managers;

import Actions.ActionWithMany;
import Actions.Add;
import Common.Element;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class ReadManager extends Manager {
    public ReadManager(ArrayList<Element> elements) {
        super(elements);
    }

    @Override
    public void execute() {
        System.out.println("===== View Element =====");
        if (elements.isEmpty()) {
            System.out.println("Element list is empty. Nothing to display.");
            return;
        }

        System.out.println("Select an element to view (or -1 to cancel):");
        for(int i = 0; i < elements.size(); i++){
            System.out.println(i + " - " + elements.get(i).getDescription() + " (Net weight: " + elements.get(i).getNetto() + ")");
        }
        System.out.print("Your choice: ");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == -1) {
                System.out.println("Viewing cancelled.");
                return;
            }

            if (choice < 0 || choice >= elements.size()) {
                System.out.println("Invalid choice. Element with this number does not exist.");
                return;
            }

            Element current = elements.get(choice);
            System.out.println("\n--- Element Details: '" + current.getDescription() + "' ---");
            System.out.println("Total Net Weight: " + current.getNetto());
            print(current, 0);
            System.out.println("----------------------------------------");
        } catch (InputMismatchException e) {
            System.out.println("Input error. Please enter a number.");
            scanner.nextLine();
        }
    }

    private void print(Element current, int level){
        String indent = "  ".repeat(level);
        if (level > 0) {
            System.out.println(indent + "- " + current.getDescription() + " (Net weight: " + current.getNetto() + ")");
        }

        List<Element> constituents = current.getConstituentElements();
        if (!constituents.isEmpty()) {
            if (level == 0) {
                System.out.println(indent + "  Composition:");
            }

            for (Element constituent : constituents) {
                print(constituent, level + 1);
            }
        }
    }
}