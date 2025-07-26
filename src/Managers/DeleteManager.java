package Managers;

import Common.Element;

import java.util.ArrayList;

public class DeleteManager extends Manager {
    public DeleteManager(ArrayList<Element> elements) {
        super(elements);
    }

    @Override
    public void execute() {
        int choice;
        System.out.println("Выыберите что удалить");
        for(int i =0;i<elements.size();i++){
            System.out.println(i + " - " + elements.get(i).getDescription());
        }
        choice = scanner.nextInt();
        elements.remove(choice);
    }
}
