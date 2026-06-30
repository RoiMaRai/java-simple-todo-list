package mainClassPackage;

import java.io.*;

public class WriteReadHandler {
    public void save(ToDoHandler toDoHandler) {
        try {
            FileWriter file = new FileWriter("todolistsave.txt");
            file.write("Test");
            file.close();
        }catch(IOException error){
            System.out.println(error.getMessage());
        }
    }
}
