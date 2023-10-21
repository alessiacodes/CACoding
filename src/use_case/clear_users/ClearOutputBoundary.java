package use_case.clear_users;

// TODO done, but check

import use_case.login.LoginOutputData;

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData response);

    void prepareFailView(String error);
}
