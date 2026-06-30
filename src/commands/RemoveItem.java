package commands;

import mainClassPackage.CommandHashmapHandler;
import mainClassPackage.ToDoHandler;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveItem implements Command {
    private String callName = "RemoveItem";
    ToDoHandler toDoHandler = new ToDoHandler();
    CommandHashmapHandler commandHashmapHandler = new CommandHashmapHandler();

    public RemoveItem(HashMap<String,Command> hashMap){
        commandHashmapHandler.addToHashmap(hashMap,getCallName(),this);
    }
    Scanner scanner = new Scanner(System.in);

    public String getCallName() {
        return callName;
    }

    public void execute(){
        //ToDo toDo = new ToDo("");
    }
}
