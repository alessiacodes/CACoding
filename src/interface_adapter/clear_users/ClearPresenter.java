package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ViewManagerModel viewManagerModel;
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel){
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;

    }


    @Override
    public void prepareSuccessView(ClearOutputData response) {
        ClearState state = clearViewModel.getState();
        state.setState(response.getNamesList());
        clearViewModel.setState(state);
        clearViewModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {
        System.out.println(error); //todo maybe fix if causes issues

    }
}
