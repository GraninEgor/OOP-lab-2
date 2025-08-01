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
        System.out.println("Choose what to delete");
        System.out.println("To exit, enter (-1)");
        for(int i =0;i<elements.size();i++){
            System.out.println(i + " - " + elements.get(i).getDescription());
        }
        choice = scanner.nextInt();
        if(choice == -1){
            return;
        }
        elements.remove(choice);
    }
}
