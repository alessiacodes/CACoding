package use_case.clear_users;

// TODO done, but check
import java.util.List;

public class ClearOutputData {
    private final List<String> namesList;

    public ClearOutputData (List<String> names){
        this.namesList = names;
    }

    public List<String> getNamesList() {return namesList;}

}
