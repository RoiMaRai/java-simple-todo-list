package core;

import commands.AddItem;
import commands.Command;

import java.util.HashMap;

public class CommandList {
    HashMap<String, Command> commandHashMap = new HashMap<>();
    public CommandList(ToDoHandler handler){
        // AddItem
        AddItem addItem = new AddItem();
        commandHashMap.put(addItem.getCallName(),addItem);
    }

    public void runCommand(String fullInput){
        String[] parts = fullInput.split(" ", 2);
        String commandName = parts[0];
        Command command = commandHashMap.get(commandName);
        String[] args = (parts.length > 1) ? parts[1].split(" ") : new String[0];

        if (command != null){
            command.execute();
        } else {
            System.out.println("Unknown command: " + commandName);
        }
    }
}
