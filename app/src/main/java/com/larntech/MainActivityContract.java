package com.larntech;

/**
 * Created by Richard Kamere on 10/17/2018.
 */

public interface MainActivityContract {

    interface View{
        void validateLogin();
        void loginSuccess();
        void loginError();
    }
    interface Presenter{
        void doLogin(String email,String Password);
    }
}
