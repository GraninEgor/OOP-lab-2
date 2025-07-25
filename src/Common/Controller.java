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
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }

            System.out.println();
        }
    }

    private void showMenu() {
        System.out.println("===== Меню CRUD =====");
        System.out.println("1. Создать");
        System.out.println("2. Читать");
        System.out.println("3. Обновить");
        System.out.println("4. Удалить");
        System.out.println("0. Выход");
        System.out.print("Выберите действие: ");
    }

    private int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Пожалуйста, введите число: ");
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
