package Common;

import Ingredients.*;
import Managers.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private ArrayList<Element> ingredients = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    Manager createManager = new CreateManager(ingredients);
    Manager readManager = new ReadManager(ingredients);
    Manager updateManager = new UpdateManager(ingredients);
    Manager deleteManager = new DeleteManager(ingredients);

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
        System.out.print("Выберите ингредиент: ");
    }

    private int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Пожалуйста, введите число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }


    private void read() {
        System.out.println("Вы выбрали: Читать");
    }

    private void update() {
        System.out.println("Вы выбрали: Обновить");
    }

    private void delete() {
        System.out.println("Вы выбрали: Удалить");
    }



}
