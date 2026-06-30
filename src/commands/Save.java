package commands;

import mainClassPackage.CommandHashmapHandler;
import mainClassPackage.ToDoHandler;

import java.util.HashMap;
import java.util.Scanner;

public class Save implements Command {
    private final ToDoHandler toDoHandler;
    private String callName = "save";
    CommandHashmapHandler commandHashmapHandler = new CommandHashmapHandler();

    public Save(ToDoHandler toDoHandler, HashMap<String,Command> hashMap){
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
