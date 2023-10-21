package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;
import java.util.List;

public class ClearState {
    private List<String> listnames = new ArrayList<>();

    public ClearState(ClearState copy){
        this.listnames = copy.listnames;
    }
    public ClearState(){
    }

    public List<String> getState(){
        return listnames;
    }

    public void setState(List<String> users){
        this.listnames = users;
    }
}
