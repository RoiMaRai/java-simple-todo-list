package commands;

import mainClassPackage.CommandHashmapHandler;
import mainClassPackage.ToDoHandler;
import mainClassPackage.UserCommand;

import java.util.HashMap;
import java.util.Scanner;

public class AddItem implements Command {
    private final ToDoHandler toDoHandler;
    private String callName = "AddItem";
    CommandHashmapHandler commandHashmapHandler = new CommandHashmapHandler();

    public AddItem(ToDoHandler toDoHandler, HashMap<String,Command> hashMap){
        this.toDoHandler = toDoHandler;
        commandHashmapHandler.addToHashmap(hashMap,getCallName(),this);
    }
    Scanner scanner = new Scanner(System.in);

    public String getCallName() {
        return callName;
    }

    public void execute(){
        System.out.println("Enter item name:");
        String itemName = scanner.nextLine();
        System.out.println("Enter item description:");
        String description = scanner.nextLine();
        toDoHandler.addItem(itemName,description);
    }
}
