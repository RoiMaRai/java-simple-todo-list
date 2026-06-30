package commands;

import mainClassPackage.CommandHashmapHandler;
import mainClassPackage.ToDoHandler;
import mainClassPackage.Utility;

import java.util.HashMap;
import java.util.Scanner;

public class Toggle implements Command {
    private final ToDoHandler toDoHandler;
    private String callName = "toggle";
    CommandHashmapHandler commandHashmapHandler = new CommandHashmapHandler();

    public Toggle(ToDoHandler toDoHandler, HashMap<String,Command> hashMap){
        this.toDoHandler = toDoHandler;
        commandHashmapHandler.addToHashmap(hashMap,getCallName(),this);
    }
    Scanner scanner = new Scanner(System.in);

    public String getCallName() {
        return callName;
    }

    public void execute(){
        toDoHandler.showToDoList();
        Utility.printSeparator("-", Utility.STANDARD_SEPARATOR_WIDTH);

        int numToToggle = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number to toggle status:");
        toDoHandler.toggleItemFromDisplayNumber(numToToggle);
    }
}
