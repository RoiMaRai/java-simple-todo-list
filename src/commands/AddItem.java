package commands;

import core.ToDo;
import core.ToDoHandler;

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
