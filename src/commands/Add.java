package commands;

import mainClassPackage.CommandHashmapHandler;
import mainClassPackage.ToDoHandler;

import java.util.HashMap;
import java.util.Scanner;

public class Add implements Command {
    private final ToDoHandler toDoHandler;
    private String callName = "add";
    CommandHashmapHandler commandHashmapHandler = new CommandHashmapHandler();

    public Add(ToDoHandler toDoHandler, HashMap<String,Command> hashMap){
        this.toDoHandler = toDoHandler;
        commandHashmapHandler.addToHashmap(hashMap,getCallName(),this);
    }
    Scanner scanner = new Scanner(System.in);

    public String getCallName() {
        return callName;
    }

    public void execute(){
        System.out.println("Enter item name: (Leave blank to cancel)");
        String itemName = scanner.nextLine();
        System.out.println("Enter item description: (Leave blank to cancel)");
        String description = scanner.nextLine();
        toDoHandler.addItem(itemName,description);
    }
}
