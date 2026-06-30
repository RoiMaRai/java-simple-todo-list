package corePackage;

import java.util.ArrayList;

public class ToDoHandler {
    private final ArrayList<ToDo> toDoContainer = new ArrayList<>();
    Utility utility = new Utility();

    ////////// ADD ////////////

    public void addItem(String itemName, String itemDescription, boolean alreadyDone){
        if (itemName!=null && itemDescription!=null){
            ToDo todo = new ToDo(itemName,itemDescription,alreadyDone);
            toDoContainer.add(todo);
        }
    }

    public void addItem(String itemName, String itemDescription){
        addItem(itemName, itemDescription, false);
    }

    //////////// REMOVE //////////////

    public void removeItemFromName(String itemName){
        toDoContainer.removeIf(todo -> todo.getName().equals(itemName));
    }

    public void removeItemFromUUID(String uuid){
        toDoContainer.removeIf(toDo -> toDo.getUuid().equals(uuid));
    }

    public void removeItemFromDisplayNumber(int displayNumber) {
        int index = utility.toIndex(displayNumber);
        if (index >= 0 && index < toDoContainer.size()){
            toDoContainer.remove(index);
        }
    }

    //////////// OUTPUT //////////////

    public void printToDoInfo(ToDo toDo){
        System.out.println("Name: " + toDo.getName());
        System.out.println("Description: " + toDo.getDescription());
        System.out.println("Status: " + (toDo.isAlreadyDone() ? "☒" : "☐"));
    }

    public void showToDoList(){
        utility.printSeparator("/", Utility.STANDARD_SEPARATOR_WIDTH);
        for (int i=0; i < toDoContainer.size(); i++){
            ToDo todo = toDoContainer.get(i);
            if (i!=0){
                utility.printSeparator("-", Utility.STANDARD_SEPARATOR_WIDTH);
            }
            System.out.println("#"+ utility.toDisplayNumber(i));
            printToDoInfo(todo);
        }
        utility.printSeparator("/", Utility.STANDARD_SEPARATOR_WIDTH);
    }


}
