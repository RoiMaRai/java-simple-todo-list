package mainClassPackage;

import commands.Command;

import java.util.HashMap;

public class Utility {
    public static final int STANDARD_SEPARATOR_WIDTH = 25;

    public void printSeparator(String character, int amount){
        System.out.println(character.repeat(amount));
    }

    public int toIndex(int displayNumber){
        return displayNumber - 1;
    }

    public int toDisplayNumber(int index){
        return index + 1;
    }
}
