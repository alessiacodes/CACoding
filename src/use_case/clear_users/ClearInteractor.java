package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;
import java.util.List;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface dai;
    final ClearOutputBoundary outputBoundary;

    public ClearInteractor(ClearUserDataAccessInterface dai, ClearOutputBoundary outputBoundary){
        this.dai = dai;
        this.outputBoundary = outputBoundary;

    }
    @Override
    public void execute() {
        List<String> namesCleared = new ArrayList<>(dai.clearAndReturnNames());
    }
}
