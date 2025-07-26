package Common;

import Managers.*;

import java.util.Scanner;

public class Controller {
    private final Scanner scanner = new Scanner(System.in);
    private final Manager createManager;
    private final Manager readManager;
    private final Manager updateManager;
    private final Manager deleteManager;

    public void start() {
        while (true) {
            showMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    createManager.execute();
                    break;
                case 2:
                    readManager.execute();
                    break;
                case 3:
                    updateManager.execute();
                    break;
                case 4:
                    deleteManager.execute();
                    break;
                case 0:
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("Wrong choice. Try again.");
            }

            System.out.println();
        }
    }

    private void showMenu() {
        System.out.println("===== Меню CRUD =====");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("0. Exit");
        System.out.print("Select an action: ");
    }

    private int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter the number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public Controller(Manager createManager, Manager deleteManager, Manager updateManager, Manager readManager) {
        this.createManager = createManager;
        this.deleteManager = deleteManager;
        this.updateManager = updateManager;
        this.readManager = readManager;
    }
}
