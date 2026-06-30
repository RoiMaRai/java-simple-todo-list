package mainClassPackage;

import commands.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserCommand {
    ToDoHandler toDoHandler = new ToDoHandler();
    private Scanner scanner = new Scanner(System.in);
    CommandHashmapHandler commandHashmapHandler = new CommandHashmapHandler();
    HashMap<String,Command> hashMap = new HashMap<>();

    /// Initializing command ///

    public UserCommand(){
        Add add = new Add(toDoHandler,hashMap);
        Remove remove = new Remove(toDoHandler,hashMap);
        Show show = new Show(toDoHandler,hashMap);
        Toggle toggle = new Toggle(toDoHandler,hashMap);
    }

    ////////////////////////////



    Utility utility = new Utility();

    private void showCommand(){
        utility.printSeparator("/", Utility.STANDARD_SEPARATOR_WIDTH);
        System.out.println("Command List");
        utility.printSeparator("-", Utility.STANDARD_SEPARATOR_WIDTH);

        for (Map.Entry<String,Command> entry : hashMap.entrySet()){
            System.out.println(entry.getKey());
        }

        utility.printSeparator("/", Utility.STANDARD_SEPARATOR_WIDTH);
    }

    public void start(){
        while (true){
            showCommand();
            String command = scanner.nextLine();
            Command cmd = hashMap.get(command);

            if (cmd!=null){
                cmd.execute();
            }
        }
    }

}
