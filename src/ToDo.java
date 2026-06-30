import java.util.UUID;

public class ToDo {
    private String name;
    private String description;
    private boolean alreadyDone;
    private final String uuid;

    ToDo(String name, String description, boolean alreadyDone){
        this.name = name;
        this.description = description;
        this.alreadyDone = alreadyDone;
        this.uuid = UUID.randomUUID().toString();
    }

    // Get

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAlreadyDone(){
        return alreadyDone;
    }

    public  String getUuid(){
        return uuid;
    }

    // Set

    public void setName(String newToDo){
        if (newToDo==null){
            return;
        }
        name = newToDo;
    }

    public void setDescription(String newDescription) {
        if (newDescription==null){
            return;
        }
        description = newDescription;
    }

    public void setAlreadyDone(boolean newAlreadyDone){
        alreadyDone = newAlreadyDone;
    }

}
