package commands;

import mainClassPackage.CommandHashmapHandler;
import mainClassPackage.ToDoHandler;

import java.util.HashMap;
import java.util.Scanner;

public class Remove implements Command {
    private final ToDoHandler toDoHandler;
    private String callName = "remove";
    CommandHashmapHandler commandHashmapHandler = new CommandHashmapHandler();

    public Remove(ToDoHandler toDoHandler, HashMap<String,Command> hashMap){
        this.toDoHandler = toDoHandler;
        commandHashmapHandler.addToHashmap(hashMap,getCallName(),this);
    }
    Scanner scanner = new Scanner(System.in);

    public String getCallName() {
        return callName;
    }

    public void execute(){
        System.out.println("Enter the number of item to remove: (Leave blank to cancel)");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();

        toDoHandler.removeItemFromDisplayNumber(itemNumber);
    }
}
