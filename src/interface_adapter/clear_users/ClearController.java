package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

// TODO done but check if right
public class ClearController {
    final ClearInputBoundary inputBoundary;

    public ClearController(ClearInputBoundary inputBoundary){
        this.inputBoundary = inputBoundary;
    }

    public void execute(){
        inputBoundary.execute();
    }
}
