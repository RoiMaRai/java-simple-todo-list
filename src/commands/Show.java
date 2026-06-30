package commands;

import mainClassPackage.CommandHashmapHandler;
import mainClassPackage.ToDoHandler;

import java.util.HashMap;
import java.util.Scanner;

public class Show implements Command {
    private final ToDoHandler toDoHandler;
    private String callName = "show";
    CommandHashmapHandler commandHashmapHandler = new CommandHashmapHandler();

    public Show(ToDoHandler toDoHandler, HashMap<String,Command> hashMap){
        this.toDoHandler = toDoHandler;
        commandHashmapHandler.addToHashmap(hashMap,getCallName(),this);
    }
    Scanner scanner = new Scanner(System.in);

    public String getCallName() {
        return callName;
    }

    public void execute(){
        toDoHandler.showToDoList();
    }
}
