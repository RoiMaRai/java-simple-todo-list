package mainClassPackage;

import commands.Command;

import java.util.HashMap;

public class CommandHashmapHandler {
    public void addToHashmap(HashMap<String,Command> hashMap, String string, Command command){
        hashMap.put(string, command);
    }
}
