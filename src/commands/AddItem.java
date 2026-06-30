package commands;

import corePackage.ToDoHandler;

public class AddItem implements Command {
    private String callName;
    ToDoHandler toDoHandler = new ToDoHandler();

    public String getCallName() {
        return callName;
    }

    public void execute(){
        //ToDo toDo = new ToDo("");
    }
}
