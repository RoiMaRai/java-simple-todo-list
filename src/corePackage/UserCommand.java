package corePackage;

import java.util.Scanner;

public class UserCommand {
    private Scanner scanner = new Scanner(System.in);
    Utility utility = new Utility();

    private void showCommand(){
        utility.printSeparator("/", Utility.STANDARD_SEPARATOR_WIDTH);

    }

    public void start(){
        while (true){
            showCommand();
            String command = scanner.nextLine();
        }
    }

}
