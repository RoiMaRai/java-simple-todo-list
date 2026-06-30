import java.util.ArrayList;

public class ToDoHandler {
    private final ArrayList<ToDo> toDoContainer = new ArrayList<>();

    public void addItem(String itemName, String itemDescription, boolean alreadyDone){
        if (itemName!=null && itemDescription!=null){
            ToDo todo = new ToDo(itemName,itemDescription,alreadyDone);
            toDoContainer.add(todo);
        }
    }

    public void addItem(String itemName, String itemDescription){
        addItem(itemName, itemDescription, false);
    }

    private void printSeparator(String character, int amount){
        System.out.println(character.repeat(amount));
    }

    public void removeItemFromName(String itemName){
        toDoContainer.removeIf(todo -> todo.getName().equals(itemName));
    }

    public void removeItemFromUUID(String uuid){
        toDoContainer.removeIf(toDo -> toDo.getUuid().equals(uuid));
    }

    public void printToDoInfo(ToDo toDo){
        System.out.println("Item Name: " + toDo.getName());
        System.out.println("Description: " + toDo.getDescription());
        System.out.println("Status: " + (toDo.isAlreadyDone() ? "☒" : "☐"));
    }

    public void showToDoList(){
        printSeparator("/",25);
        for (int i=0; i < toDoContainer.size(); i++){
            ToDo todo = toDoContainer.get(i);
            if (i!=0){
                printSeparator("-",25);
            }
            printToDoInfo(todo);
        }
        printSeparator("/",25);
    }
}
