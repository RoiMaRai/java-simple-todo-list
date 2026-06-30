public class Main {
    public static void main(String[] args){
        ToDoHandler toDoHandler = new ToDoHandler();
        toDoHandler.addItem("Test1","TestDesc1");
        toDoHandler.addItem("Test2","TestDesc2");

        toDoHandler.showToDoList();
    }
}
