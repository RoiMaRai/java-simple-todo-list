import java.util.ArrayList;

public class ToDoHandler {
    private final ArrayList<ToDo> toDoContainer = new ArrayList<>();

    public void addItem(String itemName, String itemDescription, boolean alreadyDone){
        if (itemName!=null && itemDescription!=null){
            ToDo todo = new ToDo(itemName,itemDescription,alreadyDone);
            toDoContainer.add(todo);
        }
    }

    public void removeItemFromName(String itemName){
        toDoContainer.removeIf(todo -> todo.getName().equals(itemName));
    }

    public void removeItemFromUUID(String uuid){
        toDoContainer.removeIf(toDo -> toDo.getUuid().equals(uuid));
    }


}
