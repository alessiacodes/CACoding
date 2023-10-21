package use_case.clear_users;

// TODO done, but check

import use_case.login.LoginOutputData;

public interface ClearOutputBoundary {
    void prepareSuccessView(LoginOutputData user);

    void prepareFailView(String error);
}
